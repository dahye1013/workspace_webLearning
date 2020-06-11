<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h3>회원가입</h3>
	<form name="writeForm" method="post" action="write.jsp">
		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<!--1행-->
				<td width="70" align="center">이 름</td>
				<td><input type="text" name="name" id="name" placeholder="이름 입력" ></td>
			</tr>
			<tr>
				<!--2행-->
				<td width="70" align="center">아이디</td>
				<td><input type="text" name="id" placeholder="아이디 입력" size="30" onkeyup="inputIdChk()">
				<input type="button" value="중복체크" onclick="checkId()">
				<input type="hidden" name="idDuplication" value="idUncheck">
				</td>
			</tr>
			<tr>
				<!--3행-->
				<td width="70" align="center">비밀번호</td>
				<td><input type="password" name="pwd" size="30"></td>
			</tr>
			<tr>
				<!--4행-->
				<td width="70" align="center">재확인</td>
				<td><input type="password" name="repwd" size="30"></td>
			</tr>
			<tr>
				<!--5행-->
				<td align="center">성별</td>
				<td><label/><input type='radio' name='gender' value='0' />남성 &emsp;
					<label/><input type='radio' name='gender' value='1' checked />여성</td>
			</tr>
			<tr>
				<td align="center">이 메 일</td>
				<td><input type="text" name="email1" size="10">@ 
				<input type="email" name="email2" list="defaultEmails"> 
				<datalist id="defaultEmails">
						<option value="naver.com">
						<option value="gmail.com">
						<option value="hanmail.net">
					</datalist></td>
			</tr>
			<tr>
				<!--7행-->
				<td align="center">핸드폰</td>
				<td><select name="tel1" style="width: 50px">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
				</select>
				&nbsp;-&nbsp; 
				<input type="text" name="tel2" size="3">
				&nbsp;-&nbsp; 
				<input type="text" name="tel3" size="3"></td>
			</tr>
			<tr>
				<!--8행-->
				<td width="70" align="center">주소</td>
				<td><input type="text" name="zipcode" id="zipcode" readonly size="7"> 
				<input type="button" value="우편번호검색" onclick="checkPost()"><br> 
				<input type="text" name="addr1" id="addr1" placeholder="주소" size="50" readonly><br> 
				<input type="text" name="addr2" id="addr2" placeholder="상세 주소" size="50" ></td>
			</tr>
			<tr>
				<!--9행-->
				<td colspan="2" align="center">
				<input type="button" value="회원가입" onclick="checkWriteForm()"> &emsp;
			    <input type="reset" value="다시작성">
			    <input type="button" value="로그인" onclick="javascrpit:location.href='loginForm.jsp'">
				</td>
			</tr>
		</table>
		<img src="../image/bb.PNG" width=150>
	</form>
</body>
<script type="text/javascript" src="../js/member.js"> //http://localhost:8080/memberServlet/js/member.js
</script>
</html>