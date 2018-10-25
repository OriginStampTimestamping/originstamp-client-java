
# TimestampData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyId** | **Integer** | 0: Bitcoin  1: Ethereum  more to be added |  [optional]
**privateKey** | **String** | The private key represents the top hash in the Merkle Tree (see &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Merkle_tree\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Wikipedia&lt;/a&gt;) or the hash of all hashes in the transaction. |  [optional]
**submitStatus** | **Long** | The submit status of the hash:   0: the hash was not broadcasted yet  1: the hash was included into a transaction and broadcasted to the network, but not included into a block  2: the transaction was included into the latest block  3: the timestamp for your hash was successfully created. |  [optional]
**timestamp** | **Long** | Unix timestamp in milliseconds. Timezone: UTC. This is a true timestamp. |  [optional]
**transaction** | **String** | If available: the transaction hash. |  [optional]



