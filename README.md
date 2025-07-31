# 📚 E-Learning Platform – Spring Boot Backend

This is a Dockerized Java backend project for an e-learning system built with **Spring Boot**, **Spring Data JPA**, and **MySQL**/**H2**. It provides REST APIs for managing users, authors, courses, lectures, and related educational content.

---

## 🚀 Features

- 📦 **Modular Architecture** (Controller, Service, Repository, DTO)
- 🗃️ **Spring Data JPA** with **Hibernate ORM**
- 🧮 **MySQL (Production)** and **H2 (Development)** support
- 🛠️ **Bean Validation** for secure and clean inputs
- 📖 **Swagger (OpenAPI)** integration for API documentation
- 🧪 **JUnit 5** Test Cases for services and controllers
- 🐳 **Dockerized** using a custom `Dockerfile`
- 📑 **Entity Auditing** (`created_at`, `updated_at`, `created_by`, etc.)

---

## 🛠️ Tech Stack

| Layer           | Technology              |
|----------------|--------------------------|
| Language        | Java                    |
| Framework       | Spring Boot             |
| Build Tool      | Maven                   |
| Database        | MySQL / H2              |
| ORM             | Hibernate               |
| API Docs        | Swagger (OpenAPI)       |
| Containerization| Docker                  |
| Testing         | JUnit 5                 |

---

## 🗃️ ER Diagram (Entity Overview)

<img src="docs/erd.png" alt="ER Diagram" width="700"/>

> *(Replace `docs/erd.png` with actual image path or link. You can export your `jkl.pdf` to PNG and store it in a `docs/` folder.)*

---

## 📂 Project Structure

spring-pro/
├── src/
│ ├── main/java/com/example/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── model/
│ │ ├── dto/
│ │ └── repository/
│ └── resources/
│ ├── application.properties
│ └── schema.sql (optional)
├── target/
├── Dockerfile
└── README.md

yaml
Copy
Edit

---

## 🐳 Docker Usage

### 🔧 Build Image
```bash
docker build -t elearning-app .
▶️ Run Container
bash
Copy
Edit
docker run -p 8080:8080 elearning-app
🧪 Run Tests

mvn test
🔗 Swagger UI
Once the app is running, access Swagger docs at:


http://localhost:8080/swagger-ui/index.html

🧠 Future Enhancements
 JWT Authentication

 Docker Compose setup with MySQL

 Admin vs Student role-based access

 Pagination & Filtering on course listings

 Frontend UI integration (React/Angular)

👨‍💻 Author
Priyanshu Kumar
GitHub: @priyansh902

📜 License
This project is open-source and available under the MIT License.

markdown
Copy
Edit

---

