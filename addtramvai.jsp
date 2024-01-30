<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Creare entitate</h1>
<form:form method="post" 
	action="${pageContext.request.contextPath}/tramvais/add"
	modelAttribute="tramvai">
	
	<label for="lungimea">Lungimea (m)</label>
	<form:input path="lungimea"/>
	</br>
	
	<label for="nr_scaune">Numarul scaunelor</label>
	<form:input path="nr_scaune"/>
	</br>
	
	<label for="max_capacitate">Capacitatea maxima</label>
	<form:input path="max_capacitate"/>
	</br>
	
	<label for="linia">Linia</label>
	<form:input path="linia"/>
	</br>
	
	<label for="timp_ciclu">timp/ciclu (min)</label>
	<form:input path="timp_ciclu"/>
	</br>
	
	<label for="pornit">Functioneaza de la (an-luna-zi)</label>
	<form:input path="pornit"/>
	</br>
	
	<input type="submit" value="Salveaza" /><br/>

</form:form>
</body>
</html>