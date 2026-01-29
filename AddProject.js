import React, { useState } from 'react';
import axios from 'axios';
import './AddProject.css';

function AddProject() {

  const [project, setProject] = useState({
    project_name: "",
    task: "",
    student_name: "",
    technologies: ""
  });

  const handleChange = (e) => {
    setProject({ ...project, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios.post("http://localhost:8080/projects", project);
    alert("Project added successfully!");
  };

  return (
    <div className="form-container">
      <h2>Add New Project</h2>

      <form onSubmit={handleSubmit}>
        <label>Project Name</label>
        <input
          type="text"
          name="project_name"
          value={project.project_name}
          onChange={handleChange}
        />

        <label>Task</label>
        <textarea
          name="task"
          value={project.task}
          onChange={handleChange}
        />

        <label>Student Name</label>
        <input
          type="text"
          name="student_name"
          value={project.student_name}
          onChange={handleChange}
        />

        <label>Technologies</label>
        <input
          type="text"
          name="technologies"
          value={project.technologies}
          onChange={handleChange}
        />

        <button type="submit">Add Project</button>
      </form>
    </div>
  );
}

export default AddProject;
