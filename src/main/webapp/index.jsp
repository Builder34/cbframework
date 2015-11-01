<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath() ;
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>" />
    <link rel="shortcut icon" href="statics/favicons.png" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>
<body>
	<jsp:forward page="/index" />
</body>
</html>