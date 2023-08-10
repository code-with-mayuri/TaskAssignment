package com.javabykiran.Assignment.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.Course;
import com.javabykiran.Assignment.entity.Product;
import com.javabykiran.Assignment.entity.Project;
import com.javabykiran.Assignment.entity.Student;
@Repository
public class CourseDao {
	@Autowired
	SessionFactory sf;

	public boolean addCourse(Course course) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(course);
		tr.commit();
		session.close();
		return true;

	}

	public List<Course> getAll() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(Course.class);
		List<Course> br= cr.list();
		session.close();
		return br;		
	}

	public boolean deletecourse(int courseId) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Course br=session.get(Course.class, courseId);
        session.delete(br);
		tr.commit();
		session.close();
		return true;
		
	}

	public boolean updateCourse(Course course) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(course);		
         tr.commit();
		session.close();
		return true;
	}

	public Course getByCourseId(int courseId) {
		Session session=sf.openSession();
		Course br=session.get(Course.class, courseId);
		session.close();
		return br;	
	}

	

	

}
