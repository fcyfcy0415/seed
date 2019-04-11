<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info JobBean = (seeker_Info)request.getAttribute("JobBean");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 管理员界面 -->
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
<link href="http://112.74.160.130:8080/seed/manager.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
 	<div class="text1">
 	 <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/manager.jsp" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="首页"></a></div></th>
          <th align="right"><div><a href="http://112.74.160.130:8080/seed/managerInf.jsp" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="管理员信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/manager.jsp" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/manLogin.jsp" type="button"   id="btn_register" onclick="" ><input class="button3"type="button" class="" value="退出"></a></div></th>
         </tr>
   </table>
   	</div>
   	<div class="text0">
   </div>
  <div class="text2">  
    
 	 <form action="" method="post" class="elegant-aero">
		<h1 class="h1">收到的举报信息
			<span class="h1>span"></span>
		</h1>
		<div><a href="http://112.74.160.130:8080/seed/manPerCom.jsp"><input class="button" type="button" value="项目经理1"></a></div>
		<div><a href="http://112.74.160.130:8080/seed/manPerCom.jsp"><input class="button" type="button" value="项目经理2"></a></div>
     </form>
  
  <form action="manager" method="post" class="elegant-aero">
		<h1 class="h1">用户搜索栏
			<span class="h1>span">搜索用户信息</span>
		</h1>
        
		<label class="label">
			<span class="label>span">账号：</span>
			<input class="input[type=text]" id="username" type="text" name="username" placeholder="输入用户账号" />
		</label>
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<a href="http://112.74.160.130:8080/seed/manPerIn.jsp"><input class="button" type="submit" class="button" value="搜索" /></a>
		</label>
	</form>
	 <form action="managr" method="post" class="elegant-aero">
		<h1 class="h1">企业用户搜索栏
			<span class="h1>span">搜索企业用户信息</span>
		</h1>
        
		<label class="label">
			<span class="label>span">账号：</span>
			<input class="input[type=text]" id="com_username" type="text" name="com_username" placeholder="输入用户账号" />
		</label>
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<a href="http://112.74.160.130:8080/seed/manComIn.jsp"><input class="button" type="submit" class="button" value="搜索" /></a>
		</label>
	</form>
</div>
 </body>
</html>