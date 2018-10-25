
# TimestampRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | You can add a short comment (max. 256 characters) which can be used for indexing and searching (public). |  [optional]
**hash** | **String** | Hash in HEX representation. We suggest to use SHA-256. This hash will be aggregated and included into the blockchain. | 
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Add a notification/notification list to your submission. Our system will notify the specified target with the timestamp information. |  [optional]
**url** | **String** | Preprint URL. Insert the generated UUID here. You can generate an UUID-4 and include it into your document: https://originstamp.org/u/uuid4. When submitting the your file, the url is part of the hash, which finally means it the link to the timestamp is part of the timestamp. |  [optional]



