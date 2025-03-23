<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>
	<form action="/book" method="POST">
		<h2>Enter passenger details</h2>
		<table>
			<tr>
				<td>Fname: </td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Lname: </td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>DOJ: </td>
				<td><input type="text" name="doj"></td>
			</tr>
			<tr>
				<td>From: </td>
				<td><input type="text" name="from"></td>
			</tr>
			<tr>
				<td>To: </td>
				<td><input type="text" name="to"></td>
			</tr>
			<tr>
				<td>Train Number: </td>
				<td><input type="text" name="trainNum"></td>
			</tr>
			
			<tr>
				<td> </td>
				<td><input type="submit" name="Submit"></td>
			</tr>
		</table>
		<a href="search">Search ticket</a> 
	</form>
</body>
</html>
