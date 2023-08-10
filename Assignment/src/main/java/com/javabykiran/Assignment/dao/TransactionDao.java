package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.Student;
import com.javabykiran.Assignment.entity.Transactions;

@Repository
public class TransactionDao {
	@Autowired
	SessionFactory sf;
	public boolean adddetails(Transactions tr) {
		Session session=	sf.openSession();
		Transaction trr=session.beginTransaction();
		session.save(tr);
		trr.commit();
		session.close();
		return true;
		
	}
	public List<Transactions> getAllTransaction() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(Transactions.class);
		List<Transactions> br= cr.list();
		session.close();
		return br;	
	}
	public Transactions getbyId(int busid) {
		Session session=	sf.openSession();
		Transactions br=session.get(Transactions.class, busid);
		session.close();
		return br;
	}
	public boolean deleteTransactions(int busid) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Transactions br=session.get(Transactions.class, busid);
        session.delete(br);
		tr.commit();
		session.close();
		return true;
		
	}
	public boolean updateTransactions(Transactions trr) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(trr);		
         tr.commit();
		session.close();
		return true;	}

}
