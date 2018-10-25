# originstamp-client-java
[![Build Status](https://travis-ci.com/OriginStampTimestamping/originstamp-api.svg?token=pQzQz38vk99v2uad9eWc&branch=master)](https://travis-ci.com/OriginStampTimestamping/originstamp-api)

![](https://originstamp.com/assets/images/logo/logo_simple_small.png)

> A Java implementation of the OriginStamp api

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

for Maven, add the following sections to your pom.xml (replacing $LATEST_VERSION):
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
    <version>Tag</version>
  </dependency>
  
```

### Building
Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

* Clone this repository
* Add the maven dependency
* mvn clean install

### Running tests

### OriginStamp

OriginStamp.com can be used to prove the existence of a record at a specific point in time.
The resulting timestamps can be used, for example, to secure supply chains, prove damage, simplify regulatory compliance, and prove the authorship of data, such as photos.
Originally launched in 2011 as a research project to protect researchers ideas,
OriginStamp has now become a commercial product and the leading platform for blockchain-based timestamps due to the ever-increasing demand.

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.OverviewApi;

import java.io.File;
import java.util.*;

public class OverviewApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        OverviewApi apiInstance = new OverviewApi();
        String authorization = "authorization_example"; // String | A valid API key is essential for authorization to handle the request.
        TimestampRequest timestampRequest = new TimestampRequest(); // TimestampRequest | DTO for the hash submission. Add all relevant information concerning your hash submission.
        try {
            ServiceResponseTimestampResponse result = apiInstance.createTimestampUsingPOST(authorization, timestampRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OverviewApi#createTimestampUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.originstamp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OverviewApi* | [**createTimestampUsingPOST**](docs/OverviewApi.md#createTimestampUsingPOST) | **POST** /v3/timestamp/create | Submission
*OverviewApi* | [**getCurrentApiKeyUsageUsingGET**](docs/OverviewApi.md#getCurrentApiKeyUsageUsingGET) | **GET** /v3/api_key/usage | Usage
*OverviewApi* | [**getHashStatusUsingGET**](docs/OverviewApi.md#getHashStatusUsingGET) | **GET** /v3/timestamp/{hash_string} | Status
*OverviewApi* | [**getProofUsingPOST**](docs/OverviewApi.md#getProofUsingPOST) | **POST** /v3/timestamp/proof | Proof
*ProofApi* | [**getProofUsingPOST**](docs/ProofApi.md#getProofUsingPOST) | **POST** /v3/timestamp/proof | Proof
*SchedulerControllerApi* | [**getSchedulerInformationUsingPOST**](docs/SchedulerControllerApi.md#getSchedulerInformationUsingPOST) | **POST** /v3/submission/times | getSchedulerInformation
*StatusApi* | [**getHashStatusUsingGET**](docs/StatusApi.md#getHashStatusUsingGET) | **GET** /v3/timestamp/{hash_string} | Status
*SubmissionApi* | [**createTimestampUsingPOST**](docs/SubmissionApi.md#createTimestampUsingPOST) | **POST** /v3/timestamp/create | Submission
*UsageApi* | [**getCurrentApiKeyUsageUsingGET**](docs/UsageApi.md#getCurrentApiKeyUsageUsingGET) | **GET** /v3/api_key/usage | Usage


## Documentation for Models

 - [Notification](docs/Notification.md)
 - [ProofRequest](docs/ProofRequest.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [SchedulerInformationRequestDTO](docs/SchedulerInformationRequestDTO.md)
 - [SchedulerInformationResponseDTO](docs/SchedulerInformationResponseDTO.md)
 - [ServiceResponseSchedulerInformationResponseDTO](docs/ServiceResponseSchedulerInformationResponseDTO.md)
 - [ServiceResponseTimestampResponse](docs/ServiceResponseTimestampResponse.md)
 - [ServiceResponseUsageDTO](docs/ServiceResponseUsageDTO.md)
 - [TimestampData](docs/TimestampData.md)
 - [TimestampRequest](docs/TimestampRequest.md)
 - [TimestampResponse](docs/TimestampResponse.md)
 - [UsageDTO](docs/UsageDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Enterprise Key Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### System Key Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.


## Contribute


## License

[MIT](LICENSE)
