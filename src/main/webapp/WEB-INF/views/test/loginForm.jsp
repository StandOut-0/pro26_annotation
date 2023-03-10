<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${contextPath}/test/login.do" method="post">
<input  type="hidden"  name="userEmail" value="sanghee@sanghee.com" />
<h2>로그인</h2>
<h3>아이디 <input type="text" name="userID" size="10"></h3>
<h3>이름 <input type="text" name="userName" size="10"></h3>
<h3>
<input type="submit" value="로그인">
<input type="reset" value="다시입력"></h3>

</form>
</body>
</html>