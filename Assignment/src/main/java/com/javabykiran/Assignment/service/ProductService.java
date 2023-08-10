package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.ProductDao;
import com.javabykiran.Assignment.entity.Product;
import com.javabykiran.Assignment.entity.Student;

@Service
public class ProductService {
@Autowired
ProductDao dao;

public boolean addProduct(Product pro) {
return dao.addProduct( pro);	
}

public Product getbyId(int productid) {
	return dao.getbyId(productid);
}

public List<Product> getAllProduct() {
	return dao.getAllProduct() ;
}

public boolean deleteProduct(int productid) {
	return dao.deleteProduct(productid);
	// TODO Auto-generated method stub
	
}

public boolean updateProduct(Product pro) {
	// TODO Auto-generated method stub
	return dao. updateProduct( pro);
}
}
