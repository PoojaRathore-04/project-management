# project-management
# Project Management System

[![License](https://img.shields.io/badge/license-MIT-green)](LICENSE)
[![Java](https://img.shields.io/badge/Backend-Java-orange)](https://www.java.com/)
[![React](https://img.shields.io/badge/Frontend-React-blue)](https://reactjs.org/)

---

## Objective
The **Project Management System** is a full-stack web application that allows users to efficiently manage project information. Users can **add, view, update, and delete projects**, with all data stored in a database and displayed dynamically on the frontend. This project demonstrates skills in:

- Frontend Development
- Backend API creation
- Database integration
- Full-stack application architecture

---

## Features

### Backend
- Built with **Java** / **Spring Boot**
- **RESTful APIs** for project management:
  - `POST /projects` – Add a new project
  - `GET /projects` – Fetch all projects
  - `GET /projects/{id}` – Fetch a project by ID
  - `PUT /projects/{id}` – Update a project (optional)
  - `DELETE /projects/{id}` – Delete a project (optional)

### Frontend
- Built with **React.js** (or HTML/CSS/JavaScript)
- **Add Project Page**
  - Form fields: Project Name, Task, Student Name, Technologies
  - Sends data to backend API on submission
- **Project List Page**
  - Fetches all projects from backend
  - Displays project details in a **responsive table**:
    - Project Name
    - Task
    - Student Name
    - Technologies
- Clean, responsive, and user-friendly UI

---

## Database Structure

Table Name: `projects`

| Column Name   | Data Type | Description                       |
|---------------|-----------|-----------------------------------|
| project_id    | INT       | Primary Key, Auto Increment       |
| project_name  | VARCHAR   | Name of the project               |
| task          | TEXT      | Task details                      |
| student_name  | VARCHAR   | Name of the student               |
| technologies  | VARCHAR   | Technologies used (e.g., React, Node.js, MySQL) |

---

## Folder Structure

**Backend (Spring Boot / Java)**  
project-management-backend/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.example.projectmanagement/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ └── repository/
│ │ └── resources/
│ │ └── application.properties
├── pom.xml


**Frontend (React.js)**  
project-management-frontend/
├── public/
├── src/
│ ├── components/
│ │ ├── AddProject.js
│ │ └── ProjectList.js
│ ├── App.js
│ └── index.js
├── package.json


---

## How to Run

### Backend
1. Configure your database connection in `application.properties`.
2. Run Spring Boot application:
   ```bash
   mvn spring-boot:run
### Frontend

1. Navigate to frontend folder:
cd project-management-frontend
2. Install dependencies:
npm install
3. Start the frontend server:
npm start
