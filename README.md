# Customer and Contact Management System

A Spring Boot application for managing customers and their contact information with basic CRUD operations and entity relationships.

## 📋 Overview

The system provides:
- `Customer` entity with One-to-Many relationship to `Contact`
- Operations to create customers with their contacts
- Endpoints for listing customers and contacts
- Basic validation and error handling

## 🛠️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Lombok
- Maven

## 🗃️ Data Model

### Core Entities

#### Customer
```java
@Entity
public class Customer {
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Contact> contacts;
}
