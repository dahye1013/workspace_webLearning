<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.bean.BoardDTO.BoardDTO"%>
<%@page import="board.dao.BoardDAO.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
String memId = (String)session.getAttribute("memId");

request.setCharacterEncoding("UTF-8");
BoardDTO boardDTO = new BoardDTO();
List<BoardDTO> list = new ArrayList<BoardDTO>();
int pg = Integer.parseInt(request.getParameter("pg"));

SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd");
SimpleDateFormat timeFormat = new SimpleDateFormat ( "HH시mm분");
// DB
BoardDAO boardDAO = new BoardDAO();
Date today = new Date();
//페이징처리 -1페이지당 5개씩
int endNum = pg*5;
int startNum = endNum-4;
list=boardDAO.boardList(startNum, endNum);

 int totalA = boardDAO.getTotalA(); //총 글수 
 int totalP = (totalA+4)/5;  //더할때는 나누는수 -1을 나눈다

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board 글목록</title>
<style type="text/css">
.subjectA:link{color:black;text-decoration:none;}
.subjectA:visited{color:black; text-decoration:none;}
.subjectA:hover{color:green; text-decoration:underline;}
.subjectA:active{color:black; text-decoration:none;}
#currentPaging{color:red; text-decoration:underline;}
#paging{color:black; text-decoration:none;}
</style>
</head>
<body>

[글목록] - 게시글 총 <%= totalA%>개  
<br>
오늘 날짜 <%=dateFormat.format(today)%>
<br>
지금 시간  <%=timeFormat.format(today)%>
<br>
		

<br>
		
	         
			<table  border="1" width=580px cellspacing=0 cellpadding=3 style=table-layout:fixed
			frame="hsides" rules="rows">
			<tr border=1>
	         <th align=center width='100'>글번호</th>
	         <th align=center width='100'>제목</th>
	         <th align=center width='100'>작성자</th>
	         <th align=center width='100'>작성일</th>
	         <th align=center width='100'>조회수</th>
	        </tr>
<%	        if(list!=null){
 	        for (BoardDTO dto : list) {%>
	        <tr>
	         <td align=center width='100'><%= dto.getSeq()%></td>
	         <td><a class= "subjectA" href="#" onclick="singleBoard('<%=memId %>',<%=dto.getSeq()%>,<%=pg%>)"><%= dto.getSubject()%></a></td>
	         <td align=center width='100'><%= dto.getName()%></td>
	         <%if (dateFormat.format(today).equals(dateFormat.format(dto.getLogdate()))) {%>
	      	   <td align=center width='100'><%= timeFormat.format(dto.getLogdate()) %></td>
	      	   
	        <% }else  {%>
	     	   <td align=center width='100'><%= dto.getLogdate()%></td>
	        <%}%>
	         <td align=center width='100'><%= dto.getHit()%></td>
	        </tr>

	         
			<%} }%>
      
	         </table>
	         
			<%for(int i=1; i<=totalP; i++) {
				if(i==pg){ %>
					<a id=currentPaging href='/memberJSP/board/boardList.jsp?pg=<%= i%>'>[<%= i%>]</a>
				<% }else {%>
					<a id=paging href='/memberJSP/board/boardList.jsp?pg=<%= i%>'>[<%= i%>]</a>
	<%	}	}%>	        
	      
</body>
<script type="text/javascript">
function singleBoard(memId, seq, pg){
  	if(memId=='null'){
  		alert("먼저 로그인하세요.");
  	}else{
		location.href="boardView.jsp?seq="+seq+"&pg="+pg;
  	}
}
</script>
</html>







