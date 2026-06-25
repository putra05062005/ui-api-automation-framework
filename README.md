<div align="center">

# 🚀 UI & API Automation Framework

### Selenium • Rest Assured • Cucumber • Java • GitHub Actions

<p align="center">

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-4-green?style=for-the-badge&logo=selenium)
![RestAssured](https://img.shields.io/badge/RestAssured-API-blue?style=for-the-badge)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen?style=for-the-badge&logo=cucumber)
![Gradle](https://img.shields.io/badge/Gradle-Build-blue?style=for-the-badge&logo=gradle)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-CI-success?style=for-the-badge&logo=githubactions)

</p>

Automation Testing Framework that combines **Web UI Testing** and **API Testing**
using **Selenium**, **Rest Assured**, **Cucumber**, **Gradle**, and **GitHub Actions**
inside one repository.

</div>

---

# 📖 Overview

This project was built as a Final Automation Testing Project.

The framework combines **UI Automation** and **API Automation** in one repository while following software testing best practices.

The project implements:

- ✅ Page Object Model (POM)
- ✅ Behavior Driven Development (BDD)
- ✅ Selenium WebDriver
- ✅ Rest Assured
- ✅ Cucumber
- ✅ Gradle
- ✅ GitHub Actions
- ✅ HTML Report
- ✅ JSON Report

---

# 🛠 Tech Stack

| Technology | Description |
|------------|-------------|
| Java 17 | Programming Language |
| Selenium WebDriver | UI Automation |
| Rest Assured | API Automation |
| Cucumber | BDD Testing |
| JUnit 5 | Assertions |
| Gradle | Build Tool |
| GitHub Actions | Continuous Integration |

---

# 📂 Project Structure

```text
automation-framework
│
├── .github
│   └── workflows
│       └── test.yml
│
├── src
│   └── test
│       ├── java
│       │
│       ├── api
│       │   ├── ApiSteps.java
│       │   └── runners
│       │       └── ApiRunner.java
│       │
│       ├── common
│       │   └── DriverManager.java
│       │
│       └── web
│           ├── pages
│           ├── runners
│           └── steps
│
│
└── resources
    └── features
        ├── api
        └── web
```

---

# 🌐 Web Automation

Target Website

https://www.saucedemo.com/

---

## Automated Scenario

✅ Login

✅ Add Product to Cart

✅ Checkout Product

✅ Verify Checkout Success

---

## Design Pattern

This project follows the **Page Object Model (POM)**.

Pages

- LoginPage
- ProductPage
- CartPage
- CheckoutPage

---

# 🔗 API Automation

Target API

https://jsonplaceholder.typicode.com

---

## Automated Scenario

| API | Status |
|------|--------|
| GET List Users | ✅ |
| GET User by ID | ✅ |
| POST Create User | ✅ |
| PUT Update User | ✅ |
| DELETE User | ✅ |

---

## API Validation

This framework validates

- HTTP Status Code
- Response Body
- User ID
- User Name
- User Email
- Created User
- Updated User

---

# ▶️ Running Test

## Run Web Automation

```bash
./gradlew runWeb
```

---

## Run API Automation

```bash
./gradlew runApi
```

---

## Build Project

```bash
./gradlew clean build
```

---

# 📊 Test Reports

Cucumber automatically generates reports after execution.

```
build/
└── reports/
    └── cucumber/
        ├── api-report.html
        ├── api-report.json
        ├── web-report.html
        └── web-report.json
```

---

# ⚙ GitHub Actions

The project uses GitHub Actions for Continuous Integration.

Workflow is executed on:

- ✅ Push
- ✅ Pull Request
- ✅ Manual Trigger

Workflow automatically performs:

- Checkout Repository
- Setup Java
- Build Project
- Execute Web Test
- Execute API Test
- Generate Reports
- Upload Reports

---

# 📸 Screenshots

## GitHub Actions

> Replace with your screenshot

```
images/github-actions.png
```

---

## Web Automation



```
images/web-report.png
```

---

## API Automation

```
images/api-report.png
```

---

# 🚀 Framework Features

- Selenium WebDriver
- Rest Assured
- Cucumber
- Gradle
- GitHub Actions
- HTML Report
- JSON Report
- Page Object Model
- API Validation
- Web Automation
- API Automation

---

# 📌 Future Improvements

- Docker Integration
- Jenkins Pipeline
- Allure Report
- Parallel Testing
- Cross Browser Testing
- Data Driven Testing

---

# 👨‍💻 Author

## Pahala Putra Tambunan

**Diploma in Computer Technology**

Institut Teknologi Del

---

### 🌐 Connect with Me

**GitHub**

https://github.com/putra05062005

**LinkedIn**

https://www.linkedin.com/in/pahala-putra-t-403915335/

**Portfolio**

https://flyingbird05062005.wixsite.com/myportofolio

**Email**

rftkohin@gmail.com

---

<div align="center">

## ⭐ Star this repository if you found it useful!

Made with ❤️ using Java, Selenium, Rest Assured, Cucumber and GitHub Actions.

</div>