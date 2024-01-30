<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulator de tramvai</title>
</head>
<body>
<h1>All statii</h1> <hr/>
<table border=1>
<tr>
 <th>idx</th>
 <th>ID</th>
 <th>NUME</th>
 <th>URCARE</th>
 <th>COBORARE</th>
 <th>1N</th>
 <th>1R</th>
 <th>1S</th>
 <th>2N</th>
 <th>2R</th>
 <th>3N</th>
 <th>3R</th>
 <th>4N</th>
 <th>4R</th>
 <th colspan=3>ACTIONS</th>
 </tr>
<c:forEach var="s" items="${statii}" varStatus="idx">
<tr ${idx.index%2==0? "style='background-color:teal;color:white;text-align:center'" : "style='background-color:aquamarine;text-align:center'" }>
 <td><c:out value="${idx.index}"/></td>
 <td> <c:out value="${s.id}"/> </td>
 <td> <c:out value="${s.nume}"/> </td>
 <td> <c:out value="${s.urcare}"/> </td>
 <td> <c:out value="${s.coborare}"/> </td>
 <td> <c:out value="${s.unuN}"/> </td>
 <td> <c:out value="${s.unuR}"/> </td>
 <td> <c:out value="${s.unuS}"/> </td>
 <td> <c:out value="${s.doiN}"/> </td>
 <td> <c:out value="${s.doiR}"/> </td>
 <td> <c:out value="${s.treiN}"/> </td>
 <td> <c:out value="${s.treiR}"/> </td>
 <td> <c:out value="${s.patruN}"/> </td>
 <td> <c:out value="${s.patruR}"/> </td>
 <td><a href="<c:url value="/statiis/${s.id}"/>">Detalii</a>  </td>
 <td><a href="<c:url value="/statiis/edit/${s.id}"/>">Editeaza</a>  </td>
 <td> <a href="<c:url value="/statiis/delete/${s.id}"/>">Sterge</a> </td>
		</tr>
	</c:forEach> 
</table>
<a href="<c:url value="/statiis/add"/>">Adauga o noua statie</a>
</br>
<a href="<c:url value="/vatmans/all"/>">Vatman</a>
</br>
<a href="<c:url value="/tramvais/all"/>">Tramvai</a>
</body>
</html>