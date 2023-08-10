package com.javabykiran.Assignment.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.CourseDao;
import com.javabykiran.Assignment.entity.Course;
@Service
public class CourseService {
@Autowired
CourseDao dao;
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.addCourse(course);
	}
	public List<Course> getAll() {
	return	dao.getAll();
	}
	public boolean deletecourse(int courseId) {
		return dao.deletecourse( courseId);
	
	}
	public boolean updateCourse(Course course) {
		return dao.updateCourse(course);
	}
	public Course getByCourseId(int courseId) {
		return dao.getByCourseId(courseId);
	}
	
}
