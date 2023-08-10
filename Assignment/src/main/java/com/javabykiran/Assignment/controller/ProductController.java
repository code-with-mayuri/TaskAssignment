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

import com.javabykiran.Assignment.entity.Product;
import com.javabykiran.Assignment.entity.Student;
import com.javabykiran.Assignment.service.ProductService;

@RestController
public class ProductController {
@Autowired
ProductService ser;
@PostMapping("product")
public boolean addProduct(@RequestBody Product pro)
{
	return ser.addProduct(pro);
}
@GetMapping("getproduct/{productid}")
public  Product getbyId(@PathVariable int productid)
 {
	return  ser.getbyId(productid);
 }
@GetMapping("GetAllProduct")
public List<Product> getAllProduct()
{
return ser.getAllProduct();
}

@DeleteMapping("/deleteproduct/{productid}")
boolean deleteProduct(@PathVariable int productid)
{
	return ser.deleteProduct(productid);
}
@PutMapping("/updatepro")
public boolean updateProduct(@RequestBody Product pro)
{
	return ser.updateProduct(pro);
}
}
