# OverviewApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTimestampUsingPOST**](OverviewApi.md#createTimestampUsingPOST) | **POST** /v3/timestamp/create | Submission
[**getCurrentApiKeyUsageUsingGET**](OverviewApi.md#getCurrentApiKeyUsageUsingGET) | **GET** /v3/api_key/usage | Usage
[**getHashStatusUsingGET**](OverviewApi.md#getHashStatusUsingGET) | **GET** /v3/timestamp/{hash_string} | Status
[**getProofUsingPOST**](OverviewApi.md#getProofUsingPOST) | **POST** /v3/timestamp/proof | Proof


<a name="createTimestampUsingPOST"></a>
# **createTimestampUsingPOST**
> ServiceResponseTimestampResponse createTimestampUsingPOST(authorization, timestampRequest)

Submission

You can submit your hash with this function. If your api key is valid, your hash is added to batch and is scheduled for timestamping. If the hash already exists, the created flag in the response is set to false. You are also able to submit additional information, such as comment or notification credentials. Once a hash is successfully created for a certain crypto-currency, we can notify your desired target with the timestamp information (POST Request). Additionally, it is possible to include a preprint URL in the hash submission. Before the generation of the timestamp hash you can create a random UUID Version 4 and include https://originstamp.com/u/UUID where UUID is your UUID e.g. in a document you want to timestamp. In the preprint URL field you include your UUID and then it is possible to verify the timestamp within the document (or whatever).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OverviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

OverviewApi apiInstance = new OverviewApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
try {
    ServiceResponseTimestampResponse result = apiInstance.createTimestampUsingPOST(authorization, timestampRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverviewApi#createTimestampUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **timestampRequest** | [**TimestampRequest**](TimestampRequest.md)| DTO for the hash submission. Add all relevant information concerning your hash submission. |

### Return type

[**ServiceResponseTimestampResponse**](ServiceResponseTimestampResponse.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentApiKeyUsageUsingGET"></a>
# **getCurrentApiKeyUsageUsingGET**
> ServiceResponseUsageDTO getCurrentApiKeyUsageUsingGET(authorization)

Usage

With this interface you can receive the current api usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OverviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

OverviewApi apiInstance = new OverviewApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    ServiceResponseUsageDTO result = apiInstance.getCurrentApiKeyUsageUsingGET(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverviewApi#getCurrentApiKeyUsageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |

### Return type

[**ServiceResponseUsageDTO**](ServiceResponseUsageDTO.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHashStatusUsingGET"></a>
# **getHashStatusUsingGET**
> ServiceResponseTimestampResponse getHashStatusUsingGET(authorization, hashString)

Status

The request returns information of a certain hash read from the URL parameter. The input parameter is a hash in hex representation. Field \&quot;created\&quot; always set to false.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OverviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

OverviewApi apiInstance = new OverviewApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String hashString = "hashString_example"; // String | The hash in string representation.
try {
    ServiceResponseTimestampResponse result = apiInstance.getHashStatusUsingGET(authorization, hashString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverviewApi#getHashStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **hashString** | **String**| The hash in string representation. |

### Return type

[**ServiceResponseTimestampResponse**](ServiceResponseTimestampResponse.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
//import io.swagger.client.api.OverviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

OverviewApi apiInstance = new OverviewApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
ProofRequest proofRequest = new ProofRequest(); // ProofRequest | Information needed to return the hash status information.
try {
    ResponseEntity result = apiInstance.getProofUsingPOST(authorization, proofRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverviewApi#getProofUsingPOST");
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

