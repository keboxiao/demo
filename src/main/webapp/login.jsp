<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Integer counter = (Integer)session.getAttribute("counter"); %>
<h1>您是第<%=counter%>次登录</h1>
</body>
</html>