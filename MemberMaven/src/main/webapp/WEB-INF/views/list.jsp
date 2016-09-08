<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>회원목록보기</h1>
<h3><a href="insert.s">회원가입</a></h3>
<table border="1" width="700">
<tr>
<th>아이디</th>
<th>성명</th>
<th>주소</th>
<th>메모</th>
<th>삭제</th>
</tr>

<c:forEach var="user" items="${userlist}">
<tr>
<td>${user.id}</td>
<td><a href="detail.s?id=${user.id}">${user.name}</a></td>
<td>${user.addr}</td>
<td>${user.memo}</td>
<td><a href="delete.s?id=${user.id}">삭제</a></td>
</tr>
</c:forEach>
</table>

<form action="list.s">
<table>
<tr>
<td align="center">
<select name="field">
	<option value="name">이름</option>
	<option value="memo">내용</option>
</select>
<input type="text" name="word">
<input type="submit" value="search">
</td>
</tr>
</table>
</form>
</div>
</body>
</html>