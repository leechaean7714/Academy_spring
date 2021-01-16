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

		if (memberid == null || memberid == "" || memberpw == null
				|| memberpw == "") {
			
			alert("id와 pw를 확인해주세요.");

		}else{
			
			var loginVal={
					
					"memberid":memberid,
					"memberpw":memberpw
			}
			
			$.ajax({
				
				
				type:"post",
				url:"ajaxlogin.do",
				data:JSON.stringify(loginVal),
				contentType:"application/json",
				dataTyep:"json",
				success:function(msg){
					
					if(msg.check==true){
						
					location.href="list.do";
					
					}else{
					
						$("#loginchk").show().css("color","red").html("id와pw를 가 잘못되었습니다.");
						
					}
					
				},
				error:function(){
					
					alert("통신실패");
					
				}
			})
		}

	}
</script>
</head>
<body>

	<table>
		<tr>
			<th>id</th>
			<td><input type="text" id="meberid"></td>
		</tr>
		<tr>
			<th>pw</th>
			<td><input type="text" id="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="button" value="login"
				id="login();"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginchk"></td>
		</tr>
	</table>



</body>
</html>