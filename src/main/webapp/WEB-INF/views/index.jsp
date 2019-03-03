<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel App | Search</title>


</head>
<body>

<a href ="/"> Home</a>
	<div class=container>
	<h2>Hotel Search</h2>
	<p>${ allcities } </p>
		<form  action="/list">
			<label  for="category">Where are you going? And where do you go?</label>
	        <select  id="city-search" name="city" >
	          	<option value="">Select</option>
	            <c:forEach items="${ cities }" var="city">
	                
	                <option <c:if test="${ city eq param.city }">selected</c:if>>${ city }</option>
	           
	            </c:forEach>
	       	</select>
	       	
	       	<button type="submit">Search</button>
	         
		</form>
	</div>














	<%-- <table>


			<tr>
				<th>Name</th>
				<th>City</th>
				<th>Price</th>
			</tr>
		</thead>

		<c:forEach var="hotels" items="${ hotels }">
			<tr>
				<td>${ hotels.name}</td>
				<td>${ hotels.city }</td>
				<td>$ ${ hotels.pricePerNight }</td>
			</tr>
		</c:forEach>

	</table> --%>


</body>
</html>