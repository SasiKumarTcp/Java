<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Booking Details</h1>
 	<table style="with: 80%">
			<tr>
				<td>Ride ID</td>
				<td>Name</td>
				<td>Source</td>
				<td>Destination</td>
				<td>Date</td>
			</tr>
			<tr>
			<c:forEach items="${rideList}" var="rideDetail">
					<td>${rideDetail}</td>
			</c:forEach>
			</tr>
	</table>
</body>
</html>