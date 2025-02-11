# Spring Security with JWT Authentication

## Overview
This project is a **Spring Boot** application that integrates **Spring Security** with **JWT-based authentication**. It includes user authentication, registration, and role-based access control. The project also provides a **student management system** as an example of securing API endpoints.

## Features
- **User Authentication** with JWT
- **Role-based Access Control**
- **Spring Security with CSRF disabled**
- **RESTful API with secured endpoints**
- **MySQL database integration** using JPA

## Tech Stack
- **Java 21**
- **Spring Boot 3.3.4**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA**
- **MySQL Database**
- **Maven**

## Project Structure
```
SpringSecurity/
│── src/main/java/com/example/SpringSecurity/
│   ├── config/
│   │   ├── SecurityConfig.java
│   │   ├── JwtFilter.java
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── StudentController.java
│   ├── model/
│   │   ├── Users.java
│   │   ├── UserPrincipal.java
│   │   ├── Student.java
│   ├── repo/
│   │   ├── UserRepo.java
│   ├── service/
│   │   ├── JWTService.java
│   │   ├── UserService.java
│   │   ├── MyUserDetailService.java
│   ├── SpringSecurityApplication.java
│── src/main/resources/
│   ├── application.properties
│── pom.xml
```

## Setup Instructions
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Rushi0207/SpringSecurity
cd SpringSecurity
```

### 2️⃣ Configure Database
Update `src/main/resources/application.properties` with your MySQL database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sec
spring.datasource.username=root
spring.datasource.password=
```

### 3️⃣ Build and Run the Project
```sh
mvn clean install
mvn spring-boot:run
```

## API Endpoints
| Endpoint        | Method | Description |
|---------------|--------|-------------|
| `/register`   | POST   | Register a new user |
| `/login`      | POST   | Authenticate and get JWT Token |
| `/students`   | GET    | Get all students (Secured) |
| `/students`   | POST   | Add a new student (Secured) |

### Example JSON for Register/Login
```json
{
  "id": 1,
  "username": "testuser",
  "password": "password"
}
```

### Using JWT for Authentication
- After **successful login**, a **JWT token** is returned.
- Use this token in the **Authorization header** for secure endpoints:
```sh
Authorization: Bearer <your-token>
```

## Security Configuration (SecurityConfig.java)
- **CSRF disabled** for REST API compatibility
- **JWT filter** applied before authentication
- **Permits `/register` and `/login`** while securing other endpoints

## Possible Enhancements
- **Role-based authentication (Admin, User, etc.)**
- **Token expiration handling & refresh tokens**
- **User profile management**

## License
This project is open-source. Feel free to use and modify it.

