# 📱 Customer and Contact Management System

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
```

### Contact
```java

@Entity
public class Contact {
    private Long id;
    private String phone;
    private String email;
    @ManyToOne
    private Customer customer;
}
```

## 🔌 Available Endpoints
### Customers
```SQL
{
  "name": "Customer Name",
  "contacts": [
    {
      "phone": "123456789",
      "email": "email@example.com"
    }
  ]
}
```

GET /customers - List all customers with their contacts

GET /customers/{id}/contacts - List all contacts for a specific customer

### Contacts

```SQL

{
  "phone": "987654321",
  "email": "another@email.com",
  "customerId": 1
}

```
POST /contacts - Create a new contact associated with an existing customer
