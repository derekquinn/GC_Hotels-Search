<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel App | Results</title>
</head>
<body>

<table>

<a href ="/"> Home</a>

<table>
<c:forEach items="${ hotelList }" var="hotel">
				<tr>
					<td>${ hotel.name }</td>
					<td>${ hotel.pricePerNight }</td>
					</tr>
					</c:forEach>
		
	
</table>
</body>
</html>