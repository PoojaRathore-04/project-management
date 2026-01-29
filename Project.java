package com.example.projectapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;

    private String project_name;
    private String task;
    private String student_name;
    private String technologies;

    // ---------- Getters ----------
    public int getProject_id() {
        return project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public String getTask() {
        return task;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getTechnologies() {
        return technologies;
    }

    // ---------- Setters ----------
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
}
