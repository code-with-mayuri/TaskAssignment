package com.javabykiran.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.Assignment.entity.Project;
import com.javabykiran.Assignment.entity.Student;
import com.javabykiran.Assignment.service.ProjectService;

@RestController
public class ProjectController {
@Autowired
ProjectService ser;
@PostMapping("/project")
public boolean addProject(@RequestBody Project project)
{
	return ser.addProject(project);
}
@GetMapping("getproject/{projectid}")
public Project getbyId(@PathVariable int projectid )
{
	return ser.getbyId(projectid);
}


@GetMapping("allproject")
public List<Project> getAll()
{
	List<Project> br=ser.getAll();
	return br;
}
@DeleteMapping("/deleteproject/{projectid}")
boolean deleteProject(@PathVariable int projectid)
{
	return ser.deleteProject(projectid);
}
@PutMapping("/update")
public boolean updateProject(@RequestBody Project project)
{
	return ser.updateProject(project);
}
}
