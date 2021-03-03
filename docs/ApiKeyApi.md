# ApiKeyApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiKeyUsage**](ApiKeyApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage


<a name="getApiKeyUsage"></a>
# **getApiKeyUsage**
> DefaultUsageResponse getApiKeyUsage(authorization)

Usage

With this interface you can receive the current api usage.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.ApiKeyApi;

ApiKeyApi apiInstance = new ApiKeyApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    DefaultUsageResponse result = apiInstance.getApiKeyUsage(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#getApiKeyUsage");
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

