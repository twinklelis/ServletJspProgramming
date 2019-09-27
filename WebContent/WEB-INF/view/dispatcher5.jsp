<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>dispatcher5.jsp</h4>
	<%-- How1 --%> <!-- jsp주석, 응답을 만들 때 빠짐 아예 클라이언트로 가지 않음 -->
	<!-- How1 --> <!-- 내용을 받지만 랜더링 하지 않는 주석 -->
	name : <%=request.getAttribute("name") %><br/> <!-- %=은 해당자리에 값을 넣어주라는..! -->
	age : <%=request.getAttribute("age") %><br/><br/>
	
	<%-- How2(Expression Language : EL) --%>
	name : ${name}<br/> <!-- ${...}는 이 키에 해당하는 값을 가져옴 -->
	age : ${age}<br/>
	
	<!-- 
	*DispatcherServlet5.java참고
	request.setAttribute("name", name);
	request.setAttribute("age", intAge);
	꼭 이렇게 저장을 해줘야 위의 코드들을 이용할 수 있다
	 -->
</body>
</html>