package com.javabykiran.Assignment.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javabykiran.Assignment.entity.User;
@Repository
public class UserDao {
	private final Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

	public User saveUser(User user) {

	        user.setId(idCounter);
	        users.put(idCounter, user);
	        idCounter++;
	        return user;
	}
	 public User getUserById(Long id) {
	        return users.get(id);
	    }
	
}
