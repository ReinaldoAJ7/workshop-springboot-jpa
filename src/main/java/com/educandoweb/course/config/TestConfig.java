package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
			
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Amanda Paula", "amanda@gmail.com", "98789898", "123456");
		User u4 = new User(null, "Renato Jesus", "renato@gmail.com", "97879888", "123456");
		User u5 = new User(null, "José Adolfo", "zeadolfo@gmail.com", "988888888", "123456");
		User u6 = new User(null, "Cauane jesus", "cauane@gmail.com", "97677777", "1234567");
		User u7 = new User(null, "Reinaldo Jesus", "reinaldo@gmail.com", "999948592", "1234567");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID,u3);
		Order o4 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED, u4);
		Order o5 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u5);
		Order o6 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u6);
		Order o7 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u7);
		Order o8 = new Order(null, Instant.parse("2019-08-22T15:21:22Z"), OrderStatus.DELIVERED, u6);
		Order o9 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), OrderStatus.DELIVERED, u7);
		Order o10 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), OrderStatus.DELIVERED, u6);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10));
		
	}
} 
