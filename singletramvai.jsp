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
DETALII Tramvai <br/>
<table>
	<tr>
		<td>Id</td>
		<td>${tramvai.id}</td>
	</tr>
	<tr>
		<td>Lungimea</td>
		<td>${tramvai.lungimea}</td>
	</tr>
	<tr>
		<td>Numarul scaunelor</td>
		<td>${tramvai.nr_scaune}</td>
	</tr>
	<tr>
		<td>Capacitatea maxima</td>
		<td>${tramvai.max_capacitate}</td>
	</tr>
	<tr>
		<td>Linia</td>
		<td>${tramvai.linia}</td>
	</tr>
	<tr>
		<td>timp/ciclu</td>
		<td>${tramvai.timp_ciclu}</td>
	</tr>
	<tr>
		<td>Functioneaza de la</td>
		<td>${tramvai.pornit}</td>
	</tr>

</table>
<a href="<c:url value="/tramvais/all"/>">Tabelul cu tramvaii</a>
</body>
</html>