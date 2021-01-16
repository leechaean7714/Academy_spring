<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">글보기</h1>


	<table border="1" style="margin-left: auto; margin-right: auto;">
     	<col width="50">
     	<col width="100">
     	<col width="300">
     	<col width="100">
     	
     	<tr>
     		<th>번호</th>
     		<th>작성자</th>
     		<th>제목</th>
     		<th>작성일</th>
     	</tr>
     	<c:choose>
     		<c:when test="${empty list }">
     			<tr>
     				<td colspan="4">------------no comments------------</td>
     			</tr>
     		</c:when>
     		<c:otherwise>
     			<c:forEach items="${list }" var="dto">
     				<tr>
     					<td>${dto.myno }</td>
     					<td>${dto.myname }</td>
     					<td><a href="/myboard/detail?myno=${dto.myno }">${dto.mytitle }</a></td>
     					<td><fmt:formatDate value="${dto.mydate }" pattern="YYYY/MM/dd" type="date"/>
     					</td>
     				</tr>
     			</c:forEach>
     		</c:otherwise>
     	</c:choose>
     	<tr>
     		<td colspan="4" align="right">
     			<input type="button" value="write" onclick="location.href='/myboard/insertform'">
     		</td>
     	</tr>
     </table>



</body>
</html>