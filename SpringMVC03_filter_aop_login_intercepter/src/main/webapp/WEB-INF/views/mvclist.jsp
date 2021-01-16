<%@page import="com.mvc.upgrade.model.dto.PagingDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
PagingDto pdto = (PagingDto)request.getAttribute("pdto");
int pagegroup = (int)Math.ceil((double)pdto.getPage()/pdto.getPagescale());
int startpage=(pagegroup-1)*pdto.getPagescale()+1;
int endpage=pagegroup*pdto.getPagescale();
int totalpage=pdto.getTotalpage();


%>

<body>

<h1 align="center">글 목록</h1>
	
	<table border="1" align="center">
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
		<tr>
			<td colspan="4" align="center">
			<div>
				<ul style="list-style-type: none;">
				   <li>
					<%
					if(pagegroup>1){
					%><a href="list.do?page=<%=startpage-1%>">prev</a>
					<%} %>
				
		
				   <%for(int pagenum=startpage;pagenum<=((endpage<totalpage)?endpage:totalpage);pagenum++){ %>
				   <a href="list.do?page=<%=pagenum%>"><%=pagenum %></a>
				   <%} %>
				   
				  
				   <%if(endpage<pdto.getTotalpage()){ %>
				   <a href="list.do?page=<%=endpage+1 %>">next</a>
				   <%} %>
				   </li>
				</ul>
			</div>
			</td>
		</tr>
		
		
	</tfoot>	
	</table>



</body>
</html>