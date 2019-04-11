<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info seeker_Info = (seeker_Info)request.getAttribute("seeker_Info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> <!-- 登录界面 -->
<head>
<base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma"        content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires"       content="0">    
	<meta http-equiv="keywords"      content="keyword1,keyword2,keyword3">
	<meta http-equiv="description"   content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="http://112.74.160.130:8080/seed/seed.css" rel="stylesheet" type="text/css" />
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

  <div class="text1">
 	  <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/businessOne"      type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="企业注册"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/registerOne" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="用户注册"></a></div></th>
       </tr>
      </table>
  </div>
  
  <div class="text2">  
    <form class="dark-matter" action="login" method="get">
     
      <h1 class="h1">人才招聘
       <span class="h1>span">In order to be better tomorrow</span>
      </h1>
   
      <label class="label">
       <span  class="label>span">用户名:</span>
       <input class="input[type=text]" id="username" type="text" name="username" placeholder="您的用户名" />
      </label >

      <label class="label">
       <span class="label>span">密&nbsp;&nbsp;码:</span>
       <input class="input[type=password]" id="password" type="password" name="password" placeholder="您的密码" />
      </label>
  
      <label class="label">
       <input type="radio" value="qiye" name="panduan">企业
       <input type="radio" value="geren" name="panduan">个人
       <span class="label>span">&nbsp;</span>
       <a><input type="submit" class="button" value="登录" /></a>
       <a href="http://112.74.160.130:8080/seed/forgetPassword.jsp"><input type="button" class="button2" value="找回密码" /></a>
      </label>
      
      <label class="label">
       <span class="label>span">&nbsp;</span>
       <a href="http://112.74.160.130:8080/seed/visitor.jsp"><input type="button" class="button" value="游客" /></a>
      </label>
      
    </form>
  </div>
 </body>
</html>