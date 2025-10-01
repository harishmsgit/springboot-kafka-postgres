# Spring Boot + Kafka + PostgreSQL

A modern microservice application built with Spring Boot that integrates Apache Kafka for event-driven messaging and PostgreSQL for data persistence.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Architecture](#architecture)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This project demonstrates a production-ready implementation of a Spring Boot application that leverages:
- **Apache Kafka** for asynchronous message processing and event streaming
- **PostgreSQL** for reliable data storage and management
- **Spring Boot** for rapid application development with enterprise-grade features

## ✨ Features

- **Event-Driven Architecture**: Publish and consume messages using Kafka
- **Data Persistence**: Store and retrieve data from PostgreSQL database
- **RESTful APIs**: Expose well-designed REST endpoints
- **Configuration Management**: Externalized configuration using Spring profiles
- **Error Handling**: Robust exception handling and logging
- **Scalability**: Designed for horizontal scaling

## 🛠 Tech Stack

- **Framework**: Spring Boot 
- **Messaging**: Apache Kafka
- **Database**: PostgreSQL
- **Build Tool**: Maven / Gradle
- **Java Version**: 11+

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK 11** or higher
- **Maven 3.6+** or **Gradle 7+**
- **Docker** and **Docker Compose** (for running Kafka and PostgreSQL)
- **Git**

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/harishmsgit/springboot-kafka-postgres.git
   cd springboot-kafka-postgres
   ```

2. **Start Kafka and PostgreSQL using Docker Compose**
   ```bash
   docker-compose up -d
   ```

3. **Build the application**
   
   Using Maven:
   ```bash
   mvn clean install
   ```
   
   Using Gradle:
   ```bash
   ./gradlew build
   ```

## ⚙️ Configuration

Update the `application.properties` or `application.yml` file with your configuration:

```properties
# PostgreSQL Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdb
spring.datasource.username=your_username
spring.datasource.password=your_password

# Kafka Configuration
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=your-consumer-group
```

## 🏃 Running the Application

Start the Spring Boot application:

Using Maven:
```bash
mvn spring-boot:run
```

Using Gradle:
```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080` (default port).

## 📚 API Documentation

Once the application is running, you can access:

- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **API Docs**: `http://localhost:8080/v3/api-docs`

### Example Endpoints

```
POST   /api/messages     - Send a message to Kafka
GET    /api/messages     - Retrieve messages from PostgreSQL
GET    /api/messages/{id} - Get message by ID
```

## 🏗 Architecture

```
┌─────────────┐      ┌──────────────┐      ┌──────────────┐
│   Client    │─────▶│ Spring Boot  │─────▶│  PostgreSQL  │
│             │      │ Application  │      │   Database   │
└─────────────┘      └──────┬───────┘      └──────────────┘
                            │
                            ▼
                     ┌──────────────┐
                     │ Apache Kafka │
                     │   Cluster    │
                     └──────────────┘
```

### Key Components

- **Controllers**: Handle HTTP requests and responses
- **Services**: Business logic layer
- **Repositories**: Data access layer for PostgreSQL
- **Kafka Producers**: Publish messages to Kafka topics
- **Kafka Consumers**: Subscribe and process messages from Kafka topics
- **Models**: Entity and DTO classes

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Made with ❤️ by [harishmsgit](https://github.com/harishmsgit)**
