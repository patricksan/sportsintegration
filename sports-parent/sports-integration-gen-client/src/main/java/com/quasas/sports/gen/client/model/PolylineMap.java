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
 * PolylineMap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class PolylineMap {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("polyline")
  private String polyline = null;

  @JsonProperty("summary_polyline")
  private String summaryPolyline = null;

  public PolylineMap id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the map
   * @return id
  **/
  @ApiModelProperty(value = "The identifier of the map")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PolylineMap polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * The polyline of the map
   * @return polyline
  **/
  @ApiModelProperty(value = "The polyline of the map")
  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  public PolylineMap summaryPolyline(String summaryPolyline) {
    this.summaryPolyline = summaryPolyline;
    return this;
  }

   /**
   * The summary polyline of the map
   * @return summaryPolyline
  **/
  @ApiModelProperty(value = "The summary polyline of the map")
  public String getSummaryPolyline() {
    return summaryPolyline;
  }

  public void setSummaryPolyline(String summaryPolyline) {
    this.summaryPolyline = summaryPolyline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolylineMap polylineMap = (PolylineMap) o;
    return Objects.equals(this.id, polylineMap.id) &&
        Objects.equals(this.polyline, polylineMap.polyline) &&
        Objects.equals(this.summaryPolyline, polylineMap.summaryPolyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, polyline, summaryPolyline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolylineMap {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    summaryPolyline: ").append(toIndentedString(summaryPolyline)).append("\n");
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

