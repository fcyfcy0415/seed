<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info seeker_Info = (seeker_Info)request.getAttribute("seeker_Info");
String CuowuOne= (String)request.getAttribute("CuowuOne");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> <!-- 登录界面 -->
<head>
<base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="http://112.74.160.130:8080/seed/fail.css" rel="stylesheet" type="text/css" />

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="text1">
   </div>
  <div class="text2">  
  <form class="dark-matter" action="personal" method="post">
   <h1 class="h1"><% out.print(request.getAttribute("CuowuOne")); %>
     <span class="h1>span"></span>
   </h1>
    <label class="label">
    <span class="label>span">&nbsp;</span>
    <input type="submit" class="button" value="确认" />
    <input type="hidden" name="" value=""/>
    <input type="hidden" name="" value=""/>
   </label>
  </form>
  </div>
</body>
</html>