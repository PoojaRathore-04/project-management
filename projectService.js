// src/api/projectService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/projects'; // backend URL

// Get all projects
export const getProjects = async () => {
    const response = await axios.get(API_URL);
    return response.data;
}

// Create a new project
export const createProject = async (project) => {
    const response = await axios.post(API_URL, project);
    return response.data;
}

// Delete a project by ID
export const deleteProject = async (id) => {
    const response = await axios.delete(`${API_URL}/${id}`);
    return response.data;
}
