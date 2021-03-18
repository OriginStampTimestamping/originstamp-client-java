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
 * Request object for proof request.
 */
@ApiModel(description = "Request object for proof request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-18T14:06:09.411+01:00")
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
   * 0: Bitcoin 1: Ethereum 2: AION 100: Südkurier
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "0: Bitcoin 1: Ethereum 2: AION 100: Südkurier")
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
   * Hash in HEX representation for which the proof should be created. We allow the use of SHA-256. Note: We handle the hashes in lower-case.
   * @return hashString
  **/
  @ApiModelProperty(example = "2c5d36be542f8f0e7345d77753a5d7ea61a443ba6a9a86bb060332ad56dba38e", required = true, value = "Hash in HEX representation for which the proof should be created. We allow the use of SHA-256. Note: We handle the hashes in lower-case.")
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
   * Specifies which type of file should be returned. Possible value(s):  0: proof with a seed file (txt) or proof with a merkle tree (xml) 1: proof with a PDF file   Other formats will follow.
   * @return proofType
  **/
  @ApiModelProperty(example = "0", required = true, value = "Specifies which type of file should be returned. Possible value(s):  0: proof with a seed file (txt) or proof with a merkle tree (xml) 1: proof with a PDF file   Other formats will follow.")
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

