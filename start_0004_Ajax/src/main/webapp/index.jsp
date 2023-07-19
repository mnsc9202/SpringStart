<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="#">
<title>Insert title here</title>
<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>
<body>
	
	<div id="fruitList"></div>
	<!-- 언어 선택목록 -->
	<select id="language">
	<%
		String[] languageArr = {"kor", "eng"};
		for(String language : languageArr){
	%>
		<option value="<%=language%>">
			<%=("kor".equals(language))?"한글":"영어" %>
		</option>
		
	<%} %>
	</select>
	
	
	<!-- 색상 선택목록 -->
	<select id="color">
	<%
		String[] colorArr = {"red", "purple","lightBrown"};
		for(String color : colorArr){
	%>
		<option value=<%=color%>><%=color %></option>
		
		<%} %>
	</select>
	
	<!-- 목록가져오기 버튼 -->
	<button onclick="getFruitList()">과일 목록 가져오기</button>
	
	<!-- 목록 초기화 버튼 -->
	<button onclick="resetFruitList()">목록 초기화</button>
	
	
	<script>
		/* 과일별 언어 */
		const fruitLanguage = {}
	
		/* 과일 이름 언어 */
		const language = "eng";
		
		/* 과일 색상 */
		const color = "red";
	
		/* 과일 목록가져오기 */
		function getFruitList(){
			$.ajax({
				url: "getFruitList.do",
				type: "get",
 				data: {"language": $("#language").val(), "color": $("#color").val()},
				success: function (responseData){
					console.clear();
					console.table(responseData);
					console.log("responseData(JSON): " + JSON.stringify(responseData, null, 2));
					
					/* 목록 테이블을 1개만 생성 */
					if(!$("#fruitList").find('table').length){
						/* 목록 테이블 작성 */
						let fruitListTable = "<table border=1> <tr> <td>과일 이름</td> <td>언어 변경</td> </tr>";
						for(i=0; i<responseData.length; i++){
							fruitListTable += `
											<tr>
												<td id=\${responseData[i].fruitName}>\${responseData[i].fruitName}</td>
												<td>
													<button onclick=getFruitName(\"\${responseData[i].fruitName}\")>변경</button>
												</td>
											</tr>
											`;
							fruitLanguage[`\${responseData[i].fruitName}`] = $("#language").val();
						}
						fruitListTable += "</table>";
						
						/* 과일별 언어 설정 */
						$("#fruitList").append(fruitListTable);
					}
				},
				error: function(){
					console.log("error");
				}
				
			})
		}
		
		/* 과일이름 언어 변경하기 */
		function getFruitName(name){
			$.ajax({
				url: "getFruitName.do",
				type: "get",
				data: {language: fruitLanguage[`\${name}`], name: $(`#\${name}`).text()},
				success: function (responseData){
					/* 과일이름 변경 */
					$(`#\${name}`).text(responseData);
					
					/* 과일별 언어 설정 변경 */
					fruitLanguage[`\${name}`] = (fruitLanguage[`\${name}`]==='kor')?'eng':'kor';
				},
				error: function(){
					console.log("error");
				}
				
			})			
		}
		
		/* 과일목록 초기화하기 */
		function resetFruitList(){
			$("#fruitList").empty();
		}
		
	</script>
</body>
</html>