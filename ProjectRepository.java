package com.example.projectapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projectapi.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
