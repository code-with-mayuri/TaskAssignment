package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.BusEntityDao;
import com.javabykiran.Assignment.entity.BusEntity;

@Service
public class BusEntityService {
@Autowired
BusEntityDao dao;
	public boolean addBus(BusEntity bus) {
		// TODO Auto-generated method stub
		return dao.addBus(bus);
	}
	public BusEntity getBusId(int id) {
return dao.getBusId(id);	
	}
	public List<BusEntity> getall() {
return dao.getall();		
	}
	public boolean updateBus(BusEntity entity) {
return dao.updateBus( entity);		
	}
	public boolean deletebus(int id) {
return dao.	deletebus(id);	
	}

}
