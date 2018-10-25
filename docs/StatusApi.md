# StatusApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHashStatusUsingGET**](StatusApi.md#getHashStatusUsingGET) | **GET** /v3/timestamp/{hash_string} | Status


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
//import io.swagger.client.api.StatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

StatusApi apiInstance = new StatusApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String hashString = "hashString_example"; // String | The hash in string representation.
try {
    ServiceResponseTimestampResponse result = apiInstance.getHashStatusUsingGET(authorization, hashString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getHashStatusUsingGET");
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

