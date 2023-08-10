package com.javabykiran.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.Assignment.entity.Book;
import com.javabykiran.Assignment.entity.Transactions;
import com.javabykiran.Assignment.service.BookService;
import com.javabykiran.Assignment.service.TransactionService;

@RestController
public class Transctionscontroller {
@Autowired
TransactionService sers;
@PostMapping("insertdetails")
boolean adddetails(@RequestBody Transactions tr)
{
return sers.adddetails(tr);	
}

@GetMapping("/transaction")
public List<Transactions> getAllTransaction()
{
List<Transactions> br=sers.getAllTransaction();
return br;
}
@GetMapping("transactionGetbyId/{busid}")
public Transactions getbyId(@PathVariable int busid)
{
	return sers.getbyId(busid);
}
@DeleteMapping("/transactionDelete/{busid}")
boolean deleteTransactions(@PathVariable int busid)
{
	return sers.deleteTransactions(busid);
}
@PutMapping("/transactionUpdate")
public boolean updateTransactions(@RequestBody Transactions trr)
{
	return sers.updateTransactions(trr);
}
}
