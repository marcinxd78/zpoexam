package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.repository.SpectacleRepository;

@Controller  //znaczamy nią kontrolery, tj. klasy, które będą obsługiwały zapytania wysyłane poprzez przeglądarkę od użytkowników.
public class CostController {


//wstrzykiwanie informacji łączenie beana w metodzie          
	@Autowired                        //obiekt springdata dodany do kontrolera 
	SpectacleRepository spectacleRepository;   //tworzy implementacje interfejsu i odpowiada za wstrzykniecie go w tym miejscu

	@RequestMapping(value = "/cost", method = RequestMethod.GET) //mapowanie URL gla metody przechwytujacej GET określa adres pod jakim ma byc kontroler
	public String showSpectaclePage(Model model) {
		model.addAttribute("list_spectacle", spectacleRepository.findAll()); //przekazanie do widoku klucza listy spektakli
		return "cost"; //zwraca cene kazdego spektaklu
	}

}
