<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
//String name = request.getParameter("name");
//String id = request.getParameter("id"); 
String name = null;
String id = null;
String email= null;
//쿠키
/* Cookie[] ar= request.getCookies(); //특정 쿠키를 얻지 못하고 모든 쿠키를 얻어오기
if(ar!=null){
	for(int i = 0 ; i<ar.length; i++){
		
		//String cookieName = ar[i].getName(); //쿠키명
		//String cookieValue = ar[i].getValue(); //값
		//System.out.println("쿠키명="+cookieName+"  쿠키값="+cookieValue);
		
		if(ar[i].getName().equals("memName")) name=ar[i].getValue();
		else if(ar[i].getName().equals("memId")) id=ar[i].getValue();
		
		
	}//for
} */

//세션
name = (String)session.getAttribute("memName");
id = (String)session.getAttribute("memId");
email = (String)session.getAttribute("memEmail") ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="../image/bb.PNG" onclick="javascrpit:location.href='../main/index.jsp'" 
style="cursor: pointer;">

<br>
 <%= name %>님<br>
로그인 성공<br><br>
	<input type="reset" value="로그아웃" onclick="location.href='logout.jsp'">
	<input type="submit" value="회원정보수정" onclick="location.href='modifyForm.jsp'">
	<input type="button" value="메인화면" onclick="location.href='../main/index.jsp'">
</body>
</html>