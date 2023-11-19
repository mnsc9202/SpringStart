<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="mnsc.start.useMethod.dto.PersonDto"%>
<%@page import="java.util.List"%>

<%
	List<PersonDto> personList = (List<PersonDto>)request.getAttribute("personList");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<table border="1">
			<tr>
				<th>이름</th><th>나이</th><th>수정</th>
			</tr>
			<%
				for(PersonDto person : personList){
			%>
				<tr>
					<td><%=person.getName() %></td>
					<td><%=person.getAge() %></td>
					<td>
						<button type="button" onclick="onChoiceBtnClick(<%=person.getSeq()%>, '<%=person.getName()%>', <%=person.getAge()%>)">
							선택
						</button>
					</td>
				</tr>
			<% } %>
		</table>
		
		<hr/>
		
		<form id="updatePerson" action="updatePerson" method="post">
			<!-- put 방식 적용 -->
			<input type="hidden" name="_method" id="_put" value="put"/>
			<input type="number" name= "seq" value="" hidden />
			이름: <input type="text" name="name"/>
			나이: <input type="number" name="age" />
		</form>
		
		<button type="button" onclick="onUpdateBtnClick()">수정</button>
		
		<script type="text/javascript">
			/* 선택버튼 클릭시 */
			function onChoiceBtnClick(seq, name, age){
				const formEl = document.getElementById("updatePerson");
				
				// 수정 form에 값 지정
				formEl.children.item(1).value = seq
				formEl.children.item(2).value = name
				formEl.children.item(3).value = age
				
			}
		
			/* 수정버튼 클릭시 */
			function onUpdateBtnClick(){
				document.getElementById("updatePerson").submit()
			}
		</script>
	</body>
</html>