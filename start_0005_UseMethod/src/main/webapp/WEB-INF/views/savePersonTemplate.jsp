<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<!-- jquery -->
		<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
	</head>
	
	<body>
		이름: 
		<select id="templateName">
			<option hidden>선택</option>
			<option value="김이름">김이름</option>
			<option value="이이름">이이름</option>
			<option value="박이름">박이름</option>
			<option value="최이름">최이름</option>
		</select>
		
		
		<div id="templateAge">
			나이: 
			<input type="radio" name="age" value="10"/><label>10</label>
			<input type="radio" name="age" value="20"/><label>20</label>
			<input type="radio" name="age" value="30"/><label>30</label>
			<input type="radio" name="age" value="40"/><label>40</label>
			<input type="radio" name="age" value="50"/><label>50</label>
		</div>
		
		<button type="button" onclick="onSaveBtnClick()">저장</button>
		
		<hr/>
		<p>저장된 결과</p>
		<div id="result"></div>
		
		<script type="text/javascript">
			/* 저장버튼 클릭시 */
			function onSaveBtnClick(){
				let choiceName // 선택한 이름
				let choiceAge // 선택한 나이
				
				// 선택한 이름 찾기
				$("#templateName").children().each((index, el)=>{
					const selectEl = $(el)
					if(selectEl.is(":selected") && index > 0){
						choiceName = selectEl.val()
					}
				})
				
				// 선택한 나이 찾기
				$("#templateAge").children().each((index, el)=>{
					const radioEl = $(el)
					if(radioEl.is(":checked")){
						choiceAge = radioEl.val()
					}
				})
				
				// 저장
				$.ajax({
					url: `${pageContext.request.contextPath}/savePersonTemplate`,
					type: 'post',
					data: {name: choiceName, age: choiceAge},
					success: (response) => {
						$("#result").html(JSON.stringify(response, null, 2))
						},
					error: () => {console.log("error")}
				})
			}
		</script>
	</body>
</html>