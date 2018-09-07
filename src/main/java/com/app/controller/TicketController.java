package com.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Ticket;
import com.app.repository.SpectacleRepository;
import com.app.repository.TicketRepository;

@Controller
public class TicketController {
	@Autowired
	TicketRepository repository;

	@Autowired
	SpectacleRepository spectacleRepository;

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String showTicketPage(Model model) {
		model.addAttribute("list_spectacle", spectacleRepository.findAll());
		model.addAttribute("list_tickets", repository.findAll());
		return "ticket";
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.POST)
	public String showTicketPage(@RequestParam String name, @RequestParam String surname,
			@RequestParam int spectacle_id, ModelMap model) {
		repository.save(new Ticket(name, surname, new Date()));
		model.addAttribute("list_spectacle", spectacleRepository.findAll());
		model.addAttribute("list_tickets", repository.findAll());
		return "ticket";
	}

}
