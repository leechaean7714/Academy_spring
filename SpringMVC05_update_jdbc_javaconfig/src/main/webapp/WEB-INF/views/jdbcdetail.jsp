<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">글 보기</h1>
	<table border="1" align="center">
		<tr>
			<th>작성자</th>
			<td>${dto.writer}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.title }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea rows="10" cols="60" readonly="readonly">${dto.content }</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="update" onclick="location.href='updateform.do?seq=${dto.seq}'">
				<input type="button" value="delete" onclick="location.href='delete.do?seq=${dto.seq}'">
				<input type="button" value="list" onclick="location.href='list.do'">
			</td>
		</tr>
	</table>

</body>
</html>