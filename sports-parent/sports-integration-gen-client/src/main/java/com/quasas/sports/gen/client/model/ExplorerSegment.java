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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ExplorerSegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class ExplorerSegment {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("climb_category")
  private Integer climbCategory = null;

  /**
   * The description for the category of the climb
   */
  public enum ClimbCategoryDescEnum {
    NC("NC"),
    
    _4("4"),
    
    _3("3"),
    
    _2("2"),
    
    _1("1"),
    
    HC("HC");

    private String value;

    ClimbCategoryDescEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClimbCategoryDescEnum fromValue(String text) {
      for (ClimbCategoryDescEnum b : ClimbCategoryDescEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("climb_category_desc")
  private ClimbCategoryDescEnum climbCategoryDesc = null;

  @JsonProperty("avg_grade")
  private Float avgGrade = null;

  @JsonProperty("start_latlng")
  private LatLng startLatlng = null;

  @JsonProperty("end_latlng")
  private LatLng endLatlng = null;

  @JsonProperty("elev_difference")
  private Float elevDifference = null;

  @JsonProperty("distance")
  private Float distance = null;

  @JsonProperty("points")
  private String points = null;

  public ExplorerSegment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this segment
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of this segment")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ExplorerSegment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this segment
   * @return name
  **/
  @ApiModelProperty(value = "The name of this segment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExplorerSegment climbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
    return this;
  }

   /**
   * The category of the climb
   * minimum: 0
   * maximum: 5
   * @return climbCategory
  **/
  @ApiModelProperty(value = "The category of the climb")
  public Integer getClimbCategory() {
    return climbCategory;
  }

  public void setClimbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
  }

  public ExplorerSegment climbCategoryDesc(ClimbCategoryDescEnum climbCategoryDesc) {
    this.climbCategoryDesc = climbCategoryDesc;
    return this;
  }

   /**
   * The description for the category of the climb
   * @return climbCategoryDesc
  **/
  @ApiModelProperty(value = "The description for the category of the climb")
  public ClimbCategoryDescEnum getClimbCategoryDesc() {
    return climbCategoryDesc;
  }

  public void setClimbCategoryDesc(ClimbCategoryDescEnum climbCategoryDesc) {
    this.climbCategoryDesc = climbCategoryDesc;
  }

  public ExplorerSegment avgGrade(Float avgGrade) {
    this.avgGrade = avgGrade;
    return this;
  }

   /**
   * The segment&#39;s average grade, in percents
   * @return avgGrade
  **/
  @ApiModelProperty(value = "The segment's average grade, in percents")
  public Float getAvgGrade() {
    return avgGrade;
  }

  public void setAvgGrade(Float avgGrade) {
    this.avgGrade = avgGrade;
  }

  public ExplorerSegment startLatlng(LatLng startLatlng) {
    this.startLatlng = startLatlng;
    return this;
  }

   /**
   * Get startLatlng
   * @return startLatlng
  **/
  @ApiModelProperty(value = "")
  public LatLng getStartLatlng() {
    return startLatlng;
  }

  public void setStartLatlng(LatLng startLatlng) {
    this.startLatlng = startLatlng;
  }

  public ExplorerSegment endLatlng(LatLng endLatlng) {
    this.endLatlng = endLatlng;
    return this;
  }

   /**
   * Get endLatlng
   * @return endLatlng
  **/
  @ApiModelProperty(value = "")
  public LatLng getEndLatlng() {
    return endLatlng;
  }

  public void setEndLatlng(LatLng endLatlng) {
    this.endLatlng = endLatlng;
  }

  public ExplorerSegment elevDifference(Float elevDifference) {
    this.elevDifference = elevDifference;
    return this;
  }

   /**
   * The segments&#39;s evelation difference, in meters
   * @return elevDifference
  **/
  @ApiModelProperty(value = "The segments's evelation difference, in meters")
  public Float getElevDifference() {
    return elevDifference;
  }

  public void setElevDifference(Float elevDifference) {
    this.elevDifference = elevDifference;
  }

  public ExplorerSegment distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The segment&#39;s distance, in meters
   * @return distance
  **/
  @ApiModelProperty(value = "The segment's distance, in meters")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public ExplorerSegment points(String points) {
    this.points = points;
    return this;
  }

   /**
   * The polyline of the segment
   * @return points
  **/
  @ApiModelProperty(value = "The polyline of the segment")
  public String getPoints() {
    return points;
  }

  public void setPoints(String points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplorerSegment explorerSegment = (ExplorerSegment) o;
    return Objects.equals(this.id, explorerSegment.id) &&
        Objects.equals(this.name, explorerSegment.name) &&
        Objects.equals(this.climbCategory, explorerSegment.climbCategory) &&
        Objects.equals(this.climbCategoryDesc, explorerSegment.climbCategoryDesc) &&
        Objects.equals(this.avgGrade, explorerSegment.avgGrade) &&
        Objects.equals(this.startLatlng, explorerSegment.startLatlng) &&
        Objects.equals(this.endLatlng, explorerSegment.endLatlng) &&
        Objects.equals(this.elevDifference, explorerSegment.elevDifference) &&
        Objects.equals(this.distance, explorerSegment.distance) &&
        Objects.equals(this.points, explorerSegment.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, climbCategory, climbCategoryDesc, avgGrade, startLatlng, endLatlng, elevDifference, distance, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplorerSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    climbCategory: ").append(toIndentedString(climbCategory)).append("\n");
    sb.append("    climbCategoryDesc: ").append(toIndentedString(climbCategoryDesc)).append("\n");
    sb.append("    avgGrade: ").append(toIndentedString(avgGrade)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    elevDifference: ").append(toIndentedString(elevDifference)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

