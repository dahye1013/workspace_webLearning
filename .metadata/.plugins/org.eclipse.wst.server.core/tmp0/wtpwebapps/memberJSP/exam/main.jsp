<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>** include directive **</h3>
<%@ include file="today.jsp" %>

<h3>** include JSP tag **</h3>
<jsp:include page="image.jsp"/>

<%
String name = "홍길동";
%>
<br>
<br>
main.jsp name = <%=name %>

<h3>** 3초뒤에 페이지 이동 **</h3>
<% response.setHeader("Refresh","3;url=input.jsp"); %>
</body>
</html>