# BulkApi

All URIs are relative to *https://api.originstamp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkTimestamp**](BulkApi.md#createBulkTimestamp) | **POST** /v4/timestamp/bulk/create | Bulk Submission
[**getSeedStatus**](BulkApi.md#getSeedStatus) | **GET** /v4/timestamp/status/seed/{seed_id} | Seed Status


<a name="createBulkTimestamp"></a>
# **createBulkTimestamp**
> List&lt;DefaultOfTimestampResponse&gt; createBulkTimestamp(authorization, timestampBulkRequest)

Bulk Submission

With this interface you can submit multiple hashes at once. If your API key is valid, your hashes are added to seeds and scheduled for timestamping. You are also able to submit additional information with every hash, such as a comment or notification target. If the hash already exists, the &#39;created&#39; field in the response is set to &#39;false&#39; and the notification(s) of the corresponding hash will be ignored. To later query the status of any hash for a certain blockchain you can use the &#39;seed_id&#39; field of its inner timestamp structure. This field can be used to query the timestamping status of the selected seed. This is recommended if a large number of hashes were transmitted in a certain time frame. Once a hash is successfully created for a certain crypto currency, we can notify your desired target with the timestamp information (via POST Request). A webhook for a submitted hash is triggered as soon as the tamper-proof timestamp with the selected crypto currency has been created. 

### Example
```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.BulkApi;

BulkApi apiInstance = new BulkApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
TimestampBulkRequest timestampBulkRequest = new TimestampBulkRequest(); // TimestampBulkRequest | DTO for the bulk hash submission. Add all relevant information concerning your hash submissions.
try {
    List<DefaultOfTimestampResponse> result = apiInstance.createBulkTimestamp(authorization, timestampBulkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#createBulkTimestamp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| A valid API key is essential for authorization to handle the request. |
 **timestampBulkRequest** | [**TimestampBulkRequest**](TimestampBulkRequest.md)| DTO for the bulk hash submission. Add all relevant information concerning your hash submissions. |

### Return type

[**List&lt;DefaultOfTimestampResponse&gt;**](DefaultOfTimestampResponse.md)

### Authorization

[API Key Authorization](../README.md#API Key Authorization)

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
//import com.originstamp.api.BulkApi;

BulkApi apiInstance = new BulkApi();
String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
String seedId = "seedId_example"; // String | ID of the timestamp seed
try {
    DefaultOfTimestampData result = apiInstance.getSeedStatus(authorization, seedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#getSeedStatus");
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

