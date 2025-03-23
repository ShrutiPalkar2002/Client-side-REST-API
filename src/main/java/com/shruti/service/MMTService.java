package com.shruti.service;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.shruti.request.Passenger;
import com.shruti.response.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MMTService {
	
	@Value("${irctc.endpoint.bookticket}")
	private  String IRCTC_BOOK_TICKET_URL;  // As per requirement IP will change of EC2
	
	@Value("${irctc.endpoint.getticket}")
	private   String IRCTC_GET_TICKET_URL;  // As per requirement IP will change of EC2
	
	public Ticket processTicketBooking(Passenger p) {
		WebClient webclient = WebClient.create();
		
		Ticket ticket = webclient.post() //post request
			.uri(IRCTC_BOOK_TICKET_URL) //To which URL on which we need to send post request
			.body(BodyInserters.fromObject(p)) //What data in body
			.header("Content-Type", "application/json") //body type
			.accept(org.springframework.http.MediaType.APPLICATION_JSON)
			.retrieve() 
			.bodyToMono(Ticket.class)
			.block();
		
		
		if(ticket != null) {
			return ticket;
		}
		else {
			return null;
		}
		
	}
	
	public Ticket getTicketInfo(String ticketId) {
		WebClient webclient = WebClient.create(); //creating instance
		
		Ticket ticket = webclient.get(). //represents HTTP get request
			uri(IRCTC_GET_TICKET_URL,ticketId) //represents to which URI we should call
			.accept(org.springframework.http.MediaType.APPLICATION_JSON)
			.retrieve() //take response from response body
			.bodyToMono(Ticket.class) //bind response body to java object
			.block(); //enable synchronous communication
		
		if(ticket!=null) {
			return ticket;
		}
		else {
			return null;
		}		
		

	}
	
}
