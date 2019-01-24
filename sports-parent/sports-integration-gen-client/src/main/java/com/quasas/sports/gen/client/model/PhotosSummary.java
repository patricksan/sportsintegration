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
 * PhotosSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class PhotosSummary {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("primary")
  private PhotosSummaryPrimary primary = null;

  public PhotosSummary count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of photos
   * @return count
  **/
  @ApiModelProperty(value = "The number of photos")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PhotosSummary primary(PhotosSummaryPrimary primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")
  public PhotosSummaryPrimary getPrimary() {
    return primary;
  }

  public void setPrimary(PhotosSummaryPrimary primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotosSummary photosSummary = (PhotosSummary) o;
    return Objects.equals(this.count, photosSummary.count) &&
        Objects.equals(this.primary, photosSummary.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, primary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotosSummary {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

