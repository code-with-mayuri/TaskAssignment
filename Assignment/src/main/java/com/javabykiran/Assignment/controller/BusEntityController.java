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

import com.javabykiran.Assignment.entity.BusEntity;
import com.javabykiran.Assignment.service.BusEntityService;

@RestController
public class BusEntityController {
@Autowired
BusEntityService ser;
@PostMapping("addbuses")
public boolean addBus(@RequestBody BusEntity bus)
{
return	ser.addBus(bus);
}
@GetMapping("getbus/{id}")
public BusEntity getBusId(@PathVariable int id)
{
	return	ser.getBusId(id);
}
@GetMapping("getallbus")
public List<BusEntity> getall()
{
	return	ser.getall();
}
@PutMapping("updatebuses")
public boolean updateBus(@RequestBody BusEntity entity)
{
	return	ser.updateBus(entity);
}
@DeleteMapping("deletebuses/{id}")
public boolean deletebus(@PathVariable int id)
{
	return ser.deletebus(id);	
}
}
