# UI & API Automation Framework

![Java](https://img.shields.io/badge/Java-17-blue)
![Gradle](https://img.shields.io/badge/Gradle-Build-green)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen)
![RestAssured](https://img.shields.io/badge/RestAssured-API-orange)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-green)
![GitHub Actions](https://img.shields.io/badge/GitHub-Actions-blue)

Automation Testing Framework menggunakan **Java**, **Selenium WebDriver**, **Rest Assured**, **Cucumber**, dan **Gradle** untuk melakukan pengujian **Web UI** dan **REST API** dalam satu project.

---

## 🚀 Technologies & Tools

- Java 17
- Gradle
- Selenium WebDriver
- Rest Assured
- Cucumber (Gherkin)
- JUnit
- GitHub Actions
- ChromeDriver

---

## 📂 Project Structure

```
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
│       │   ├── runners
│       │   ├── steps
│       │   └── utils
│       │
│       ├── web
│       │   ├── pages
│       │   ├── runners
│       │   └── steps
│       │
│       ├── common
│       │
│       └── hooks
│
│
│       └── resources
│           └── features
│               ├── api
│               └── web
│
├── build.gradle
└── README.md
```

---

## 🧪 Test Coverage

### Web UI Automation

Website:
https://www.saucedemo.com/

Scenario:

- Login
- Add Product
- Checkout Product
- Verify Checkout Success

---

### API Automation

Public API:
https://dummyapi.io/

Scenario:

- Get List Users
- Validate Status Code
- Validate Response Body

---

## ▶ Running Test

Run Web Test

```bash
./gradlew webTest
```

Run API Test

```bash
./gradlew apiTest
```

Run All Tests

```bash
./gradlew clean build
```

---

## 📊 Test Report

After execution, Cucumber reports will be generated automatically.

HTML Report

```
build/reports/cucumber.html
```

JSON Report

```
build/reports/cucumber.json
```

---

## ⚙ GitHub Actions

This project includes GitHub Actions for Continuous Integration.

Workflow will run:

- On Pull Request
- Manual Trigger (workflow_dispatch)

Pipeline:

```
Build Project
      ↓
Run Web Test
      ↓
Run API Test
```

---

## 📚 Design Pattern

This project implements:

- Page Object Model (POM)
- Gherkin Feature Files
- Cucumber Step Definitions
- Explicit Wait
- Reusable Driver Manager

---

## 📦 Dependencies

- Selenium
- Rest Assured
- Cucumber Java
- Cucumber JUnit
- JUnit
- WebDriverManager

---

## 👨‍💻 Author

**Pahala Putra Tambunan**

LinkedIn:
https://www.linkedin.com/in/pahala-putra-t-403915335/

Portfolio:
https://flyingbird05062005.wixsite.com/myportofolio