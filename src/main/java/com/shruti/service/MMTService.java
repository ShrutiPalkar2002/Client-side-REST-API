package com.shruti.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shruti.request.Passenger;
import com.shruti.response.Ticket;

@Service
public class MMTService {
	
	@Value("${irctc.endpoint.bookticket}")
	private  String IRCTC_BOOK_TICKET_URL;  // As per requirement IP will change of EC2
	
	@Value("${irctc.endpoint.getticket}")
	private   String IRCTC_GET_TICKET_URL;  // As per requirement IP will change of EC2
	
	public Ticket processTicketBooking(Passenger p) {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(IRCTC_BOOK_TICKET_URL, p, Ticket.class);
		
		HttpStatusCode statusCode = postForEntity.getStatusCode();
		System.out.println(statusCode);
		
			System.out.println("Inside if block");
			Ticket ticket = postForEntity.getBody();
			return ticket;
	
	}
	
	public Ticket getTicketInfo(String ticketId) {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> forEntity = rt.getForEntity(IRCTC_GET_TICKET_URL, Ticket.class, ticketId);
		
		Ticket ticket = forEntity.getBody();
		
		return ticket;
	}
	
}
