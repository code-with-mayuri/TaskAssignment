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

import com.javabykiran.Assignment.entity.Student;
import com.javabykiran.Assignment.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService ser;
@PostMapping("student")
public boolean addstudent(@RequestBody Student std)
{
return ser.addstudent(std);
}
@GetMapping("student/{id}")
public Student getById(@PathVariable int id) {
return ser.getById(id);
}
@GetMapping("allstudent")
public List<Student> getAll()
{
	List<Student> br=ser.getAll();
	return br;
}
@DeleteMapping("/student/{id}")
boolean deleteStudent(@PathVariable int id)
{
	return ser.deleteStudent(id);
}
@PutMapping("/update/{id}")
public boolean updatestudent(@RequestBody Student std,
		@PathVariable ("id") int id)
{
	return ser.updatebook(std,id);
}
}
