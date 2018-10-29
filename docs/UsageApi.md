# UsageApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiKeyUsage**](UsageApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage


<a name="getApiKeyUsage"></a>
# **getApiKeyUsage**
> DefaultUsageResponse getApiKeyUsage(authorization)

Usage

With this interface you can receive the current api usage.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.UsageApi;


UsageApi apiInstance = new UsageApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    DefaultUsageResponse result = apiInstance.getApiKeyUsage(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getApiKeyUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |

### Return type

[**DefaultUsageResponse**](DefaultUsageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

