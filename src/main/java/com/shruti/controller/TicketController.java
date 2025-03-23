package com.shruti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shruti.request.Passenger;
import com.shruti.response.Ticket;
import com.shruti.service.MMTService;

@Controller
public class TicketController {

	
	@Autowired
	private MMTService mmtservice;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/book")
	public String bookTicket(Passenger p, Model model) {
		
		System.out.println(p);
		
		Ticket t = mmtservice.processTicketBooking(p);
		
		model.addAttribute("ticket",t);
		return "success";
	}
	
	
	@GetMapping("/search")
	public String searchPage() {
		return "search";
	}
	
	@GetMapping("/searchTicket")
	public String searchTicket(@RequestParam("ticketId")String ticketId,Model model) {
		
		
		//logic to get ticket from IRCTC
		
		Ticket ticketInfo = mmtservice.getTicketInfo(ticketId);
		model.addAttribute("ticket", ticketInfo);
		
		System.out.println("Ticket ID :: "+ticketId);
		return "search";
	}
	
}
