FROM mcr.microsoft.com/devcontainers/java:1-17-bullseye

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory
WORKDIR /workspace

# Expose the port that Spring Boot will run on
EXPOSE 8080
