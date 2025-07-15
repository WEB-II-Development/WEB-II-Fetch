# WEB II Fetch

**WEB II Fetch** is a mini web application developed using Java EE technologies, focusing on how a client (browser) can fetch data from a backend server using Java Servlets and display it dynamically using JavaScript.

---

## 📘 Project Description

This project was created as part of the Web II module coursework. It demonstrates the fundamental concept of **Client-Server Communication**, where the frontend requests data using JavaScript (typically via `fetch()`), and the backend Java Servlet (`FetchController`) processes the request and responds with data in JSON format.

---

## 🧠 Theoretical Background

The core theory behind this project involves **AJAX (Asynchronous JavaScript and XML)** and **Java Servlets**:

### 1. **Client-Side Fetching (AJAX)**
- AJAX allows the browser to send and receive data **without refreshing the page**.
- In this project, JavaScript uses `fetch()` to make an asynchronous call to the server.

### 2. **Java Servlet Backend**
- The backend is handled by a servlet called `FetchController.java`.
- It acts as the server-side component that listens for client requests and returns appropriate data.
- Libraries like **Gson** are used to convert Java objects into JSON before sending them back to the client.

### 3. **JSON Data Interchange**
- JSON (JavaScript Object Notation) is used as the lightweight data format between the server and client.
- Gson library is included in the project to support serialization and deserialization of Java objects.

---

## 🚀 Features

- Java Servlet (`FetchController`) to handle backend data
- HTML & JavaScript frontend interface
- Real-time data fetch with `fetch()` API
- JSON-based communication
- Configured for GlassFish server deployment

---

## 🛠️ Technologies Used

- Java EE (Servlets)
- HTML5 / CSS / JavaScript
- Google Gson Library (gson-2.8.9)
- Apache Ant
- NetBeans IDE
- GlassFish Server

---
