<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
DETALII Vatman <br/>
<table>
	<tr>
		<td>Id</td>
		<td>${vatman.id}</td>
	</tr>
	<tr>
		<td>Nume</td>
		<td>${vatman.nume}</td>
	</tr>
	<tr>
		<td>Prenume</td>
		<td>${vatman.prenume}</td>
	</tr>
	<tr>
		<td>Gen</td>
		<td>${vatman.gen}</td>
	</tr>
	<tr>
		<td>Varsta</td>
		<td>${vatman.varsta}</td>
	</tr>
	<tr>
		<td>Ani de experienta</td>
		<td>${vatman.ani_experienta}</td>
	</tr>
	<tr>
		<td>Mersul de tramvai</td>
		<td>${vatman.mers_tramvai}</td>
	</tr>

</table>
<a href="<c:url value="/vatmans/all"/>">Tabelul de vatman</a>
</body>
</html>