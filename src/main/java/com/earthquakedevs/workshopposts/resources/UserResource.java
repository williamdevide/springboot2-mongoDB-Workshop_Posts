package com.earthquakedevs.workshopposts.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.earthquakedevs.workshopposts.domain.User;
import com.earthquakedevs.workshopposts.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		/*
		List<User> list = new ArrayList<>();
		User maria = new User("1001", "Maria Brown", "maria@gmail.com");
		User alex = new User("1002", "Alex Green", "alex@gmail.com");
		list.addAll(Arrays.asList(maria, alex));
*/
		
		List<User> list = service.findAll();
		System.out.println("usuários: " + list);

		return ResponseEntity.ok().body(list);
		
	}


}
