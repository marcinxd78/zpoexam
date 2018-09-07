package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.repository.SpectacleRepository;

@Controller
public class SpectacleController {
	@Autowired
	SpectacleRepository spectacleRepository;

	@RequestMapping(value = "/spectacle", method = RequestMethod.GET)
	public String showSpectaclePage(Model model) {
		model.addAttribute("list_spectacle", spectacleRepository.findAll());
		return "spectacle";
	}

}
