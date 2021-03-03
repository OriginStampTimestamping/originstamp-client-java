# SchedulerApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActiveCurrencies**](SchedulerApi.md#getActiveCurrencies) | **GET** /v3/currencies/get | Get active currencies


<a name="getActiveCurrencies"></a>
# **getActiveCurrencies**
> DefaultOfListOfCurrencyModel getActiveCurrencies(authorization)

Get active currencies

Returns an array with all active currencies.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.SchedulerApi;

SchedulerApi apiInstance = new SchedulerApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    DefaultOfListOfCurrencyModel result = apiInstance.getActiveCurrencies(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerApi#getActiveCurrencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |

### Return type

[**DefaultOfListOfCurrencyModel**](DefaultOfListOfCurrencyModel.md)

### Authorization

[API Key Authorization](../README.md#API Key Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

