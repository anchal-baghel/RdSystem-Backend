# 🏦 RdSystem - Full-Stack Financial Backend API

This repository houses the core **RESTful API** engine for the Recurring Deposit Management System. Built with **Spring Boot 3.x**, it automates complex banking logic, including user KYC management, transaction logging, and automated fine calculations.

---

## 📖 API Documentation (Swagger/OpenAPI)

The project is fully documented using **OpenAPI 3.1**. This interactive Swagger interface allows for real-time testing of endpoints and clear visualization of request/response schemas.

### 🖥️ Interactive API Dashboard
| 🛠️ User Controller | 📊 Passbook Controller |
| :---: | :---: |
| ![User API](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshot/rduser.png?raw=true) | ![Passbook API](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshot/rdpassbook.png?raw=true) |

### 🏗️ Data Models (Schemas)
| Rduser Model | UserPassbook DTO | Rdpassbook Model |
| :---: | :---: | :---: |
| ![Rduser Model](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshot/reduser%20variable.png?raw=true) | ![DTO Model](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshot/DTO.png?raw=true) | ![Passbook Model](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshot/rdpassbook%20variable.png?raw=true) |
---

## 🚀 Advanced Backend Features

* **Automated Fine Calculation Engine:** Implemented service-layer logic to calculate `fineamt` dynamically based on the number of `lastday` (late days) for each installment.
* **Optimized Data Transfer (DTO Pattern):** Uses `UserPassbookDTO` to ensure only essential financial data is sent to the frontend, improving performance.
* **Comprehensive KYC Schema:** Tracks detailed information including `panNo`, `adharNo`, `accountNo`, and `nomineeDetails`.
* **CORS Integration:** Fully pre-configured `CorsConfig.java` for seamless communication with React dashboards.

---

## 📂 Data Models Summary

| Model | Description | Key Fields |
| :--- | :--- | :--- |
| **Rduser** | Core User Entity | `panNo`, `adharNo`, `accountNo`, `nomineeName`, `rdAmt` |
| **Rdpassbook** | Transaction Ledger | `rid`, `rddate`, `rdamt`, `fineamt`, `lastday` |
| **UserPassbookDTO** | Optimized View | `name`, `rddate`, `rdamt`, `account_no` |

---

## 🛠️ Technology Stack

| Layer | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 5.0 (Java 17) |
| **API Docs** | Swagger UI / OpenAPI 3.1 |
| **Database** | PostgreSQL |
| **Build Tool** | Gradle |

---

## ⚙️ Setup & Local Access

1. **Clone:** `git clone https://github.com/anchal-baghel/RdSystem-Backend.git`
2. **Database:** Update `application.properties` with your credentials.
3. **Run:** `./gradlew bootRun`
4. **Swagger UI:** `http://localhost:8080/swagger-ui.html`.

---

## 🤝 Connect
**Anchal Baghel** - [LinkedIn](https://www.linkedin.com/in/anchal-baghel/) | [Portfolio](https://anchalbaghel.netlify.app)
