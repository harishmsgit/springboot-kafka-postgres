# Use official OpenJDK 17 slim image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file into the container
COPY target/plan-stock-service*.jar plan-stock-service.jar

# Expose application port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "plan-stock-service.jar"]