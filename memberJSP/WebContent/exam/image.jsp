<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<img src="../image/aa.PNG" width=180 height=150>
<% 
String name = "또치";
//태그 되는 것을 독립적으로 컴파일 되기 때문에 변수끼리 충돌이 발생하지 않는다.
%>
image.jsp name = <%=name %>
<br>
