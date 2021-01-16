<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<h1 align="center">글보기</h1>

		<table border="1" style="margin-left: auto; margin-right: auto;" class="table">
			<tr>
				<th>이름</th>
				<td>${dto.myname} </td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${dto.mytitle }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea rows="10" cols="60" readonly="readonly">${dto.mycontent }</textarea>
					
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="update" onclick="location.href='updateform.do?myno=${dto.myno}'">
					<input type="button" value="delete" onclick="location.href='delete.do?myno=${dto.myno}'">
					<input type="button" value="list" onclick="location.href='list.do'">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>