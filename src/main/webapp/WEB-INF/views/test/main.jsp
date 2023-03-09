<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<%
  request.setCharacterEncoding("UTF-8");
%>    


<html>
<head>
<meta charset=UTF-8">
<title>${msg}</title>
</head>
<body>
<h1>${msg}</h1>
<p>@RequestMapping을 이용해 ${msg}() 메소드가 실행되었습니다.</p>
</body>
</html>
