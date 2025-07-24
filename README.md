# Spring Boot Inventory REST API

This is a simple RESTful API for managing product inventory, built using Spring Boot during my internship.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- REST API

## Features
- Add a new product
- Retrieve all products
- Update product by ID
- Delete product by ID

## API Endpoints

| Method | Endpoint             | Description             |
|--------|----------------------|-------------------------|
| POST   | /api/v1/save         | Add a new product       |
| GET    | /api/v1/read         | Get all products        |
| PUT    | /api/v1/update/{id}  | Update product by ID    |
| DELETE | /api/v1/delete/{id}  | Delete product by ID    |

## Code Highlights
- `Product.java` — Entity class with `@Id`, `@GeneratedValue`
- `InventoryController.java` — REST controller with all CRUD endpoints
- `InventoryService.java` — Business logic layer
- `InventoryRepository.java` — JPA repository interface

## Usage
1. Clone the repo
2. Set DB config in `application.properties`
3. Run the app using your IDE or `mvn spring-boot:run`
4. Test using Postman

---

✅ Developed as part of internship at **Palle Technologies**
