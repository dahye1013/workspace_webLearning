<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
request.setAttribute("apple","사과");
//페이지 이동
response.sendRedirect("sendResult.jsp");
%>
    