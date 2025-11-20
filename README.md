[comment]: <> (HEAD)
# TextMagic Java SDK
This library provides you with an easy way of sending SMS and receiving replies by integrating the TextMagic SMS Gateway into your Java application.

## What Is TextMagic?
TextMagic’s application programming interface (API) provides the communication link between your application and TextMagic’s SMS Gateway, allowing you to send and receive text messages and to check the delivery status of text messages you’ve already sent.

[comment]: <> (/HEAD)


## Requirements

1. Java 11+
2. Maven/Gradle

## Migration Guide from v2.x to v3.x

Version 3.0 introduces several breaking changes to improve performance, security, and maintainability. Please review this guide carefully before upgrading.

### Breaking Changes

#### 1. Java Version Requirement

**Old (v2.x):**
- Minimum Java version: 1.7+

**New (v3.x):**
- Minimum Java version: 11+

**Action Required:**
```xml
<!-- Update your pom.xml -->
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>
```

#### 2. Date/Time Types

**Old (v2.x):**
```java
import java.util.Date;

Date createdAt = message.getCreatedAt();
```

**New (v3.x):**
```java
import java.time.OffsetDateTime;

OffsetDateTime createdAt = message.getCreatedAt();
```

**Action Required:**
- Replace all `java.util.Date` with `java.time.OffsetDateTime`
- Update date formatting logic:
  ```java
  // Old
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  String date = sdf.format(createdAt);

  // New
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
  String date = createdAt.format(formatter);
  ```

#### 3. HTTP Client Library

**Old (v2.x):**
- OkHttp 2.7.5

**New (v3.x):**
- OkHttp 4.12.0

**Action Required:**
- If you use custom OkHttp interceptors, update to OkHttp 4.x API:
  ```java
  // Old (v2.x)
  client.interceptors().add(new Interceptor() {
      @Override
      public Response intercept(Chain chain) throws IOException {
          // ...
      }
  });

  // New (v3.x)
  client.addInterceptor(new Interceptor() {
      @NotNull
      @Override
      public Response intercept(@NotNull Chain chain) throws IOException {
          // ...
      }
  });

#### 4. Model Name Changes

**Old (v2.x):**
```java
import com.textmagic.sdk.model.ContactList;
import com.textmagic.sdk.model.MessageFile;

ContactList list = api.getList(123);
MessageFile file = api.getFile(456);
```

**New (v3.x):**
```java
import com.textmagic.sdk.model.ModelList;
import com.textmagic.sdk.model.ModelFile;

ModelList list = api.getList(123);
ModelFile file = api.getFile(456);
```

**Action Required:**
- Replace `ContactList` → `ModelList` in all imports and type declarations
- Replace `MessageFile` → `ModelFile` in all imports and type declarations
- Use IDE's "Find and Replace" feature:
  ```
  Find: import com.textmagic.sdk.model.ContactList;
  Replace: import com.textmagic.sdk.model.ModelList;

  Find: import com.textmagic.sdk.model.MessageFile;
  Replace: import com.textmagic.sdk.model.ModelFile;

  Find: ContactList
  Replace: ModelList

  Find: MessageFile
  Replace: ModelFile
  ```

**Why this change?**
- v2.x used custom names (`ContactList`, `MessageFile`) via preprocessing script
- v3.x uses OpenAPI Generator's standard naming convention with `Model` prefix
- This aligns with industry best practices and improves consistency

#### 5. Dependencies

**Updated dependencies:**
- `com.squareup.okhttp3:okhttp` 2.7.5 → 4.12.0
- `com.google.code.gson:gson` 2.8.x → 2.10.1
- `org.apache.commons:commons-lang3` 3.x → 3.18.0

**Action Required:**
- Review your dependency tree for conflicts:
  ```bash
  mvn dependency:tree
  ```
- Update any conflicting dependencies in your project

### Migration Steps

1. **Update Java version to 11+**
   ```bash
   java -version  # Verify Java 11 or higher
   ```

2. **Update SDK version in pom.xml**
   ```xml
   <dependency>
       <groupId>com.textmagic.sdk</groupId>
       <artifactId>textmagic-java-sdk</artifactId>
       <version>3.0.43863</version>
   </dependency>
   ```

3. **Update imports**
   - Replace `java.util.Date` → `java.time.OffsetDateTime`
   - Replace `java.util.Calendar` → `java.time.ZonedDateTime`
   - Replace `com.textmagic.sdk.model.ContactList` → `com.textmagic.sdk.model.ModelList`
   - Replace `com.textmagic.sdk.model.MessageFile` → `com.textmagic.sdk.model.ModelFile`

4. **Update date/time handling**
   - Review all date parsing and formatting code
   - Use `java.time` API instead of `SimpleDateFormat`

5. **Update model references**
   - Search and replace `ContactList` → `ModelList`
   - Search and replace `MessageFile` → `ModelFile`
   - Recommended: Use IDE's "Find in Path" with scope limited to your code

6. **Test thoroughly**
   - Run your test suite
   - Pay special attention to date/time operations
   - Verify file upload functionality

### Common Issues

#### Issue: `java.lang.UnsupportedClassVersionError`

**Cause:** Your project is compiled with Java < 11

**Solution:**
```xml
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>
```

#### Issue: `cannot find symbol: class Date`

**Cause:** Missing import after migration

**Solution:**
```java
// Remove
import java.util.Date;

// Add
import java.time.OffsetDateTime;
```

#### Issue: OkHttp compatibility errors

**Cause:** Conflicting OkHttp versions in classpath

**Solution:**
```xml
<!-- Exclude old OkHttp from other dependencies -->
<dependency>
    <groupId>some.other.library</groupId>
    <artifactId>library</artifactId>
    <version>1.0.0</version>
    <exclusions>
        <exclusion>
            <groupId>com.squareup.okhttp</groupId>
            <artifactId>okhttp</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

#### Issue: `cannot find symbol: class ContactList` or `cannot find symbol: class MessageFile`

**Cause:** Model names changed from `ContactList`/`MessageFile` to `ModelList`/`ModelFile`

**Solution:**
```java
// Old (v2.x)
import com.textmagic.sdk.model.ContactList;
ContactList myList = api.getList(123);

// New (v3.x)
import com.textmagic.sdk.model.ModelList;
ModelList myList = api.getList(123);
```

**Quick fix with sed (Unix/Mac):**
```bash
# Backup your files first!
find . -name "*.java" -type f -exec sed -i.bak 's/import com\.textmagic\.sdk\.model\.ContactList;/import com.textmagic.sdk.model.ModelList;/g' {} \;
find . -name "*.java" -type f -exec sed -i.bak 's/import com\.textmagic\.sdk\.model\.MessageFile;/import com.textmagic.sdk.model.ModelFile;/g' {} \;
find . -name "*.java" -type f -exec sed -i.bak 's/\bContactList\b/ModelList/g' {} \;
find . -name "*.java" -type f -exec sed -i.bak 's/\bMessageFile\b/ModelFile/g' {} \;
```

### Need Help?

If you encounter issues during migration:
- Check our [GitHub Issues](https://github.com/textmagic/textmagic-rest-java-v2/issues)
- Review the [API Documentation]()
- Contact support at support@textmagic.com

## Installation

### Maven

Add this dependency to your project's POM:
```xml
<dependencies>
    <dependency>
        <groupId>com.textmagic.sdk</groupId>
        <artifactId>textmagic-java-sdk</artifactId>
        <version>3.0.43863</version>
    </dependency>
</dependencies>

### Gradle

Add this dependency to your project's build file:
```groovy
implementation "com.textmagic.sdk:textmagic-java-sdk:3.0.43863"
```

## Usage Example

```java
import com.textmagic.sdk.*;
import com.textmagic.sdk.api.TextMagicApi;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.model.*;
import java.io.File;

public class App {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // put your Username and API Key from https://my.textmagic.com/online/api/rest-api/keys page.
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR_USERNAME");
        BasicAuth.setPassword("YOUR_API_KEY");

        TextMagicApi apiInstance = new TextMagicApi();

        // Simple ping request example
        try {
            PingResponse response = apiInstance.ping();
            System.out.println(response.getPing());
        } catch (ApiException e) {
        System.err.println("Exception when calling ping");
            e.printStackTrace();
        }

        // Send a new message request example
        SendMessageInputObject sendMessageInputObject = new SendMessageInputObject();
        sendMessageInputObject.setText("I love TextMagic!");
        sendMessageInputObject.setPhones("+19998887766");

        try {
            SendMessageResponse response = apiInstance.sendMessage(sendMessageInputObject, true);
            System.out.println(response.getId());
        } catch (ApiException e) {
            System.err.println("Exception when calling sendMessage");
            e.printStackTrace();
        }

        // Get all outgoing messages request example
        try {
            // Put null if you want to use default values
            GetAllOutboundMessagesResponse response = apiInstance.getAllOutboundMessages(1, 10, null);
            System.out.println(response.getResources().get(0).getText());
        } catch (ApiException e) {
            System.err.println("Exception when calling getAllOutboundMessages");
            e.printStackTrace();
        }

        // Upload new avatar for contacts list (group) with Id 3223 example
        File file = new File("test.jpg");
        try {
            ResourceLinkResponse response = apiInstance.uploadListAvatar(file, 3223);
            System.out.println(response.getId());
        } catch (ApiException e) {
            System.err.println("Exception when calling uploadListAvatar");
            e.printStackTrace();
        }
    }
}
```
[comment]: <> (FOOTER)
## License
The library is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).

[comment]: <> (/FOOTER)
