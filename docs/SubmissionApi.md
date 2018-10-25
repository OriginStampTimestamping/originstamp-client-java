# SubmissionApi

All URIs are relative to *https://api.originstamp.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTimestampUsingPOST**](SubmissionApi.md#createTimestampUsingPOST) | **POST** /v3/timestamp/create | Submission


<a name="createTimestampUsingPOST"></a>
# **createTimestampUsingPOST**
> ServiceResponseTimestampResponse createTimestampUsingPOST(authorization, timestampRequest)

Submission

You can submit your hash with this function. If your api key is valid, your hash is added to batch and is scheduled for timestamping. If the hash already exists, the created flag in the response is set to false. You are also able to submit additional information, such as comment or notification credentials. Once a hash is successfully created for a certain crypto-currency, we can notify your desired target with the timestamp information (POST Request). Additionally, it is possible to include a preprint URL in the hash submission. Before the generation of the timestamp hash you can create a random UUID Version 4 and include https://originstamp.com/u/UUID where UUID is your UUID e.g. in a document you want to timestamp. In the preprint URL field you include your UUID and then it is possible to verify the timestamp within the document (or whatever).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubmissionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Enterprise Key Authorization
ApiKeyAuth Enterprise Key Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Enterprise Key Authorization");
Enterprise Key Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Enterprise Key Authorization.setApiKeyPrefix("Token");

SubmissionApi apiInstance = new SubmissionApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
try {
    ServiceResponseTimestampResponse result = apiInstance.createTimestampUsingPOST(authorization, timestampRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionApi#createTimestampUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **timestampRequest** | [**TimestampRequest**](TimestampRequest.md)| DTO for the hash submission. Add all relevant information concerning your hash submission. |

### Return type

[**ServiceResponseTimestampResponse**](ServiceResponseTimestampResponse.md)

### Authorization

[Enterprise Key Authorization](../README.md#Enterprise Key Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

