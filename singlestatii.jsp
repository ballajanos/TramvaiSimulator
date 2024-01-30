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
DETALII Statii <br/>
<table>
	<tr>
		<td>Id</td>
		<td>${statii.id}</td>
	</tr>
	<tr>
		<td>Nume</td>
		<td>${statii.nume}</td>
	</tr>
	<tr>
		<td>Urcare</td>
		<td>${statii.urcare}</td>
	</tr>
	<tr>
		<td>Coborare</td>
		<td>${statii.coborare}</td>
	</tr>
	<tr>
		<td>1N</td>
		<td>${statii.unuN}</td>
	</tr>
	<tr>
		<td>1R</td>
		<td>${statii.unuR}</td>
	</tr>
	<tr>
		<td>1S</td>
		<td>${statii.unuS}</td>
	</tr>
		<tr>
		<td>2N</td>
		<td>${statii.doiN}</td>
	</tr>
	<tr>
		<td>2R</td>
		<td>${statii.doiR}</td>
	</tr>
		<tr>
		<td>3N</td>
		<td>${statii.treiN}</td>
	</tr>
	<tr>
		<td>3R</td>
		<td>${statii.treiR}</td>
	</tr>
		<tr>
		<td>4N</td>
		<td>${statii.patruN}</td>
	</tr>
	<tr>
		<td>4R</td>
		<td>${statii.patruR}</td>
	</tr>

</table>
<a href="<c:url value="/statiis/all"/>">Statiile</a>
</body>
</html>