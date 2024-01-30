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
	action="${pageContext.request.contextPath}/statiis/add"
	modelAttribute="statii">
	
	<label for="nume">Nume</label>
	<form:input path="nume"/>
	</br>
	
	<label for="urcare">Urcare</label>
	<form:input path="urcare"/>
	</br>
	
	<label for="coborare">Coborare</label>
	<form:input path="coborare"/>
	</br>
	
	<label for="unuN">1N</label>
	<form:input path="unuN"/>
	</br>
	
	<label for="unuR">1R</label>
	<form:input path="unuR"/>
	</br>
	
	<label for="unuS">1S</label>
	<form:input path="unuS"/>
	</br>
	
	<label for="doiN">2N</label>
	<form:input path="doiN"/>
	</br>
	
	<label for="doiR">2R</label>
	<form:input path="doiR"/>
	</br>
	
	<label for="treiN">3N</label>
	<form:input path="treiN"/>
	</br>
	
	<label for="treiR">3R</label>
	<form:input path="treiR"/>
	</br>
	
	<label for="patruN">4N</label>
	<form:input path="patruN"/>
	</br>
	
	<label for="patruR">4R</label>
	<form:input path="patruR"/>
	</br>
	
	<input type="submit" value="Salveaza" /><br/>

</form:form>
</body>
</html>