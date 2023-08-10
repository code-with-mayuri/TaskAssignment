package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.Project;
import com.javabykiran.Assignment.entity.Student;
@Repository
public class ProjectDao {
	@Autowired
	SessionFactory sf;
	public boolean addProject(Project project) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(project);
		tr.commit();
		session.close();
		return true;

	}
	public Project getbyId(int projectid) {
		Session session=	sf.openSession();
		Project br=session.get(Project.class, projectid);
		session.close();
		return br;
		
	}
	public List<Project> getAll() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(Project.class);
		List<Project> br= cr.list();
		session.close();
		return br;		
	}
	public boolean deleteProject(int projectid) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Project br=session.get(Project.class, projectid);
        session.delete(br);
		tr.commit();
		session.close();
		return true;
		
	}
	public boolean updateProject(Project project) {
		// TODO Auto-generated method stub
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(project);		
         tr.commit();
		session.close();
		return true;
	}

}
