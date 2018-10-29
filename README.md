# OriginStamp Java Client
[![Build Status](https://travis-ci.com/OriginStampTimestamping/originstamp-api.svg?token=pQzQz38vk99v2uad9eWc&branch=master)](https://travis-ci.com/OriginStampTimestamping/originstamp-api)

![](https://originstamp.com/assets/images/logo/logo_simple_small.png)

> A Java implementation of the OriginStamp API

## Table of Contents

- [Install](#install)
- [Usage](#usage)
- [Building](#building)
- [Contribute](#contribute)
- [License](#license)

## Install

### Official releases

You can use this project by including `OriginStamp4J.jar` from one of the [releases](https://github.com/OriginStampTimestamping/originstamp-client-java/releases).

### Maven, Gradle, SBT

Package managers are supported through [JitPack](https://jitpack.io/#OriginStampTimestamping/originstamp-client-java/) which supports Maven, Gradle, SBT, etc.

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

### Building
Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

* Clone this repository
* Add the maven dependency
* mvn clean install

### OriginStamp

OriginStamp.com can be used to prove the existence of a record at a specific point in time.
The resulting timestamps can be used, for example, to secure supply chains, prove damage, simplify regulatory compliance, and prove the authorship of data, such as photos.
Originally launched in 2011 as a research project to protect researchers ideas,
OriginStamp has now become a commercial product and the leading platform for blockchain-based timestamps due to the ever-increasing demand.

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.originstamp.api.client.*;
import com.originstamp.api.client.auth.*;
import com.originstamp.model.*;
import com.originstamp.api.SchedulerApi;

import java.io.File;
import java.util.*;

public class SchedulerApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.originstamp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SchedulerApi* | [**getNextSchedulingTime**](docs/SchedulerApi.md#getNextSchedulingTime) | **POST** /v3/submission/times | NextSchedule
*TimestampApi* | [**createTimestamp**](docs/TimestampApi.md#createTimestamp) | **POST** /v3/timestamp/create | Submission
*TimestampApi* | [**getApiKeyUsage**](docs/TimestampApi.md#getApiKeyUsage) | **GET** /v3/api_key/usage | Usage
*TimestampApi* | [**getHashStatus**](docs/TimestampApi.md#getHashStatus) | **GET** /v3/timestamp/{hash_string} | Status
*TimestampApi* | [**getProof**](docs/TimestampApi.md#getProof) | **POST** /v3/timestamp/proof | Proof
*TimestampApi* | [**triggerTimestampWebhook**](docs/TimestampApi.md#triggerTimestampWebhook) | **POST** /v3/webhook/start | Dev


## Documentation for Models

 - [DefaultSchedulerResponse](docs/DefaultSchedulerResponse.md)
 - [DefaultTimestampResponse](docs/DefaultTimestampResponse.md)
 - [DefaultUsageResponse](docs/DefaultUsageResponse.md)
 - [Defaultstring](docs/Defaultstring.md)
 - [Notification](docs/Notification.md)
 - [ProofRequest](docs/ProofRequest.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [SchedulerRequest](docs/SchedulerRequest.md)
 - [SchedulerResponse](docs/SchedulerResponse.md)
 - [TimestampData](docs/TimestampData.md)
 - [TimestampRequest](docs/TimestampRequest.md)
 - [TimestampResponse](docs/TimestampResponse.md)
 - [UsageResponse](docs/UsageResponse.md)
 - [WebhookRequest](docs/WebhookRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Key Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.


## Author

mail@originstamp.com
