package com.earthquakedevs.workshopposts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthquakedevs.workshopposts.domain.Post;
import com.earthquakedevs.workshopposts.domain.User;
import com.earthquakedevs.workshopposts.dto.UserDTO;
import com.earthquakedevs.workshopposts.repository.PostRepository;
import com.earthquakedevs.workshopposts.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public List<Post> findAll() {
		return repo.findAll();
	}

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
}
