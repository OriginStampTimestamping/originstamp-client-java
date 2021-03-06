/*
 * OriginStamp Client
 *
 * OpenAPI spec version: 3.0
 * OriginStamp Documentation: https://docs.originstamp.com
 * Contact: mail@originstamp.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


package com.originstamp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.originstamp.model.TimestampRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request object for bulk timestamping request.
 */
@ApiModel(description = "Request object for bulk timestamping request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-18T14:06:09.411+01:00")
public class TimestampBulkRequest {
  @SerializedName("timestamps")
  private List<TimestampRequest> timestamps = new ArrayList<>();

  public TimestampBulkRequest timestamps(List<TimestampRequest> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public TimestampBulkRequest addTimestampsItem(TimestampRequest timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Array of timestamp request DTOs which will be timestamped.
   * @return timestamps
  **/
  @ApiModelProperty(required = true, value = "Array of timestamp request DTOs which will be timestamped.")
  public List<TimestampRequest> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<TimestampRequest> timestamps) {
    this.timestamps = timestamps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimestampBulkRequest timestampBulkRequest = (TimestampBulkRequest) o;
    return Objects.equals(this.timestamps, timestampBulkRequest.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampBulkRequest {\n");
    
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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

