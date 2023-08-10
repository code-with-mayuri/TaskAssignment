package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory sf;

	public boolean addstudent(Student std) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(std);
		tr.commit();
		session.close();
		return true;

	}

	public Student getById(int id) {
		Session session=	sf.openSession();
		Student br=session.get(Student.class, id);
		session.close();
		return br;

	}

	public List<Student> getAll() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(Student.class);
		List<Student> br= cr.list();
		session.close();
		return br;		
	}

	public boolean deleteStudent(int id) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Student br=session.get(Student.class, id);
        session.delete(br);
		tr.commit();
		session.close();
		return true;

		
	}

	public boolean updatebook(Student std, int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student br=session.get(Student.class, id);
        session.update(br);		
         tr.commit();
		session.close();
		return true;
	}

}
