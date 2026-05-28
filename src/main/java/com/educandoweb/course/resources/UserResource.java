package com.educandoweb.course.resources;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Reinaldo A. de Jesus", "reinaldojesus238@yahoo.com", "(37)99994-8592","1234567");
		return ResponseEntity.ok().body(user);
	}
}
