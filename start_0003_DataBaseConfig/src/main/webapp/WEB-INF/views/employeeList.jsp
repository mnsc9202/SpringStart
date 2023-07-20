<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="mnsc.start.databaseconfig.dto.EmployeeDto"%>
<%@page import="java.util.List"%>
<%
	@SuppressWarnings(value = "unchecked")
	List<EmployeeDto> employeeList = (List<EmployeeDto>) request.getAttribute("employeeList");
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
			<th>이름</th><th>성</th><th>직업</th><th>급여</th>
		</tr>
		<%
			for(EmployeeDto employee : employeeList){
		%>
		<tr>
			<td><%=employee.getFirstName() %></td>
			<td><%=employee.getLastName() %></td>
			<td><%=employee.getJobId() %></td>
			<td><%=employee.getSalary() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>