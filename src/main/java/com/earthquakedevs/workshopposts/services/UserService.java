package com.earthquakedevs.workshopposts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthquakedevs.workshopposts.domain.User;
import com.earthquakedevs.workshopposts.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}	
}
