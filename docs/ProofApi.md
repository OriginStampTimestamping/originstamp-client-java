# ProofApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProofUsingPOST**](ProofApi.md#getProofUsingPOST) | **POST** /v3/timestamp/proof | Proof


<a name="getProofUsingPOST"></a>
# **getProofUsingPOST**
> ResponseEntity getProofUsingPOST(authorization, proofRequest)

Proof

This request can be used to proof a submission of a hash. This interface is required to request the evidence. With the help of this proof the verification of a timestamp independent from OriginStamp is necessary. A guide for the verification can be found &lt;a href&#x3D;\&quot;https://github.com/OriginStampTimestamping/originstamp-verification\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; .Usually, the proof should be requested for each transferred hash and kept with the timestamped data so that an independent verification of the timestamp is possible at any time.As input, the used currency, the hash string and the type of proof is required. Then a file with the information for the submission proof will be returned. If the hash was submitted in an API version lower than 3, a XML file containing the essential information of the Merkle Tree will be returned. Otherwise, the seed file will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProofApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

ProofApi apiInstance = new ProofApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
ProofRequest proofRequest = new ProofRequest(); // ProofRequest | Information needed to return the hash status information.
try {
    ResponseEntity result = apiInstance.getProofUsingPOST(authorization, proofRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofApi#getProofUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **proofRequest** | [**ProofRequest**](ProofRequest.md)| Information needed to return the hash status information. |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

