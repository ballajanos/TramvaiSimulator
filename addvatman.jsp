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
	action="${pageContext.request.contextPath}/vatmans/add"
	modelAttribute="vatman">
	
	<label for="nume">Nume</label>
	<form:input path="nume"/>
	
	<label for="prenume">Prenume</label>
	<form:input path="prenume"/>
	
	<label for="gen">Gen</label>
	<form:input path="gen"/>
	
	<label for="varsta">Varsta</label>
	<form:input path="varsta"/>
	
	<label for="ani_experienta">Ani de experienta</label>
	<form:input path="ani_experienta"/>
	
	<label for="mers_tramvai">Mers de tramvai</label>
	<form:input path="mers_tramvai"/>
	
	<input type="submit" value="Salveaza" /><br/>

</form:form>
</body>
</html>