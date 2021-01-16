<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--
 enctype:해당 데이터가 제출될 때 인코딩 되는 방법 
 1.multipart/form-data:모든 문자를 인코딩 하지 않는다.<form>이 주로 파일이나 이미지를 보낼 때 사용한다. 무조건 post에서 사용 한다.
 2.application/x-www-form-urlencoded:모든 문자를 인코딩 한다.
 3.text/plain:공백은 "+"로 인코딩 되지만, 나머지 글자들은 인코딩 되지 않는다.
 
 modelAttribute:request 로부터 찾을때 사용할 이름을 지정합니다


 -->

	<form:form method="post" enctype="multipart/form-data"
		modelAttribute="uploadFile" action="upload">
		<h3>UPLOAD Form</h3>

		file<br>
		<input type="file" name="mpfile">
		<p style="color: red; font-weight: bold;">
			<form:errors path="mpfile"></form:errors>


		</p>
		<br>
			description<br>
		<textarea rows="10" cols="60" name="desc"></textarea>
		<br />
		<input type="submit" value="send">

	</form:form>

</body>
</html>