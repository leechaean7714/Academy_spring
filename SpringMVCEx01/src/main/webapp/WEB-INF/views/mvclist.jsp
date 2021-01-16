<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글보기</h1>
	<table border="1">
		<colgroup>
			<col width="50">
			<col width="100">
			<col width="200">
			<col width="100">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
		<c:choose>
			<c:when test="${empty list} ">
				<tr>
					<td colspan="4">---------------작성된 글이 없습니다.-------------</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.seq }</td>
						<td>${dto.name }</td>
						<td><a href="detail.do?seq=${dto.seq }">${dto.title }</a></td>
						<td><fmt:formatDate value="${dto.mydate }" pattern="YYYY/MM/dd" type="date"/></td>
					</tr>
				</c:forEach>
			</c:otherwise>
			</c:choose>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4" align="right">
					<input type="button" value="write" onclick="location.href='insertform.do'">
				</td>
			</tr>
		</tfoot>
	</table>

</body>
</html>