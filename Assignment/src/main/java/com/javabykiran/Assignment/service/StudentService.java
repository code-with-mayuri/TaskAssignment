package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.StudentDao;
import com.javabykiran.Assignment.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public boolean addstudent(Student std) {
		return dao.addstudent(std);
	}

	public Student getById(int id) {
	return	dao. getById(id);
	}

	public List<Student> getAll() {
		List<Student> br= dao.getAll();		
		return br;
	}

	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);	
	}

	public boolean updatebook(Student std, int id) {
		return dao.updatebook(std,id);
	}
	
}
