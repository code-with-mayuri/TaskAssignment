package com.javabykiran.Assignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.Assignment.entity.User;
import com.javabykiran.Assignment.service.UserService;

@RestController
public class UserController {
	UserService ser;
	 @PostMapping("/{password}")
	    public User saveUser(@RequestBody User user, @PathVariable String password) {
	        user.setEncryptedPassword(password);
	        return ser.saveUser(user);
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Long id) {
	        User user = ser.getUserById(id);
	        if (user != null) {
	            return ResponseEntity.ok(user);
	        }
	        return ResponseEntity.notFound().build();
	    }

	    @GetMapping("/match/{id}/{password}")
	    public ResponseEntity<String> matchPassword(@PathVariable Long id, @PathVariable String password) {
	        boolean isMatch = ser.matchPassword(id, password);
	        if (isMatch) {
	            return ResponseEntity.ok("Password matched");
	        }
	        return ResponseEntity.badRequest().body("Password does not match");
	    }
}
