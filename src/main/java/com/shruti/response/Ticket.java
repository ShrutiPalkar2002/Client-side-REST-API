package com.shruti.response;

public class Ticket {
	
	private Integer tid;
	private String from;
	private String to;
	private String ticketStatus;
	private String tktcost;
	public String getTktcost() {
		return tktcost;
	}
	public void setTktcost(String tktcost) {
		this.tktcost = tktcost;
	}
	private String trainNum;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	
	
}
