package com.quasas.sports.boot.integration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.quasas.sports.boot.entity.Activity;
import com.quasas.sports.boot.exception.SportsApplicationException;
import com.quasas.sports.boot.service.ActivityService;
import com.quasas.sports.gen.client.invoker.ApiClient;
/**
 * This class is the integration initializer class to start schedeuled tasks to integrate with client api
 * @author <a href="mailto:dev.mohammed.othman@gmail.com">Mohammed Othman</a>
 *
 */

@Component
public class SportsAppIntegrateInitializer {

	// adding logging support
	private static final Logger logger = LogManager.getLogger(SportsAppIntegrateInitializer.class);

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Autowired
	private ApiClient apiClient;

	@Autowired
	ActivityService activityService;

	/**
	 * Start Method to get current logged in Athlete activities 
	 * List of return activities from client api will be parsed  then saved to Database
	 * it can configured to change fixed delay and initial delay from properties file
	 */
	@Scheduled(fixedDelayString = "#{${strava.api.integration.delayTime}}", initialDelayString = "#{${strava.api.integration.initialTime}}")
	public void scheduleCurrentAthleteActivities() {

		logger.info("Scheduled Task for Getting Current Athlete Activities Started :: Execution Time - {}",
				dateTimeFormatter.format(LocalDateTime.now()));

		try {

			// Get List of Activities from API
			List<Activity> resultActivityList = activityService.getLoggedInAthleteActivities();

			if (resultActivityList != null && resultActivityList.size() > 0) {

				// Loop over list of result activities to save in DB
				for (Activity item : resultActivityList) {
					activityService.save(item);
				}
			} else
				logger.info(
						"Scheduled Task for Getting Current Athlete Activities No Data Returned :: Execution Time - {}",
						dateTimeFormatter.format(LocalDateTime.now()));

		} catch (SportsApplicationException e) {
			logger.error(
					"Scheduled Task for Getting Current Athlete Activities Error :: Execution Time - {} :: Error Details {}",
					dateTimeFormatter.format(LocalDateTime.now()), e.getMessage());
		}

		logger.info("Scheduled Task for Getting Current Athlete Activities End :: Execution Time - {}",
				dateTimeFormatter.format(LocalDateTime.now()));
	}

	/**
	 * This Method scheduled  to refresh access token every 1 Hour
	 * it can configured to change fixed delay and initial delay from properties file
	 */
	@Scheduled(fixedDelayString = "#{${strava.api.integration.refreshtoken.delayTime}}", initialDelayString = "#{${strava.api.integration.refreshtoken.initialTime}}")
	public void scheduleRefreshToken() {

		logger.info("Scheduled Task for Refresh Token Started :: Execution Time - {}",
				dateTimeFormatter.format(LocalDateTime.now()));

		try {
			// call refresh token method from API client
			apiClient.refreshToken();
		} catch (Exception ex) {
			logger.error("Scheduled Task for Getting Refresh Token :: Execution Time - {} :: Error Details {}",
					dateTimeFormatter.format(LocalDateTime.now()), ex.getMessage());
		}

		logger.info("Scheduled Task for Refresh Token Ended :: Execution Time - {}",
				dateTimeFormatter.format(LocalDateTime.now()));

	}

}
