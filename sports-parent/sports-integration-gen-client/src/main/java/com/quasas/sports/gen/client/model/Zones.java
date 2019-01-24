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


package com.quasas.sports.gen.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Zones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class Zones {
  @JsonProperty("heart_rate")
  private HeartRateZoneRanges heartRate = null;

  @JsonProperty("power")
  private PowerZoneRanges power = null;

  public Zones heartRate(HeartRateZoneRanges heartRate) {
    this.heartRate = heartRate;
    return this;
  }

   /**
   * Get heartRate
   * @return heartRate
  **/
  @ApiModelProperty(value = "")
  public HeartRateZoneRanges getHeartRate() {
    return heartRate;
  }

  public void setHeartRate(HeartRateZoneRanges heartRate) {
    this.heartRate = heartRate;
  }

  public Zones power(PowerZoneRanges power) {
    this.power = power;
    return this;
  }

   /**
   * Get power
   * @return power
  **/
  @ApiModelProperty(value = "")
  public PowerZoneRanges getPower() {
    return power;
  }

  public void setPower(PowerZoneRanges power) {
    this.power = power;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zones zones = (Zones) o;
    return Objects.equals(this.heartRate, zones.heartRate) &&
        Objects.equals(this.power, zones.power);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartRate, power);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zones {\n");
    
    sb.append("    heartRate: ").append(toIndentedString(heartRate)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

