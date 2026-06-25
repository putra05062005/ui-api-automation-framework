# UI & API Automation Testing Framework

Automation Testing Framework built using **Java**, **Gradle**, **Selenium WebDriver**, **Rest Assured**, and **Cucumber (BDD)**. This project demonstrates how to combine **Web UI Testing** and **API Testing** in a single repository while following clean project architecture and Page Object Model (POM).

---

## 🚀 Tech Stack

* Java 17
* Gradle
* Selenium WebDriver
* Rest Assured
* Cucumber (BDD)
* JUnit Platform
* GitHub Actions
* ChromeDriver

---

## 📂 Project Structure

```
src
├── test
│   ├── java
│   │   ├── api
│   │   │   ├── runners
│   │   │   ├── stepdefinitions
│   │   │   └── utils
│   │   │
│   │   ├── web
│   │   │   ├── pages
│   │   │   ├── runners
│   │   │   ├── stepdefinitions
│   │   │   └── utils
│   │   │
│   │   └── common
│   │
│   └── resources
│       └── features
│           ├── api
│           └── web
```

---

## 🌐 Test Target

### Web UI

Website:
https://www.saucedemo.com/

Scenario:

* Login
* Checkout Product

---

### API

Public API:

https://dummyapi.io/

Scenario:

* Get List Users

Authentication uses:

```
app-id
```

inside request header.

---

## 🧪 Features

### Web Automation

* Login
* Product Checkout
* Page Object Model implementation
* Explicit Wait
* Selenium WebDriver

### API Automation

* GET User List
* Response Validation
* Status Code Validation
* JSON Response Validation

---

## ▶ Running Tests

### Run all Web Tests

```bash
./gradlew webTest
```

---

### Run all API Tests

```bash
./gradlew apiTest
```

---

## 📊 Reports

After execution, reports are generated automatically.

HTML Report

```
build/reports/cucumber/web-report.html
```

```
build/reports/cucumber/api-report.html
```

JSON Report

```
build/reports/cucumber/web-report.json
```

```
build/reports/cucumber/api-report.json
```

---

## ⚙ GitHub Actions

This project supports CI/CD using GitHub Actions.

Workflow triggers:

* Push
* Pull Request
* Manual Trigger (workflow_dispatch)

GitHub Actions automatically executes:

* Web UI Test
* API Test

---

## 📖 Design Pattern

This project applies:

* Page Object Model (POM)
* Behavior Driven Development (BDD)
* Cucumber Gherkin
* Modular Test Architecture

---

## 👨‍💻 Author

**Pahala Putra Tambunan**

Computer Technology Student

Institut Teknologi Del

LinkedIn:
https://www.linkedin.com/in/pahala-putra-t-403915335/

Portfolio:
https://flyingbird05062005.wixsite.com/myportofolio
