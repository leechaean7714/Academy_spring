<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .table {
      border-collapse: collapse;
      border-top: 3px solid #168;
    }  
    .table th {
      color: #168;
      background: #f0f6f9;
      text-align: center;
    }
    .table th, .table td {
      padding: 10px;
      border: 1px solid #ddd;
    }
    .table th:first-child, .table td:first-child {
      border-left: 0;
    }
    .table th:last-child, .table td:last-child {
      border-right: 0;
    }
    .table tr td:first-child{
      text-align: center;
    }
     .table caption{caption-side: bottom; display: none;}
  </style>
</head>

<body>

<h1 align="center">글 목록</h1>
	
	<table border="1" style="margin-left: auto; margin-right: auto;" class="table">
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
			<th>작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${empty list} ">
				<tr>
					<td colspan="4">-------------작성된 글이 없습니다.------------</td>
				</tr>
			</c:when>
			<c:otherwise><!-- 모든 조건이 거짓일때 -->
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.myno} </td>
						<td>${dto.myname} </td>
						<td><a href="detail.do?myno=${dto.myno}">${dto.mytitle}</a> </td>
						<td><fmt:formatDate value="${dto.mydate }" pattern="YYYY/MM/dd" type="date"/></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</tbody>
	<tfoot>	
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="write" onclick="location.href='insert.do'">
			</td>
		</tr>
		
	</tfoot>	
	</table>



</body>
</html>