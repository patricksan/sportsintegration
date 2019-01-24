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
 * PowerZoneRanges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class PowerZoneRanges {
  @JsonProperty("zones")
  private ZoneRanges zones = null;

  public PowerZoneRanges zones(ZoneRanges zones) {
    this.zones = zones;
    return this;
  }

   /**
   * Get zones
   * @return zones
  **/
  @ApiModelProperty(value = "")
  public ZoneRanges getZones() {
    return zones;
  }

  public void setZones(ZoneRanges zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerZoneRanges powerZoneRanges = (PowerZoneRanges) o;
    return Objects.equals(this.zones, powerZoneRanges.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerZoneRanges {\n");
    
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

