package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Actor;
import com.app.repository.ActorRepository;

@RestController //obsługa REST kontroler ten zwraca dane tekstowe nie HTML
public class ActorRestController {
	@Autowired
	ActorRepository repository;

	@GetMapping("/actors") //mapowanie metodą get actors metodą getAll Actors
	public List<Actor> getAllActors() { 
		return repository.findAll(); // Arrays.asList();
	}

}
