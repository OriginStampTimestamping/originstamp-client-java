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
 * DTO for the timestamp data.
 */
@ApiModel(description = "DTO for the timestamp data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-18T14:06:09.411+01:00")
public class TimestampData {
  @SerializedName("currency_id")
  private Integer currencyId = null;

  @SerializedName("private_key")
  private String privateKey = null;

  @SerializedName("seed_id")
  private String seedId = null;

  @SerializedName("submit_status")
  private Long submitStatus = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("transaction")
  private String transaction = null;

  public TimestampData currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * 0: Bitcoin
   * @return currencyId
  **/
  @ApiModelProperty(value = "0: Bitcoin")
  public Integer getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }

  public TimestampData privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The private key represents the top hash in the Merkle Tree (see https://en.wikipedia.org/wiki/Merkle_tree ) or the hash of all hashes in the transaction.
   * @return privateKey
  **/
  @ApiModelProperty(value = "The private key represents the top hash in the Merkle Tree (see https://en.wikipedia.org/wiki/Merkle_tree ) or the hash of all hashes in the transaction.")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public TimestampData seedId(String seedId) {
    this.seedId = seedId;
    return this;
  }

   /**
   * ID of associated seed which can be used to request separate seed information.
   * @return seedId
  **/
  @ApiModelProperty(value = "ID of associated seed which can be used to request separate seed information.")
  public String getSeedId() {
    return seedId;
  }

  public void setSeedId(String seedId) {
    this.seedId = seedId;
  }

  public TimestampData submitStatus(Long submitStatus) {
    this.submitStatus = submitStatus;
    return this;
  }

   /**
   * The submit status of the hash:   0: the hash was not broadcasted yet  1: the hash was included into a transaction and broadcasted to the network, but not included into a block  2: the transaction was included into the latest block  3: the timestamp for your hash was successfully created.
   * @return submitStatus
  **/
  @ApiModelProperty(value = "The submit status of the hash:   0: the hash was not broadcasted yet  1: the hash was included into a transaction and broadcasted to the network, but not included into a block  2: the transaction was included into the latest block  3: the timestamp for your hash was successfully created.")
  public Long getSubmitStatus() {
    return submitStatus;
  }

  public void setSubmitStatus(Long submitStatus) {
    this.submitStatus = submitStatus;
  }

  public TimestampData timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date is returned in the following format: [ms] since 1.1.1970 (unix epoch), timezone: UTC. This is a true timestamp.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The date is returned in the following format: [ms] since 1.1.1970 (unix epoch), timezone: UTC. This is a true timestamp.")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TimestampData transaction(String transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * If available: the transaction hash of the timestamp.
   * @return transaction
  **/
  @ApiModelProperty(value = "If available: the transaction hash of the timestamp.")
  public String getTransaction() {
    return transaction;
  }

  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimestampData timestampData = (TimestampData) o;
    return Objects.equals(this.currencyId, timestampData.currencyId) &&
        Objects.equals(this.privateKey, timestampData.privateKey) &&
        Objects.equals(this.seedId, timestampData.seedId) &&
        Objects.equals(this.submitStatus, timestampData.submitStatus) &&
        Objects.equals(this.timestamp, timestampData.timestamp) &&
        Objects.equals(this.transaction, timestampData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyId, privateKey, seedId, submitStatus, timestamp, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampData {\n");
    
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
    sb.append("    submitStatus: ").append(toIndentedString(submitStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

