# OriginStamp Java Client

[![Build Status](https://travis-ci.com/OriginStampTimestamping/originstamp-client-java.svg?token=pQzQz38vk99v2uad9eWc&branch=master)](https://travis-ci.com/OriginStampTimestamping/originstamp-client-java)

![](https://originstamp.com/assets/images/logo/logo_simple_small.png)


> A Java implementation of the OriginStamp API. For endpoint documentation see [OriginStamp Documentation](https://docs.originstamp.com).


## OriginStamp API Documentation

OriginStamp is a trusted timestamping service that uses the decentralized blockchain to store anonymous, tamper-proof timestamps for any digital content. OriginStamp allows users to timestamp files, emails, or plain text, and subsequently store the created hashes in the blockchain as well as retrieve and verify timetamps that have been committed to the blockchain.The trusted timestamping service of OriginStamp allows you to generate a hash fingerprint and prove that it was created at a specific point in time. If you are interested in integrating trusted timestamping into your own project, feel free to use our provided API. The following interactive documentation describes the interfaces and supports your integration. With this documentation you are able to try out the different requests and see the responses. For the authorization, add your API key to the Authorization header of your request.<br/><h2>Timestamping Steps</h2><ol><li><strong>Determine Hash: </strong> Calculate the SHA-256 of your record using a cryptographic library.</li><li><strong>Create Timestamp: </strong>Create a timestamp and add meta information to index it, e.g. a comment. You can also request a notification (email or webhook) once the tamper-proof timestamp has been created.</li><li><strong>Archive original file: </strong>Since we have no access to your original data, you should archive it because the timestamp is only valid in combination with the original file.</li><li><strong>Check Timestamp Status: </strong>Since the timestamps are always transmitted to the blockchain network at certain times, i.e. there is a delay, you can check the status of a hash and thus get the timestamp information.</li><li><strong>Get Timestamp Proof: </strong>As soon as the tamper-proof timestamp has been generated, you should archive the proof (Merkle Tree), which we created in our open procedure, together with the original file. With this proof, the existence of the file can be verified independently of OriginStamp. Here you can choose if the raw proof (xml) is sufficient proof or if you want to have a certificate (pdf).</li></ol><br/><h2>Installation Notes</h2><ul><li>Make sure you set the Authorization header correctly using your API key.</li><li>If a Cloudflare error occurs, please set a custom UserAgent header.</li><li>Please have a look at the models below to find out what each field means.</li></ul>

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
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
// Import classes:
//import com.originstamp.api.client.ApiException;
//import com.originstamp.api.TimestampApi;

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

```

## Documentation for API Endpoints

All URIs are relative to *https://api.originstamp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiKeyApi* | [**getApiKeyUsage**](docs/ApiKeyApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage
*ProofApi* | [**getProof**](docs/ProofApi.md#getProof) | **POST** /v3/timestamp/proof/url | Proof
*SchedulerApi* | [**getActiveCurrencies**](docs/SchedulerApi.md#getActiveCurrencies) | **GET** /v3/currencies/get | Get active currencies
*TimestampApi* | [**createTimestamp**](docs/TimestampApi.md#createTimestamp) | **POST** /v3/timestamp/create | Submission
*TimestampApi* | [**getHashStatus**](docs/TimestampApi.md#getHashStatus) | **GET** /v3/timestamp/{hash_string} | Status
*TimestampApi* | [**getHashStatusForUrlId**](docs/TimestampApi.md#getHashStatusForUrlId) | **GET** /v3/timestamp/url/{url_id} | Status for URL ID
*WebhookApi* | [**getWebhookStatus**](docs/WebhookApi.md#getWebhookStatus) | **POST** /v3/webhook/information | Webhook
*WebhookApi* | [**registerWebhookNotification**](docs/WebhookApi.md#registerWebhookNotification) | **POST** /v3/webhook/register | Webhook
*WebhookApi* | [**triggerTimestampWebhook**](docs/WebhookApi.md#triggerTimestampWebhook) | **POST** /v3/webhook/start | Dev


## Documentation for Models

- [CurrencyModel](docs/CurrencyModel.md)
- [DefaultOfDownloadLinkResponse](docs/DefaultOfDownloadLinkResponse.md)
- [DefaultOfListOfCurrencyModel](docs/DefaultOfListOfCurrencyModel.md)
- [DefaultOfTimestampResponse](docs/DefaultOfTimestampResponse.md)
- [DefaultOfWebhookResponse](docs/DefaultOfWebhookResponse.md)
- [DefaultOfstring](docs/DefaultOfstring.md)
- [DefaultUsageResponse](docs/DefaultUsageResponse.md)
- [DownloadLinkResponse](docs/DownloadLinkResponse.md)
- [ManualWebhookRequest](docs/ManualWebhookRequest.md)
- [ModelDefault](docs/ModelDefault.md)
- [Notification](docs/Notification.md)
- [ProofRequest](docs/ProofRequest.md)
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

