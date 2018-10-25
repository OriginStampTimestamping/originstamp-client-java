/*
 * OriginStamp Documentation
 * <br/>The following documentation describes the API v3 for OriginStamp. With this documentation you are able to try out the different requests and see the responses. For the authorization, add your API key to the Authorization header of your request.<br/><h2>Invoice</h2><p>The invoice is based on your individual usage. The following table illustrates the credits,that are billed in credits.</p><table><tr><th>Request Type</th><th>Condition</th><th>Credits</th><tr><th>Submission</th><th>create timestamp</th><th>1 Credit</th><tr><th>Submission</th><th>timestamp already exists</th><th>0.3 Credits</th><tr><th>Status</th><th>no timestamp information available</th><th>0.1 Credit</th><tr><th>Status</th><th>timestamp information</th><th>0.3 Credits</th><tr><th>Proof</th><th>no proof available</th><th>0.1 Credits</th><tr><th>Proof</th><th>merkle tree as proof</th><th>3 Credits</th><tr><th>Proof</th><th>seed as proof</th><th>3 Credits</th><tr><th>Proof</th><th>PDF Certificate</th><th>5 Credits</th><tr><th>Notification</th><th>webhook notification</th><th>1.5 Credits</th><tr><th>Notification</th><th>mail notification</th><th>5 Credits</th></table>
 *
 * OpenAPI spec version: 3.0
 * Contact: mail@originstamp.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * request object for proof request.
 */
@ApiModel(description = "request object for proof request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T14:37:55.412Z")
public class ProofRequest {
  @SerializedName("currency")
  private Integer currency = null;

  @SerializedName("hash_string")
  private String hashString = null;

  @SerializedName("proof_type")
  private Integer proofType = null;

  public ProofRequest currency(Integer currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 0: Bitcoin  1: Ethereum
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "0: Bitcoin  1: Ethereum")
  public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public ProofRequest hashString(String hashString) {
    this.hashString = hashString;
    return this;
  }

   /**
   * Hash in HEX representation. We allow the use of SHA-256. Note: We handle the hashes in lower-case.
   * @return hashString
  **/
  @ApiModelProperty(required = true, value = "Hash in HEX representation. We allow the use of SHA-256. Note: We handle the hashes in lower-case.")
  public String getHashString() {
    return hashString;
  }

  public void setHashString(String hashString) {
    this.hashString = hashString;
  }

  public ProofRequest proofType(Integer proofType) {
    this.proofType = proofType;
    return this;
  }

   /**
   * Specifies which type of file should be returned. Possible value(s):  0: proof with a seed file (txt) or proof with a merkle tree (xml)    Other formats will follow.
   * @return proofType
  **/
  @ApiModelProperty(required = true, value = "Specifies which type of file should be returned. Possible value(s):  0: proof with a seed file (txt) or proof with a merkle tree (xml)    Other formats will follow.")
  public Integer getProofType() {
    return proofType;
  }

  public void setProofType(Integer proofType) {
    this.proofType = proofType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProofRequest proofRequest = (ProofRequest) o;
    return Objects.equals(this.currency, proofRequest.currency) &&
        Objects.equals(this.hashString, proofRequest.hashString) &&
        Objects.equals(this.proofType, proofRequest.proofType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, hashString, proofType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofRequest {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hashString: ").append(toIndentedString(hashString)).append("\n");
    sb.append("    proofType: ").append(toIndentedString(proofType)).append("\n");
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

