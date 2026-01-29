import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './ProjectList.css';

function ProjectList() {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/projects')
      .then(res => setProjects(res.data))
      .catch(err => console.log(err));
  }, []);

  return (
    <table border="1">
      <thead>
        <tr>
          <th>Project Name</th>
          <th>Task</th>
          <th>Student Name</th>
          <th>Technologies</th>
        </tr>
      </thead>
      <tbody>
        {projects.map(proj => (
          <tr key={proj.project_id}>
            <td>{proj.project_name}</td>
            <td>{proj.task}</td>
            <td>{proj.student_name}</td>
            <td>{proj.technologies}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default ProjectList;
