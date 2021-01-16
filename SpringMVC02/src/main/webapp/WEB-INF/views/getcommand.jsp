<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<<h1>GET</h1>
	
	<table border="1">
		<tr>
			<th>name</th>
			<th>addr</th>
			<th>phone</th>
		</tr>
		<tr>
			<td>${dto.name }</td>
			<td>${dto.addr }</td>
			<td>${dto.phone }</td>

	    </tr>
	</table>

</body>
</html>