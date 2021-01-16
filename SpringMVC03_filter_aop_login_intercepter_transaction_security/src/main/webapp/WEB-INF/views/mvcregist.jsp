<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function idChkForm() {

		var idck = document.getElementsByName("memberid")[0].title;

		if (idck == 'n') {

			alert("id와 pw를 입력해주세요.");
			document.getElementsByName("memberid")[0].focus();
		}

	}

	function idChk() {

		var doc = document.getElementsByName("memberid")[0];
		if (doc.value.trim() == "" || doc.value == null) {

			alert("아이디를 입력해주세요.");
		} else {

			open("idChk.do?memberid=" + doc.value, "", "width=200, heigth=200");
		}

	}
</script>
</head>
<body>

	<h1 align="center">회원가입</h1>
	<form action="registres.do" method="post">
		<table border="1" align="center">

			<tr>
				<th>아이디</th>
				<td><input type="text" name="memberid" required="required"
					id="mid" title="n"> <input type="button" value="중복체크"
					onclick="idChk();"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memberpw" required="required"
					onclick="idChkConform();"></td>
			</tr>
			<!-- <tr>
				<th>비밀번호확인</th>
				<td><input type="text" name="memberpwchk"></td>
			</tr> -->
			<tr>
				<th>이름</th>
				<td><input type="text" name="membername" required="required"
					onclick="idChkConform();"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="memberaddr" required="required"
					onclick="idChkConform();"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="memberphone" required="required"
					onclick="idChkConform();"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="memberemail" required="required"
					onclick="idChkConform();"></td>
			</tr>
			<tr>
				<td colspan="3" align="right"><input type="submit" value="가입하기">
					<input type="button" value="취소"
					onclick="location.href='loginform.do'"></td>
			</tr>
		</table>
	</form>
</body>
</html>