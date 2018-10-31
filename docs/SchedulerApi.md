# SchedulerApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNextSchedulingTime**](SchedulerApi.md#getNextSchedulingTime) | **POST** /v3/submission/times | NextSchedule


<a name="getNextSchedulingTime"></a>
# **getNextSchedulingTime**
> DefaultSchedulerResponse getNextSchedulingTime(authorization, schedulerRequest)

NextSchedule

Get the next scheduling time for hash submissions to the blockchain.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.SchedulerApi;


SchedulerApi apiInstance = new SchedulerApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
SchedulerRequest schedulerRequest = new SchedulerRequest(); // SchedulerRequest | Request DTO for next schedules.
try {
    DefaultSchedulerResponse result = apiInstance.getNextSchedulingTime(authorization, schedulerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerApi#getNextSchedulingTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **schedulerRequest** | [**SchedulerRequest**](SchedulerRequest.md)| Request DTO for next schedules. |

### Return type

[**DefaultSchedulerResponse**](DefaultSchedulerResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

