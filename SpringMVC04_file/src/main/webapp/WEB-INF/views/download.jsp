<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	file: ${fileObj.name }<br>
	desc: ${fileObj.desc }<br>
	
	

	<form action="download" method="post">
		
			<input type="hidden" name="name" value="${fileObj.name }">
			<input type="submit" value="download">
		
	</form>
	
	
	
	

	<!-- 나는 이런 타입을 저장 할 수 있어



mime-type(Multipurpose Internet Mail Extension)
request header 에 지정되는 데이터가 어떤 종류의 stream인지를 나타내주는 프로토콜.

tomcat - web.xml읽어보기

		추가 방법
	<mime-mapping>
        <extension>hwp</extension>
        <mime-type>application/unknown</mime-type>
    </mime-mapping>

 -->

</body>
</html>