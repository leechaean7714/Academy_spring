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

	$(function() {

		$("#loginchk").hide();

	})

	function login() {

		var memberid = $("#memberid").val().trim();
		var memberpw = $("#memberpw").val().trim();

		console.log(memberid + "/" + memberpw);

		if (memberid == null || memberid == "" || memberpw == null
				|| memberpw == "") {

			alert("id와pw를 다시 확인해주세요");

		} else {

			var loginVal = {//자바 스크립트 객체(id에 적어 놓은 것)
				
					
				"memberid" : memberid,
				"memberpw" : memberpw
				
				
			} 

			$.ajax({

				type : "post",
				url : "ajaxlogin.do",
				data : JSON.stringify(loginVal),//자바스크립트 값이나 객체를 json문자열로 변환 ex)({ x: 5, y: 6 })
				contentType : "application/json",//없으면 어떻게 되는지 해보기(통신실패)//없으면 requestbody로 정보를 받을 수 없다.
				dataType : "json",
				success : function(msg) {
						
				
					if (msg.check == true) {

						location.href = "list.do";

					} else {

						/* $("#loginchk").show();

						$("#loginchk").html("id와pw가 잘못되었습니다.").css("color",
								"red"); */
						$("#loginchk").show().css("color","red").html("id와pw를 가 잘못되었습니다.");		
					}
				},
				error : function() {

					alert("통신실패");

				}

			})
		}
	}
	
	
	
	
	
</script>

</head>
<body>

	<table align="center">
		<tr>
			<th>id</th>
			<td><input type="text" id="memberid"></td>
		</tr>
		<tr>
			<th>pw</th>
			<td><input type="password" id="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<input type="button" value="login" onclick="login();">
			<input type="button" value="regist" onclick="location.href='registform.do'">
			</td>
		</tr>
		<tr>

			<td colspan="2" align="center" id="loginchk"></td>
		</tr>

	</table>

</body>
</html>