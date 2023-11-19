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
				<th>이름</th><th>나이</th>
			</tr>
			<%
				for(PersonDto person : personList){
			%>
				<tr>
					<td><%=person.getName() %></td>
					<td><%=person.getAge() %></td>
				</tr>
			<% } %>
		</table>
	</body>
</html>