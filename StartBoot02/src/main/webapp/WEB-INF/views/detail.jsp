<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1 align="center">detail</h1>
	<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>작성자</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea rows="10" cols="60" readonly="readonly">${dto.mycontent }</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="update" onclick="location.href='/myboard/updateform?myno=${dto.myno}'">
				<input type="button" value="delete" onclick="location.href='/myboard/delete?myno=${dto.myno}'">
				<input type="button" value="cancle" onclick="location.href='/myboard/list'">
			</td>
		</tr>
	
	</table>

</body>
</html>