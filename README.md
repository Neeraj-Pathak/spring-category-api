# Spring Boot REST API - Category Management

This is a simple REST API built using **Spring Boot**, **Spring Data JPA**, and **H2 Database** to perform CRUD operations on `Category` objects.

## 📌 Features

- Add a new category
- Get all categories
- Update an existing category
- Delete a category
- In-memory H2 database
- Tested using Postman

## 🧰 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Postman (for testing)

## 📁 Project Structure

- `model/` – Contains the `Category` entity
- `repository/` – `CategoryRepository` interface
- `service/` – Service interface and implementation
- `controller/` – REST controller
- `resources/` – Configuration file (`application.properties`)

## 🔧 Setup Instructions

1. Clone the repository
2. Import as a Maven project in your IDE (like IntelliJ or Eclipse)
3. Run `FirstSpringApplication.java`
4. Use Postman to hit endpoints like:

   - `GET /api/public/categories`
   - `POST /api/public/categories`
   - `PUT /api/public/categories/{id}`
   - `DELETE /api/public/categories/{id}`

## 🔗 Sample POST Request (Postman)

```json
POST /api/public/categories
{
  "categoryName": "Electronics",
  "categoryDescription": "All electronic items"
}
```

## 🗃️ Sample application.properties

```properties
spring.datasource.url=jdbc:h2:mem:categorydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

## 🖥️ H2 Console

After running the app, go to: `http://localhost:8080/h2-console`  
- JDBC URL: `jdbc:h2:mem:categorydb`
- Username: `sa`  
- Password: *(leave blank)*

---

## 📸 Screenshots (Optional)
Add screenshots of Postman requests and H2 console output here.
POST.
![Post](https://github.com/user-attachments/assets/620a0fd1-e5a4-4807-b15c-6c04d94cd41b)
GET.
![Get](https://github.com/user-attachments/assets/cb0d0e9d-9bc7-4209-8814-ec861b165a51)
DELETE.
![Delete](https://github.com/user-attachments/assets/1775c308-2871-4e54-a1f9-5559fb3ca5d2)
PUT.
![Put](https://github.com/user-attachments/assets/e9433c70-84d7-42b6-8ae8-00127a409d27)

H2.
![H2](https://github.com/user-attachments/assets/ff1c768c-b44b-4450-9e2a-3e7704ff7bfb)


---

## 📜 License
This project is open-source and free to use.
