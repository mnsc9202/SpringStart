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
				<th>이름</th><th>나이</th><th>삭제</th>
			</tr>
			<%
				for(PersonDto person : personList){
			%>
				<tr>
					<td><%=person.getName() %></td>
					<td><%=person.getAge() %></td>
					<td>
						<button type="button" onclick="onDeleteBtnClick(<%=person.getSeq()%>)">
							삭제
						</button>
						<form id="deletePerson_<%=person.getSeq() %>" action="deletePerson" method="post">
							<!-- delete 방식 적용 -->
							<input type="hidden" name="_method" id="_delete" value="delete"/>
							<input type="text" name="seq" value="<%=person.getSeq() %>" hidden/>
						</form>
					</td>
				</tr>
			<% } %>
		</table>
			
		<script type="text/javascript">
			/* 삭제버튼 클릭시 */
			function onDeleteBtnClick(seq){
				document.getElementById('deletePerson_' + seq).submit()
			}
		</script>
	</body>
</html>