package com.example.projectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projectapi.model.Project;
import com.example.projectapi.repository.ProjectRepository;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project project) {
        Project existingProject = projectRepository.findById(id).orElse(null);
        if (existingProject != null) {
            existingProject.setProject_name(project.getProject_name());
            existingProject.setTask(project.getTask());
            existingProject.setStudent_name(project.getStudent_name());
            existingProject.setTechnologies(project.getTechnologies());
            return projectRepository.save(existingProject);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable int id) {
        projectRepository.deleteById(id);
        return "Project deleted successfully";
    }
}
