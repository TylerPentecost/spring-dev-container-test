# spring-dev-container-test

A Spring Boot 3.5.5 application with Java 17 and Maven, configured for development containers.

## Features

- Spring Boot 3.5.5
- Java 17
- Maven build system
- JAR packaging
- Dev Container support for VS Code

## Getting Started

### Using Dev Container (Recommended)

1. Open this project in VS Code
2. Install the "Dev Containers" extension
3. Press `Ctrl+Shift+P` (or `Cmd+Shift+P` on Mac) and select "Dev Containers: Reopen in Container"
4. The container will build and install all dependencies automatically

### Manual Setup

1. Ensure you have Java 17 and Maven installed
2. Run `mvn clean compile` to build the project
3. Run `mvn spring-boot:run` to start the application
4. Visit `http://localhost:8080` to see the application

## Endpoints

- `/` - Hello message
- `/health` - Health check endpoint

## Build and Test

```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Package as JAR
mvn package

# Run the application
mvn spring-boot:run
```