package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.ProjectDao;
import com.javabykiran.Assignment.entity.Project;
import com.javabykiran.Assignment.entity.Student;
@Service
public class ProjectService {
@Autowired
ProjectDao dao;

	public boolean addProject(Project project) {
		// TODO Auto-generated method stub
		return dao.addProject(project);
	}

	public Project getbyId(int projectid) {
return dao.getbyId(projectid);		
	}

	public List<Project> getAll() {
    return dao.getAll();
}

	public boolean deleteProject(int projectid) {
		return dao.deleteProject(projectid);
	}

	public boolean updateProject(Project project) {
		return dao.updateProject(project);
	}

}
