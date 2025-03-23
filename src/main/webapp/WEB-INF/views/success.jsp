<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>
		<h1>Please find your ticket data</h1>
		
		
		<table>
			<tr>
				<td>Ticket ID</td>
				<td>${ticket.tid}</td>
			<tr>
			<tr>
				<td>To</td>
				<td>${ticket.to}</td>
			<tr>
			<tr>
				<td>From</td>
				<td>${ticket.from}</td>
			<tr>
			<tr>
				<td>Train Number</td>
				<td>${ticket.trainNum}</td>
			<tr>
			<tr>
				<td>Ticket Cost</td>
				<td>${ticket.tktcost}</td>
			<tr>
			<tr>
				<td>Ticket Status</td>
				<td>${ticket.ticketStatus}</td>
			<tr>
		</table>
</body>
</html>
