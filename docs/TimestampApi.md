# TimestampApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTimestamp**](TimestampApi.md#createTimestamp) | **POST** /v3/timestamp/create | Submission
[**getApiKeyUsage**](TimestampApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage
[**getHashStatus**](TimestampApi.md#getHashStatus) | **GET** /v3/timestamp/{hash_string} | Status
[**getProof**](TimestampApi.md#getProof) | **POST** /v3/timestamp/proof | Proof
[**triggerTimestampWebhook**](TimestampApi.md#triggerTimestampWebhook) | **POST** /v3/webhook/start | Dev


<a name="createTimestamp"></a>
# **createTimestamp**
> DefaultTimestampResponse createTimestamp(authorization, timestampRequest)

Submission

You can submit your hash with this function. If your api key is valid, your hash is added to batch and is scheduled for timestamping. If the hash already exists, the created flag in the response is set to false. You are also able to submit additional information, such as comment or notification credentials. Once a hash is successfully created for a certain crypto-currency, we can notify your desired target with the timestamp information (POST Request). Additionally, it is possible to include a preprint URL in the hash submission. Before the generation of the timestamp hash you can create a random UUID Version 4 and include https://originstamp.com/u/UUID where UUID is your UUID e.g. in a document you want to timestamp. In the preprint URL field you include your UUID and then it is possible to verify the timestamp within the document (or whatever).

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;


TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
try {
    DefaultTimestampResponse result = apiInstance.createTimestamp(authorization, timestampRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#createTimestamp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **timestampRequest** | [**TimestampRequest**](TimestampRequest.md)| DTO for the hash submission. Add all relevant information concerning your hash submission. |

### Return type

[**DefaultTimestampResponse**](DefaultTimestampResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApiKeyUsage"></a>
# **getApiKeyUsage**
> DefaultUsageResponse getApiKeyUsage(authorization)

Usage

With this interface you can receive the current api usage.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;


TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    DefaultUsageResponse result = apiInstance.getApiKeyUsage(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#getApiKeyUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |

### Return type

[**DefaultUsageResponse**](DefaultUsageResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHashStatus"></a>
# **getHashStatus**
> DefaultTimestampResponse getHashStatus(authorization, hashString)

Status

The request returns information of a certain hash read from the URL parameter. The input parameter is a hash in hex representation. Field \&quot;created\&quot; always set to false.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;


TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String hashString = "hashString_example"; // String | The hash in string representation.
try {
    DefaultTimestampResponse result = apiInstance.getHashStatus(authorization, hashString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#getHashStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **hashString** | **String**| The hash in string representation. |

### Return type

[**DefaultTimestampResponse**](DefaultTimestampResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProof"></a>
# **getProof**
> ResponseEntity getProof(authorization, proofRequest)

Proof

This request can be used to proof a submission of a hash. This interface is required to request the evidence. With the help of this proof the verification of a timestamp independent from OriginStamp is necessary. A guide for the verification can be found &lt;a href&#x3D;\&quot;https://github.com/OriginStampTimestamping/originstamp-verification\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; .Usually, the proof should be requested for each transferred hash and kept with the timestamped data so that an independent verification of the timestamp is possible at any time.As input, the used currency, the hash string and the type of proof is required. Then a file with the information for the submission proof will be returned. If the hash was submitted in an API version lower than 3, a XML file containing the essential information of the Merkle Tree will be returned. Otherwise, the seed file will be returned.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;


TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
ProofRequest proofRequest = new ProofRequest(); // ProofRequest | Information needed to return the hash status information.
try {
    ResponseEntity result = apiInstance.getProof(authorization, proofRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#getProof");
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

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="triggerTimestampWebhook"></a>
# **triggerTimestampWebhook**
> Defaultstring triggerTimestampWebhook(authorization, webhookRequest)

Dev

With this interface you can trigger manual webhook to see how a webhooks looks like. Please use a hash, that was already timestamped before such as &lt;a target&#x3D;\&quot;_target\&quot; href&#x3D;\&quot;https://originstamp.org/s/9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08\&quot;&gt;9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08&lt;/a&gt;

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;


TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
WebhookRequest webhookRequest = new WebhookRequest(); // WebhookRequest | DTO for webhook request.
try {
    Defaultstring result = apiInstance.triggerTimestampWebhook(authorization, webhookRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#triggerTimestampWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)| DTO for webhook request. |

### Return type

[**Defaultstring**](Defaultstring.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

