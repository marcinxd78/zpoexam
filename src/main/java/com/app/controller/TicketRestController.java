package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Ticket;
import com.app.repository.TicketRepository;

@RestController
public class TicketRestController {
	@Autowired
	TicketRepository repository;

	@GetMapping("/tickets")
	public List<Ticket> getAllTickets() {
		return repository.findAll(); // Arrays.asList();
	}

}
