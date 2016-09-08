<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert.s" method="post">
<h2 align="center">회원가입</h2>
  <hr>
  아이디<input type="text" name="id"><br>
  비밀번호<input type="text" name="pass"><br>
  성명<input type="text" name="name"><br>
  주소<input type="text" name="addr"><br>
  메모<textarea name="memo"></textarea>
  <hr>
  <input type="submit" value="가입">
  <br><br>
  <a href="list.s">리스트(L)</a>
  </form>
</body>
</html>