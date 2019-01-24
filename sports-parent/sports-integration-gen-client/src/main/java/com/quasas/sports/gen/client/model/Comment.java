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

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T18:02:14.787+02:00")
public class Comment {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("athlete")
  private SummaryAthlete athlete = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  public Comment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this comment
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of this comment")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Comment activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The identifier of the activity this comment is related to
   * @return activityId
  **/
  @ApiModelProperty(value = "The identifier of the activity this comment is related to")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The content of the comment
   * @return text
  **/
  @ApiModelProperty(value = "The content of the comment")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Comment athlete(SummaryAthlete athlete) {
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @ApiModelProperty(value = "")
  public SummaryAthlete getAthlete() {
    return athlete;
  }

  public void setAthlete(SummaryAthlete athlete) {
    this.athlete = athlete;
  }

  public Comment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which this comment was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time at which this comment was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.activityId, comment.activityId) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.athlete, comment.athlete) &&
        Objects.equals(this.createdAt, comment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, text, athlete, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

