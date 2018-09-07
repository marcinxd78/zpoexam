package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Spectacle;
import com.app.repository.SpectacleRepository;

//rest controller oddaje wartości w JSon lub XML 
@RestController //zawiera adnotacje @controler i @ResponseBody umozliwia łatwiejsza implementacje kontrolera
public class SpectacleRestController {
	@Autowired
	SpectacleRepository repository; //implementacja interfejsu łatwiejszy dostęp do danych 

	@GetMapping("/spectacle-rest") //mapowanie URL gla metody przechwytujacej GET określa adres pod jakim ma byc kontroler skrót @RequestMapping
	public List<Spectacle> getAllSpectacles() { //wczytanie z bazy danych
		return repository.findAll(); // Arrays.asList();
	}

}
