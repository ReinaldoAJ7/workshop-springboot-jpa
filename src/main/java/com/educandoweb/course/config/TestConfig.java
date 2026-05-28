package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Amanda Paula", "amanda@gmail.com", "98789898", "123456");
		User u4 = new User(null, "Renato Jesus", "renato@gmail.com", "97879888", "123456");
		User u5 = new User(null, "José Adolfo", "zeadolfo@gmail.com", "988888888", "123456");
		User u6 = new User(null, "Cauane jesus", "cauane@gmail.com", "97677777", "1234567");
		User u7 = new User(null, "Reinaldo Jesus", "reinaldo@gmail.com", "999948592", "1234567");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7));
	}
} 
