package com.app.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.entity.Actor;
import com.app.repository.ActorRepository;

@Controller //znaczamy nią kontrolery, tj. klasy, które będą obsługiwały zapytania wysyłane poprzez przeglądarkę od użytkowników.
public class ActorBasic {

	@Autowired //wstrzykiwanie informacji łączenie beana w metodzie
	ActorRepository repository;

	public List<Actor> getActors() {
		return repository.findAll();
	}

}
