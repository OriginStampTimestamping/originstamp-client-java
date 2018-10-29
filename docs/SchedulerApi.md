# SchedulerApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNextSchedulingTime**](SchedulerApi.md#getNextSchedulingTime) | **POST** /v3/submission/times | NextSchedule


<a name="getNextSchedulingTime"></a>
# **getNextSchedulingTime**
> DefaultSchedulerResponse getNextSchedulingTime(schedulerRequest, authorization)

NextSchedule

Get the next scheduling time for submissions.

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.SchedulerApi;


SchedulerApi apiInstance = new SchedulerApi();
SchedulerRequest schedulerRequest = new SchedulerRequest(); // SchedulerRequest | Request DTO for next schedules.
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
try {
    DefaultSchedulerResponse result = apiInstance.getNextSchedulingTime(schedulerRequest, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerApi#getNextSchedulingTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerRequest** | [**SchedulerRequest**](SchedulerRequest.md)| Request DTO for next schedules. |
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |

### Return type

[**DefaultSchedulerResponse**](DefaultSchedulerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

