<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>






<form:form method="post" enctype="mutipart/form-data" 
modelAttribute="uploadFile" action="upload">

<h3>upload</h3>
file<br>
<input type="file" name="mpfile">
<p style="color: red; font-weight: bold" >
	<form:errors path="mpfile"/>
</p>
description<br>
<textarea rows="10" cols="60" name="desc"/>
<input type="submit" value="send"> 

</form:form>
</body>
</html>