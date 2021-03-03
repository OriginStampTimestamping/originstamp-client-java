
# UsageResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificatePerMonth** | **Long** | Total number of certificates available per month. |  [optional]
**consumedCertificates** | **Long** | Number of certificates requested for the current month. |  [optional]
**consumedCredits** | [**BigDecimal**](BigDecimal.md) | Number of used credits for the current month. |  [optional]
**consumedTimestamps** | **Long** | Number of timestamps created for the current month. |  [optional]
**creditsPerMonth** | [**BigDecimal**](BigDecimal.md) | Represents the total number of credits per month. |  [optional]
**limitationType** | **Integer** | Determines which usage metric is applied (0 &#x3D; credits, 1 &#x3D; timestamps). |  [optional]
**remainingCredits** | [**BigDecimal**](BigDecimal.md) | Remaining number of credits for the current month. |  [optional]
**timestampsPerMonth** | **Long** | Total number of timestamps available per month. |  [optional]



