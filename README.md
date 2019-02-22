
### Project Structure

- customer-service-api: Java package defining only the interfaces and the models of the service. 
This package can be consumed by clients in order to use this service (see CustomerClient for an example).
- customer-service-impl: Java package containing the service implementation.

### Maven

Build (and test project)
```bash
./mvnw clean install
# or
./mvnw clean install -DskipTests
```

Run spring application for development
```bash
./mvnw -pl customer-service-impl spring-boot:run
```

Build image and add it to your docker daemon
```bash
./mvnw -pl customer-service-impl compile jib:dockerBuild
```


