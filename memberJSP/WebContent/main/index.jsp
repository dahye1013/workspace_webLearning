<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>*** 메인화면 ***</h3>
<br>
<% if(session.getAttribute("memName")==null){%>
<img src="../image/mm.gif" width=150><br>
<a href="http://localhost:8080/memberJSP/member/writeForm.jsp">회원가입</a><br>
<a href="../member/loginForm.jsp">로그인</a><br>
<a href="../board/boardList.jsp?pg=1">글 목록</a><br>
<% }else{%>
<img src="../image/ff.gif" width=150><br>
<a href="../member/modifyForm.jsp">회원정보 수정</a><br>
<a href="../member/logout.jsp">로그아웃</a><br>
<a href="../board/boardWriteForm.jsp">글 쓰기</a><br>
<a href="../board/boardList.jsp?pg=1">글 목록</a><br>
				<!-- 글목록은 처음에 1페이지를 보여줘야하므로, url에 심는다 -->
<% }%>

</body>
</html>