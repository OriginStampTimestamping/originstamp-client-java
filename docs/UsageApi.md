# UsageApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentApiKeyUsageUsingGET**](UsageApi.md#getCurrentApiKeyUsageUsingGET) | **GET** /v3/api_key/usage | Usage


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
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    ServiceResponseUsageDTO result = apiInstance.getCurrentApiKeyUsageUsingGET(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getCurrentApiKeyUsageUsingGET");
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

