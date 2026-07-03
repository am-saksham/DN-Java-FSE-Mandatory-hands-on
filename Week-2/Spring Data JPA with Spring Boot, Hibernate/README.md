# Spring Data JPA with Spring Boot and Hibernate

This repository contains the **orm-learn** project, developed as part of **Week 2** of the **Java FSE Mandatory Hands-on**. It demonstrates the seamless integration of **Spring Boot**, **Spring Data JPA**, and **Hibernate** with a **MySQL** database.

## 🚀 Project Overview

The `orm-learn` application is a Spring Boot application that connects to a local MySQL database to manage `Country` data. It highlights the transition from boilerplate-heavy traditional JDBC/Hibernate code to the streamlined, declarative approach provided by Spring Data JPA.

## 🛠️ Technologies Used

- **Spring Boot 2.7.18** – Rapid application configuration and dependency management.
- **Spring Data JPA** – Repository abstraction and automatic query generation.
- **Hibernate** – ORM (Object-Relational Mapping) implementation.
- **MySQL 8.0** – Relational database management system.
- **Maven** – Build automation and dependency management.

---

# 🛠️ Setup and Installation

## 1. Database Configuration

Before running the application, create the database and seed it with the required data.

Execute the following SQL script in your MySQL client:

```sql
CREATE SCHEMA ormlearn;

USE ormlearn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
```

---

## 2. Configure Application Properties

Open the following file:

```
src/main/resources/application.properties
```

Configure it with your local MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

Replace `YOUR_MYSQL_PASSWORD` with your actual MySQL password.

---

## 3. Run the Application

Navigate to the project directory:

```bash
cd orm-learn
```

Run the application using Maven:

```bash
mvn spring-boot:run
```

Upon successful execution:

- The Spring Boot application context will start.
- Hibernate will generate the required SQL `SELECT` statements.
- The retrieved `Country` records will be printed to the console.

---

# 🧠 Core Concepts

## JPA (Java Persistence API)

JPA is the **specification** for Object-Relational Mapping (ORM) in Java.

It defines standard interfaces and annotations such as:

- `@Entity`
- `@Table`
- `@Id`
- `@Column`

JPA itself does **not** provide an implementation.

---

## Hibernate

Hibernate is the **implementation** of the JPA specification.

It:

- Reads JPA annotations.
- Maps Java objects to database tables.
- Generates SQL queries automatically.
- Manages persistence, caching, and transactions.

---

## Spring Data JPA

Spring Data JPA is an **abstraction layer** built on top of JPA (typically Hibernate).

Instead of writing DAO implementations manually, you simply create an interface like:

```java
public interface CountryRepository extends JpaRepository<Country, String> {
}
```

Spring Data JPA automatically provides implementations for common CRUD operations, query generation, pagination, sorting, and transaction management, significantly reducing boilerplate code.

---

# 📂 Project Structure

```
orm-learn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

# ✅ Features

- Spring Boot application setup
- MySQL database integration
- Hibernate ORM
- Spring Data JPA repositories
- Automatic CRUD operations
- Clean and maintainable project structure

---

# 📌 Learning Outcomes

After completing this project, you will understand:

- How Spring Boot integrates with MySQL.
- The role of JPA, Hibernate, and Spring Data JPA.
- How to create entities using JPA annotations.
- How to use `JpaRepository` for database operations.
- How Spring Data JPA eliminates boilerplate persistence code.