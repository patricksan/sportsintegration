/*
 * Strava API v3
 * Strava API
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.quasas.sports.gen.client.api;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.quasas.sports.gen.client.model.StreamSet;

/**
 * API tests for StreamsApi
 */
@Ignore
public class StreamsApiTest {

    private final StreamsApi api = new StreamsApi();

    
    /**
     * Get Activity Streams
     *
     * Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSet response = api.getActivityStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
    /**
     * Get segment effort streams
     *
     * Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentEffortStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSet response = api.getSegmentEffortStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
    /**
     * Get Segment Streams
     *
     * Returns the given segment&#39;s streams. Requires read_all scope for private segments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSet response = api.getSegmentStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
}
