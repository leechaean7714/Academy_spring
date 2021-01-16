<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">update</h1>
	<form action="updateres" method="post">
	<input type="hidden" value="${dto.myno }" name="myno">
	
		<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>작성자</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
		    <th>제목</th>
			<td>
				<input type="text" value="${dto.mytitle }" name="mytitle">
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea rows="10" cols="60" name="mycontent">${dto.mycontent }</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="update">
				<input type="button" value="cancle" onclick="location.href='/myboard/list'">
			</td>
		</tr>
		</table>
	</form>
</body>
</html>