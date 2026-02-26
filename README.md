# 🏦 RdSystem - Full-Stack Financial Backend API

This repository houses the core **RESTful API** engine for the Recurring Deposit Management System. Built with **Spring Boot 3.x**, it automates complex banking logic, including user KYC management, transaction logging, and automated fine calculations.

---

## 📖 API Documentation (Swagger/OpenAPI)

The project is fully documented using **OpenAPI 3.1**. This interactive Swagger interface allows for real-time testing of endpoints and clear visualization of request/response schemas.

### 🖥️ Interactive API Dashboard
![Swagger Interface](https://github.com/anchal-baghel/RdSystem-Backend/blob/main/screenshots/swagger-ui.png?raw=true)

### 🛠️ Key Controllers
The backend is modularized into specialized controllers for better maintainability:

* **`rdusercntr` (User Management):**
    * `POST /save` - New User Registration with full KYC.
    * `PUT /updt` - Update existing user records.
    * `GET /rduser` - Fetch all registered RD holders.
    * `DELETE /del/{id}` - Remove user records safely.
* **`rdpassbookcntr` (Financial Operations):**
    * `POST /passbooksave` - Record monthly installments.
    * `GET /passbook` - Retrieve complete transaction history.
    * `GET /passbookdetails/{rid}` - Fetch specific user passbook details.

---

## 🚀 Advanced Backend Features

* **Automated Fine Calculation Engine:** Implemented service-layer logic to calculate `fineamt` dynamically based on the number of `lastday` (late days) for each installment.
* **Optimized Data Transfer (DTO Pattern):** Uses `UserPassbookDTO` to ensure only essential financial data is sent to the frontend, reducing payload size and improving performance.
* **Comprehensive KYC Schema:** Tracks detailed information including `panNo`, `adharNo`, `accountNo`, and `nomineeDetails`.
* **CORS Integration:** Fully pre-configured `CorsConfig.java` for seamless communication with React/Vite dashboards.

---

## 📂 Data Models (Schemas)

| Model | Description | Key Fields |
| :--- | :--- | :--- |
| **Rduser** | Core User Entity | `panNo`, `adharNo`, `accountNo`, `nomineeName`, `rdAmt` |
| **Rdpassbook** | Transaction Ledger | `rid`, `rddate`, `rdamt`, `fineamt`, `lastday` |
| **UserPassbookDTO** | Optimized View | `name`, `rddate`, `rdamt`, `account_no` |

---

## 🛠️ Technology Stack

| Layer | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 3.x (Java 17) |
| **API Docs** | Swagger UI / OpenAPI 3.1 |
| **Database** | PostgreSQL |
| **Build Tool** | Gradle |

---

## ⚙️ Setup & Local Access

1. **Clone:** `git clone https://github.com/anchal-baghel/RdSystem-Backend.git`
2. **Database:** Update `application.properties` with your MySQL credentials.
3. **Build & Run:**
   ```bash
   ./gradlew bootRun
