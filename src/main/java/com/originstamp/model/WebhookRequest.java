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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request object for a webhook request.
 */
@ApiModel(description = "Request object for a webhook request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-18T14:06:09.411+01:00")
public class WebhookRequest {
  @SerializedName("currency")
  private Integer currency = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("target")
  private String target = null;

  public WebhookRequest currency(Integer currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency ID for which the webhook should be executed. Possible values: 0: Bitcoin 1: Ethereum 2: AION 100: Südkurier
   * @return currency
  **/
  @ApiModelProperty(example = "0", value = "Currency ID for which the webhook should be executed. Possible values: 0: Bitcoin 1: Ethereum 2: AION 100: Südkurier")
  public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public WebhookRequest hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Hash (SHA-256 in HEX) for which a notification is requested.
   * @return hash
  **/
  @ApiModelProperty(example = "9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08", value = "Hash (SHA-256 in HEX) for which a notification is requested.")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public WebhookRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Target address to which a POST request should be executed.
   * @return target
  **/
  @ApiModelProperty(example = "https://originstamp.com/webhook", value = "Target address to which a POST request should be executed.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return Objects.equals(this.currency, webhookRequest.currency) &&
        Objects.equals(this.hash, webhookRequest.hash) &&
        Objects.equals(this.target, webhookRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, hash, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");

    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

