# Use official OpenJDK 21 slim image
FROM openjdk:21-jdk-slim

WORKDIR /app
COPY target/plan-order-service*.jar plan-order-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "plan-order-service.jar"]
