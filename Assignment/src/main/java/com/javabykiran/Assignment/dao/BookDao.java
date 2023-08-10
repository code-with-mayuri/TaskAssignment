package com.javabykiran.Assignment.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.javabykiran.Assignment.entity.Book;


@Repository
public class BookDao {
@Autowired
SessionFactory sf;

	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
Session session	=sf.openSession();
Criteria cr=   session.createCriteria(Book.class);
List<Book> br= cr.list();
session.close();
return br;
	}

	public boolean insertBook(Book book) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(book);
		tr.commit();
		session.close();
		return true;
	}

	public Book getbyId(int id) {
		Session session=	sf.openSession();
		Book br=session.get(Book.class, id);
		session.close();
		return br;

	}

	public boolean deletebook(int id) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		Book br=session.get(Book.class, id);
        session.delete(br);
		tr.commit();
		session.close();
		return true;

	}

	public boolean updatebook(Book book) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
       session.update(book);		
         tr.commit();
		session.close();
		return true;
	}

}
