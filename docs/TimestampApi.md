# TimestampApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTimestamp**](TimestampApi.md#createTimestamp) | **POST** /v4/timestamp/create | Submission
[**getHashStatus**](TimestampApi.md#getHashStatus) | **GET** /v4/timestamp/{hash_string} | Status
[**getSeedStatus**](TimestampApi.md#getSeedStatus) | **GET** /v4/timestamp/status/seed/{seed_id} | Seed Status


<a name="createTimestamp"></a>
# **createTimestamp**
> DefaultOfTimestampResponse createTimestamp(authorization, timestampRequest)

Submission

With this interface you can submit your hash. If your API key is valid, your hash is added  seeds and scheduled for timestamping. You are also able to submit additional information, such as a comment or notification target. If the hash already exists, the &#39;created&#39; field in the response is set to &#39;false&#39; and any notification(s) for this hash will be ignored. To later query the status of the hash for a certain blockchain you can use the &#39;seed_id&#39; field of its inner timestamp structure. This field can be used to query the timestamping status of the selected seed. This is recommended if a large number of hashes were transmitted in a certain time frame. Once a hash is successfully created for a certain crypto currency, we can notify your desired target with the timestamp information (via POST Request). A webhook is triggered as soon as the tamper-proof timestamp with the selected crypto currency has been created. 

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;

TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
try {
    DefaultOfTimestampResponse result = apiInstance.createTimestamp(authorization, timestampRequest);
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

[**DefaultOfTimestampResponse**](DefaultOfTimestampResponse.md)

### Authorization

[API Key Authorization](../README.md#API Key Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHashStatus"></a>
# **getHashStatus**
> DefaultOfTimestampResponse getHashStatus(authorization, hashString)

Status

This interface returns information of a certain hash read from the URL path. If the status of several hashes is to be checked, it is preferable to use the seed status interface. This reduces the required requests and can be tailored to a desired blockchain. All &#39;created&#39; fields are always set to false for a status request.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;

TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String hashString = "hashString_example"; // String | The hash in string representation.
try {
    DefaultOfTimestampResponse result = apiInstance.getHashStatus(authorization, hashString);
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

[**DefaultOfTimestampResponse**](DefaultOfTimestampResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSeedStatus"></a>
# **getSeedStatus**
> DefaultOfTimestampData getSeedStatus(authorization, seedId)

Seed Status

With this interface you can request the status for a certain seed. This is used when checking the status of previously submitted hashes and avoids sending individual status requests for each hash.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;

TimestampApi apiInstance = new TimestampApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String seedId = "seedId_example"; // String | ID of the timestamp seed
try {
    DefaultOfTimestampData result = apiInstance.getSeedStatus(authorization, seedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimestampApi#getSeedStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **seedId** | **String**| ID of the timestamp seed |

### Return type

[**DefaultOfTimestampData**](DefaultOfTimestampData.md)


### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

