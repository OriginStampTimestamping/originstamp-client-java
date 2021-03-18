# OriginStamp Java Client

[![Build Status](https://travis-ci.com/OriginStampTimestamping/originstamp-client-java.svg?token=pQzQz38vk99v2uad9eWc&branch=master)](https://travis-ci.com/OriginStampTimestamping/originstamp-client-java)


![](https://resources.originstamp.com/images/logo/originstamp-logo-landscape-mc_248x53.png)


> A Java implementation of the OriginStamp API. For endpoint documentation see [OriginStamp Documentation](https://docs.originstamp.com).

For more information, please visit [https://originstamp.com](https://originstamp.com)


## Requirements

Building and using the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

Releases are listed [here](https://github.com/OriginStampTimestamping/originstamp-client-java/releases).

### Maven users

For Maven, add the following sections to your pom.xml (replacing $LATEST_VERSION):
```
  <repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
  </repositories>
  
  <dependency>
    <groupId>com.github.OriginStampTimestamping</groupId>
    <artifactId>originstamp-client-java</artifactId>
    <version>$LATEST_VERSION</version>
  </dependency>
  
```


### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.originstamp:originstamp-client-java:$LATEST_VERSION"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/originstamp-client-java-$LATEST_VERSION.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.originstamp.api.client.*;
import com.originstamp.api.client.auth.*;
import com.originstamp.model.*;
import com.originstamp.api.TimestampApi;

import java.io.File;
import java.util.*;

public class ClientExample {

    public static void main(String[] args) {
        TimestampApi apiInstance = new TimestampApi();
        String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
        TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
        try {
            DefaultOfTimestampResponse result = apiInstance.createTimestamp(authorization, timestampRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimestampApi#createTimestamp");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.originstamp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiKeyApi* | [**getApiKeyUsage**](docs/ApiKeyApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage
*BulkApi* | [**createBulkTimestamp**](docs/BulkApi.md#createBulkTimestamp) | **POST** /v4/timestamp/bulk/create | Bulk Submission
*BulkApi* | [**getSeedStatus**](docs/BulkApi.md#getSeedStatus) | **GET** /v4/timestamp/status/seed/{seed_id} | Seed Status
*ProofApi* | [**getProof**](docs/ProofApi.md#getProof) | **POST** /v3/timestamp/proof/url | Proof
*SchedulerApi* | [**getActiveCurrencies**](docs/SchedulerApi.md#getActiveCurrencies) | **GET** /v3/currencies/get | Get active currencies
*TimestampApi* | [**createTimestamp**](docs/TimestampApi.md#createTimestamp) | **POST** /v4/timestamp/create | Submission
*TimestampApi* | [**getHashStatus**](docs/TimestampApi.md#getHashStatus) | **GET** /v4/timestamp/{hash_string} | Status
*TimestampApi* | [**getSeedStatus**](docs/TimestampApi.md#getSeedStatus) | **GET** /v4/timestamp/status/seed/{seed_id} | Seed Status
*WebhookApi* | [**getWebhookStatus**](docs/WebhookApi.md#getWebhookStatus) | **POST** /v3/webhook/information | Webhook
*WebhookApi* | [**registerWebhookNotification**](docs/WebhookApi.md#registerWebhookNotification) | **POST** /v3/webhook/register | Webhook
*WebhookApi* | [**triggerTimestampWebhook**](docs/WebhookApi.md#triggerTimestampWebhook) | **POST** /v3/webhook/start | Dev


## Documentation for Models

- [CurrencyModel](docs/CurrencyModel.md)
- [DefaultOfDownloadLinkResponse](docs/DefaultOfDownloadLinkResponse.md)
- [DefaultOfListOfCurrencyModel](docs/DefaultOfListOfCurrencyModel.md)
- [DefaultOfTimestampData](docs/DefaultOfTimestampData.md)
- [DefaultOfTimestampResponse](docs/DefaultOfTimestampResponse.md)
- [DefaultOfVoid](docs/DefaultOfVoid.md)
- [DefaultOfWebhookResponse](docs/DefaultOfWebhookResponse.md)
- [DefaultOfstring](docs/DefaultOfstring.md)
- [DefaultUsageResponse](docs/DefaultUsageResponse.md)
- [DownloadLinkResponse](docs/DownloadLinkResponse.md)
- [ManualWebhookRequest](docs/ManualWebhookRequest.md)
- [Notification](docs/Notification.md)
- [ProofRequest](docs/ProofRequest.md)
- [TimestampBulkRequest](docs/TimestampBulkRequest.md)
- [TimestampData](docs/TimestampData.md)
- [TimestampRequest](docs/TimestampRequest.md)
- [TimestampResponse](docs/TimestampResponse.md)
- [UsageResponse](docs/UsageResponse.md)
- [WebhookRequest](docs/WebhookRequest.md)
- [WebhookResponse](docs/WebhookResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### API Key Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

mail@originstamp.com

