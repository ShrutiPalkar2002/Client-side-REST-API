<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>
	<form action="searchTicket">
		<h2>Get your ticket Ticket</h2>
		
		Ticket ID: <input type="text" name="ticketId">
		<input type="submit" value="search">
    </form>
	
	<hr/>
	
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
	<a href="/">Go Back</a>
</body>
</html>