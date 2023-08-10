package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.Product;
import com.javabykiran.Assignment.entity.Student;

@Repository
public class ProductDao {
	@Autowired
	SessionFactory sf;
	public boolean addProduct(Product pro) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(pro);
		tr.commit();
		session.close();
		return true;
	}
	public Product getbyId(int productid) {
		Session session=sf.openSession();
		Product br=session.get(Product.class, productid);
		session.close();
		return br;		
	}
	public List<Product> getAllProduct() {
		Session session	=sf.openSession();
		Criteria cr=   session.createCriteria(Product.class);
		List<Product> br= cr.list();
		session.close();
		return br;	
	}
	public boolean deleteProduct(int productid) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Product br=session.get(Product.class, productid);
        session.delete(br);
		tr.commit();
		session.close();
		return true;
	}
	public boolean updateProduct(Product pro) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(pro);		
         tr.commit();
		session.close();
		return true;
		}

}
