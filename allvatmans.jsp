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
<h1>All vatmans</h1> <hr/>
<table border=1>
<tr>
 <th>idx</th>
 <th>ID</th>
 <th>NUME</th>
 <th>PRENUME</th>
 <th>GEN</th>
 <th>VARSTA</th>
 <th>ANI DE EXPERIENTA</th>
 <th>MERSUL DE TRAMVAI</th>
 <th colspan=3>ACTIONS</th>
 </tr>
<c:forEach var="v" items="${vatman}" varStatus="idx">
<tr ${idx.index%2==0? "style='background-color:bisque;color:black;text-align:center'": "style='background-color:coral;text-align:center'" }>
 <td><c:out value="${idx.index}"/></td>
 <td> <c:out value="${v.id}"/> </td>
 <td> <c:out value="${v.nume}"/> </td>
 <td> <c:out value="${v.prenume}"/> </td>
 <td> <c:out value="${v.gen}"/> </td>
 <td> <c:out value="${v.varsta}"/> </td>
 <td> <c:out value="${v.ani_experienta}"/> </td>
  <td> <c:out value="${v.mers_tramvai}"/> </td>
 <td><a href="<c:url value="/vatmans/${v.id}"/>">Detalii</a>  </td>
 <td><a href="<c:url value="/vatmans/edit/${v.id}"/>">Editeaza</a>  </td>
 <td> <a href="<c:url value="/vatmans/delete/${v.id}"/>">Sterge</a> </td>
		</tr>
	</c:forEach> 
</table>
<a href="<c:url value="/vatmans/add"/>">Adauga un vatman</a>
</br>
<a href="<c:url value="/statiis/all"/>">Statiile</a>
</br>
<a href="<c:url value="/tramvais/all"/>">Tramvai</a>
</body>
</html>