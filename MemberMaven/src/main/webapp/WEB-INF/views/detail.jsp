<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="update.s" method="post">
<input type="hidden" value="${user.id}" id="id" name="id">
<table>
<tr>
<td>회원아이디</td>
<td>${user.id}</td>
</tr>

<tr>
<td>회원비밀번호</td>
<td><input type="text" value="${user.pass}" id="pass" name="pass"></td>
</tr>

<tr>
<td>회원성명</td>
<td><input type="text" value="${user.name }" id="name" name="name"></td>
</tr>

<tr>
<td>회원주소</td>
<td><input type="text" value="${user.addr }" id="addr" name="addr"></td>
</tr>

<tr>
<td>회원메모</td>
<td><input type="text" value="${user.memo }" id="memo" name="memo"></td>
</tr>
<tr>
	<td align="center">
	<input type="submit" value="수정">
	</td>
</tr>
</table>
</form>
</div>
</body>
</html>