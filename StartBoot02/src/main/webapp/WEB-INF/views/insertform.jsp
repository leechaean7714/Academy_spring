<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">write</h1>
	<form action="insertres" method="post">
	<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>작성자</th>
			<td>
				<input type="text" name="myname">
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>
				<input type="text" name="mytitle">
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea rows="10" cols="60" name="mycontent"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="write">
				<input type="button" value="cancle" onclick="locaation.href='/myboard/insertres'">
			</td>
		</tr>
	
	</table>
	</form>

</body>
</html>