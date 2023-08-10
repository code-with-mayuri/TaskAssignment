package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.TransactionDao;
import com.javabykiran.Assignment.entity.Transactions;
@Service
public class TransactionService {
@Autowired
TransactionDao dao;
	public boolean adddetails(Transactions tr) {
return dao.adddetails(tr);		
	}
	public List<Transactions> getAllTransaction() {
		return dao.getAllTransaction();
	}
	public Transactions getbyId(int busid) {
		return dao.getbyId(busid);
	}
	public boolean deleteTransactions(int busid) {

return dao.deleteTransactions(busid);
	}
	public boolean updateTransactions(Transactions trr) {
		return dao.updateTransactions(trr);
	}

}
