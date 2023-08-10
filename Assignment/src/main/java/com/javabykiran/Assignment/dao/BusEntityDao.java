package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.BusEntity;
import com.javabykiran.Assignment.entity.Student;
@Repository
public class BusEntityDao {
	@Autowired
	SessionFactory sf;
	public boolean addBus(BusEntity bus) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(bus);
		tr.commit();
		session.close();
		return true;		
	}
	public BusEntity getBusId(int id) {
		Session session=	sf.openSession();
		BusEntity br=session.get(BusEntity.class, id);
		session.close();
		return br;
		
	}
	public List<BusEntity> getall() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(BusEntity.class);
		List<BusEntity> br= cr.list();
		session.close();
		return br;				
	}
	public boolean updateBus(BusEntity entity) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(entity);		
         tr.commit();
		session.close();
		return true;	
	}
	public boolean deletebus(int id) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		BusEntity br=session.get(BusEntity.class, id);
        session.delete(br);
		tr.commit();
		session.close();	
		return true;
	}

}
