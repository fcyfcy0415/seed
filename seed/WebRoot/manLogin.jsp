<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info JobBean = (seeker_Info)request.getAttribute("JobBean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 管理员登录界面 -->
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
<link href="http://112.74.160.130:8080/seed/manLogin.css" rel="stylesheet" type="text/css" />

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="text1">
   </div>
  <div class="text2">  
  <form class="dark-matter" action="manLogin" method="post">
   <h1 class="h1">人才招聘
     <span class="h1>span">In order to be better tomorrow</span>
   </h1>
   
  <label class="label">
   <span  class="label>span">用户名:</span>
    <input class="input[type=text]" id="man_username" type="text" name="man_username" placeholder="您的用户名" />
   </label >

   <label class="label">
    <span class="label>span">密&nbsp;&nbsp;码:</span>
    <input class="input[type=email]" id="man_password" type="text" name="man_password" placeholder="您的密码" />
   </label>
  
   <label class="label">
    <span class="label>span">&nbsp;</span>
    <a><input type="submit" class="button" value="登录" /></a>
    </label>
  </form>
  </div>
</body>
</html>