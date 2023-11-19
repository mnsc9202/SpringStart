<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<ul>
			<li>
				<a href="personList">person 목록 조회</a>
			</li>
			
			<li>
				<span onclick="movePersonPage()">person 단건 조회</span>
			</li>
			
			<li>
				<span onclick="moveSavePersonPage()">person 등록</span>
			</li>
			
			<li>
				<a href="#" onclick="moveSavePersonTemplatePage()">person 등록(템플릿)</a>
			</li>
			
			<li>
				<span onclick="moveUpdatePersonPage()">person 수정</span>
			</li>
			
			<li>
				<span onclick="moveDeletePersonPage()">
				person 삭제
				</span>
				<form id="moveDeletePersonPage" action="deletePerson">
				</form>
			</li>
		</ul>
		
		<script type="text/javascript">
			/* person 단건 조회 페이지로 이동 */
			function movePersonPage(){
				location.assign(`${pageContext.request.contextPath}/person`)
			}
			
			/* person 등록 페이지로 이동 */
			function moveSavePersonPage(){
				location.href = `${pageContext.request.contextPath}/savePerson`
			}
			
			/* person 등록(템플릿) 페이지로 이동 */
			function moveSavePersonTemplatePage(){
				location.href = 'savePersonTemplate'
			}
			
			/* person 수정 페이지로 이동 */
			function moveUpdatePersonPage(){
				location.replace(`${pageContext.request.contextPath}/updatePerson`)
			}
			
			/* person 삭제 페이지로 이동 */
			function moveDeletePersonPage(){
				document.getElementById("moveDeletePersonPage").submit()
			}
		</script>
	</body>
</html>