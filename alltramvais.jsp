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
<h1>Tramvai</h1> <hr/>
<table border=1>
<tr>
 <th>idx</th>
 <th>ID</th>
 <th>LUNGIMEA (m)</th>
 <th>NUMARUL SCAUNELOR</th>
 <th>CAPACITATEA MAXIMA</th>
 <th>LINIA</th>
 <th>TIMP PENTRU UN CICLU (min)</th>
 <th>FUNCTIONEAZA DE LA</th>
 <th colspan=3>ACTIONS</th>
 </tr>
<c:forEach var="t" items="${tramvai}" varStatus="idx">
<tr ${idx.index%2==0? "style='background-color:lightsteelblue;color:black;text-align:center'" : (idx.index%3==0? "style='background-color:skyblue;color:black;text-align:center'" : "style='background-color:turquoise;color:black;text-align:center'")}>
 <td><c:out value="${idx.index}"/></td>
 <td> <c:out value="${t.id}"/> </td>
 <td> <c:out value="${t.lungimea}"/> </td>
 <td> <c:out value="${t.nr_scaune}"/> </td>
 <td> <c:out value="${t.max_capacitate}"/> </td>
 <td> <c:out value="${t.linia}"/> </td>
 <td> <c:out value="${t.timp_ciclu}"/> </td>
  <td> <c:out value="${t.pornit}"/> </td>
 <td><a href="<c:url value="/tramvais/${t.id}"/>">Detalii</a>  </td>
 <td><a href="<c:url value="/tramvais/edit/${t.id}"/>">Editeaza</a>  </td>
 <td> <a href="<c:url value="/tramvais/delete/${t.id}"/>">Sterge</a> </td>
		</tr>
	</c:forEach> 
</table>
<a href="<c:url value="/tramvais/add"/>">Adauga un tramvai</a>
</br>
<a href="<c:url value="/statiis/all"/>">Statiile</a>
</br>
<a href="<c:url value="/vatmans/all"/>">Vatman</a>
</body>
</html>