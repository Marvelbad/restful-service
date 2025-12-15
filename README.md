# RESTful Demo (Spring Boot)

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9+-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

Учебный RESTful backend-проект на Spring Boot.  
Проект выполнен как завершённая практическая работа с фокусом на архитектуру, сборку и запуск приложения вне IDE.

---

## 🚀 Технологии

- Java 17
- Spring Boot 4.0.0
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

---

## 📌 Возможности

- REST API для работы с пользователями
- CRUD-операции
- Разделение слоёв: controller / service / repository
- Работа с БД через JPA
- Сборка приложения в `jar`
- Запуск приложения без IDE

---

## 🗂 Структура проекта

```text
src/
 └── main/
     ├── java/
     │   └── com.example.demo
     │       ├── controller
     │       │   └── UserController
     │       ├── service
     │       │   └── UserService
     │       ├── repository
     │       │   └── UserRepository
     │       ├── model
     │       │   └── User
     │       └── DemoApplication
     └── resources/
         └── application.yml



🧠 Ключевые моменты проекта
	•	Понимание разницы между запуском из IDE и запуском jar
	•	Работа с Lombok и annotation processing
	•	Явная настройка сборки под Spring Boot 4
	•	Чтение логов старта Spring Boot
	•	Корректное разделение слоёв приложения

⸻

❌ Что намеренно не реализовано
	•	Docker / Docker Compose
	•	CI/CD
	•	Деплой на внешний сервер
	•	Production-конфигурации
