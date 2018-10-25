# SchedulerControllerApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchedulerInformationUsingPOST**](SchedulerControllerApi.md#getSchedulerInformationUsingPOST) | **POST** /v3/submission/times | getSchedulerInformation


<a name="getSchedulerInformationUsingPOST"></a>
# **getSchedulerInformationUsingPOST**
> ServiceResponseSchedulerInformationResponseDTO getSchedulerInformationUsingPOST(requestDTO)

getSchedulerInformation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchedulerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

SchedulerControllerApi apiInstance = new SchedulerControllerApi();
SchedulerInformationRequestDTO requestDTO = new SchedulerInformationRequestDTO(); // SchedulerInformationRequestDTO | requestDTO
try {
    ServiceResponseSchedulerInformationResponseDTO result = apiInstance.getSchedulerInformationUsingPOST(requestDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerControllerApi#getSchedulerInformationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestDTO** | [**SchedulerInformationRequestDTO**](SchedulerInformationRequestDTO.md)| requestDTO |

### Return type

[**ServiceResponseSchedulerInformationResponseDTO**](ServiceResponseSchedulerInformationResponseDTO.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

