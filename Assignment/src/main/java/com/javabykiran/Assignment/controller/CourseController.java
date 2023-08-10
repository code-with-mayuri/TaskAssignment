package com.javabykiran.Assignment.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.Assignment.entity.Course;
import com.javabykiran.Assignment.entity.Student;
import com.javabykiran.Assignment.service.CourseService;

@RestController
public class CourseController {
@Autowired
CourseService ser;
@PostMapping("course")
public boolean addCourse(@RequestBody Course course)
{
return ser.addCourse(course);	
}
@GetMapping("allcourse")
public List<Course> getAll()
{
	List<Course> br=ser.getAll();
	return br;
}
@DeleteMapping("/deletecourse/{courseId}")
boolean deletecourse(@PathVariable int courseId)
{
	return ser.deletecourse(courseId);
}
@PutMapping("updatecourse")
public boolean updateCourse(@RequestBody Course course)
{
	return ser.updateCourse(course);
}
@GetMapping("getcourse/{courseId}")
public Course getByCourseId(@PathVariable int courseId)
{
return ser.getByCourseId(courseId);
}
}
