<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">글수정</h1>
	<form action="updateres.do" method="post">
		<input type="hidden" name="myno" value="${dto.myno }">
		
		<table border="1" align="center">
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
				<textarea rows="10" cols="60" name="mycontent">${dto.mycontent }
				    </textarea></td>	
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="update">
					<input type="button" value="cancle" onclick="location.href='detail.do?myno=${dto.myno}'">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>