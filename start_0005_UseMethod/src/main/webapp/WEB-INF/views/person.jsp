<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="mnsc.start.useMethod.dto.PersonDto"%>
<%
	/* model 조회 */
	PersonDto person = (PersonDto)request.getAttribute("person");

	/* 세션 조회 */
	String searchName = (String)request.getSession().getAttribute("searchName");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%if(person == null){ %>
			<div>사용자가 없습니다</div>		
		<%}else{ %>
			<div>번호: <%=person.getSeq() %></div>
			<div>이름: <%=person.getName() %></div>
			<div>나이: <%=person.getAge() %></div>		
		<%} %>
		
		<%if(searchName != null){%>
			<div>검색한 이름: <%=searchName %></div>
		<%}%>
		
		<hr/>
		<form id="person" action="person">
			이름: <input type="text" name="name">
			<button type="submit">검색</button>		
		</form>
	</body>
</html>