package com.javabykiran.Assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.UserDao;
import com.javabykiran.Assignment.entity.User;
@Service
public class UserService {
@Autowired
UserDao dao;

	public User saveUser(User user) {
return dao.saveUser(user);
}
	
	 public User getUserById(Long id) {
	        return dao.getUserById(id);
	    }

	    public boolean matchPassword(Long id, String password) {
	        User user = dao.getUserById(id);
	        if (user != null) {
	            return decryptPassword(user.getEncryptedPassword()).equals(password);
	        }
	        return false;
	    }

	    private String encryptPassword(String password) {
	        return password;  
	    }

	    private String decryptPassword(String encryptedPassword) {
	        return encryptedPassword;  
	    }

		
}
