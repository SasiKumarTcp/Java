<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

		<table style="with: 80%">
			<tr>
				<td>Source</td>
				<td>Destination</td>
				<td>Duration</td>
			</tr>
		
			<c:forEach items="${rList}" var="route">
				<tr>
					<td>${route.source}</td>
					<td>${route.destination}</td>
					<td>${route.duration}</td>
					<td>
					<form action="bookRide" method="post">
						<input type = "hidden" name="action" value="rideDetail"/>
						<input type = "hidden" name="routeId" value="${route.routeId}"/>
						<input value="Book" type="submit" />
					</form>
					</td>
				</tr>
				
			</c:forEach>

		</table>


</body>
</html>