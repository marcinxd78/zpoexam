package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.repository.ActorRepository;

@Controller
public class ActorController {
	@Autowired
	ActorRepository repository;

	@RequestMapping(value = "/actor", method = RequestMethod.GET) //mapowanie URL gla metody przechwytujacej GET określa adres pod jakim ma byc kontroler
	public String showActorPage(Model model) {
		model.addAttribute("list_actors", repository.findAll());
		return "actor";
	}

}
