FROM mcr.microsoft.com/devcontainers/java:1-17-bullseye

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory
WORKDIR /workspace

# Copy Maven configuration
COPY pom.xml .

# Download dependencies (for better Docker layer caching)
RUN mvn dependency:resolve

# Copy the source code
COPY . .

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Default command to run when container starts
CMD ["mvn", "spring-boot:run"]