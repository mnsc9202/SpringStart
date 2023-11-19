<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form id="savePerson" action="savePerson" method="post">
			이름: <input type="text" name="name"/>
			나이: <input type="number" name="age"  value="0"/>
		</form>
		
		<button type="button" onclick="onSaveBtnClick()">저장</button>
		
		<script type="text/javascript">
			/* 저장버튼 클릭시 */
			function onSaveBtnClick(){
				document.getElementById("savePerson").submit()
			}		
		</script>
	</body>
</html>