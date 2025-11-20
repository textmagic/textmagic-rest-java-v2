

# ModelFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** |  |  |
|**originalName** | **String** |  |  |
|**mimeType** | **String** |  |  |
|**size** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | File type. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**previewUrl** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**metadata** | [**FileMetadata**](FileMetadata.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ATTACHMENT | &quot;attachment&quot; |
| IMPORT | &quot;import&quot; |
| RAW_EMAIL | &quot;raw_email&quot; |
| INLINE_ATTACHMENT | &quot;inline_attachment&quot; |
| CHAT_ATTACHMENT | &quot;chat-attachment&quot; |
| KNOWLEDGE_BASE | &quot;knowledge_base&quot; |
| FACEBOOK_PAGE_PICTURE | &quot;facebook_page_picture&quot; |
| INSTAGRAM_ACCOUNT_PICTURE | &quot;instagram_account_picture&quot; |
| LOGO | &quot;logo&quot; |



