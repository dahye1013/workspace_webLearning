<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="dataDTO" class="exam.bean.DataDTO" scope="session"/>
<jsp:setProperty property="x" name="dataDTO"/>
<jsp:setProperty property="y" name="dataDTO"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form name="sumForm" method="post" action="mul.jsp">
<jsp:getProperty property="x" name="dataDTO"/> + 
<jsp:getProperty property="y" name="dataDTO"/>=
<%= dataDTO.getX() + dataDTO.getY() %> <br><br>

<input type="button" value="�� ���ϱ�" onclick="location.href='mul.jsp'">
<input type="submit" value="�� ���ϱ�" onclick="location.href='mul.jsp'">


</form>
</body>
</html>