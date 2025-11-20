

# DoCarrierLookupResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cost** | **BigDecimal** | The cost to check that one number is constant – 0.04 in your account currency. |  |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**local** | **String** | Phone number in [National format](https://en.wikipedia.org/wiki/National_conventions_for_writing_telephone_numbers). |  |
|**type** | [**TypeEnum**](#TypeEnum) | Phone number type. |  |
|**carrier** | **String** | Carrier name. |  |
|**number164** | **String** | Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164). |  |
|**valid** | **Boolean** | This field shows whether the entered phone number is valid or not. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MOBILE | &quot;mobile&quot; |
| LANDLINE | &quot;landline&quot; |
| VOIP | &quot;voip&quot; |



