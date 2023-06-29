<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<c:forEach items="${student}" var = "s">
     ${s}<br/>
</c:forEach>
<form action="add">
Number1 : <input type="text" name="nm1">
Number2 : <input type="text" name="nm2">
<input type="submit">
</form>


<c:set var = "str" value="Hi Java Programming Language"></c:set>

Length of String : <c:out value="${fn:length(str)}"></c:out>
Split the string : <c:forEach items="${fn:split(str,' ')}" var="s">
<br/>
${s}
</c:forEach>

IndexOf : <c:out value="${fn:indexOf(str,'Java') }"></c:out><br/>
Endswith : <c:out value="${fn:endsWith(str,'Language') }"></c:out><br/>
Uppercase : <c:out value="${fn:toUpperCase(str) }"></c:out><br/>

<c:if test="${fn:contains(str,'Programming') }">
  Yes Mentioned string is contained
</c:if>

--%>


<sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/demodb" user = "root" password="Dhanaramch@0817"/>
<sql:query var="query" dataSource="${ds}">select * from gadgets</sql:query>

<c:forEach items="${query.rows}" var="s">
  <c:out value="${s.id}"></c:out><c:out value=" : "></c:out><c:out value="${s.name}"></c:out><c:out value=" : "></c:out><c:out value="${s.price}"></c:out><br/>
</c:forEach>

</body>
</html>