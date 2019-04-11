<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.bam" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
bam bam = (bam)request.getAttribute("ban");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 管理员调查用户信息界面 -->
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
<link href="http://112.74.160.130:8080/seed/manPerIn.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

 	<div class="text1">
 	 <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/manager.jsp" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/manLogin.jsp" type="button"   id="btn_register" onclick="" ><input class="button3"type="button" class="" value="退出"></a></div></th>
         </tr>
     </table>
   	</div>
   	<div class="text0">
   </div>
     <div class="text2">
 	<form action="manPerIn" method="post" class="elegant-aero">
		<h1 class="h1">用户个人信息
			<span class="h1>span"></span>
		</h1>
        
		<label class="label">
			<span class="label>span">账号：</span>
			<input class="input[type=text]" id="username" type="text" name="username" placeholder="" />
		</label>

		<label class="label">
			<span class="label>span">密码：</span>
			<input class="input[type=email]" id="password" type="text" name="password" placeholder="" />
		</label>
		
		<label class="label">
			<span class="label>span">邮箱：</span>
			<input class="input[type=email]" id="email" type="text" name="email" placeholder="" />
		</label>
			
		<label class="label">
			<span class="label>span">电话：</span>
			<input class="input[type=email]" id="phone" type="text" name="phone" placeholder="" />
		</label>
       
       
        <label class="label">
			<span class="label>span">性别</span>
			<select class="select" name="sex">
			  <option value="Job Inquiry">男</option>
			  <option value="General Question">女</option>
			</select>
		</label>
		 <label class="label">
			<span class="label>span">封号期限</span>
			<select class="select" name="term">
			  <option value="Job Inquiry">永久</option>
			  <option value="General Question">1天</option>
			    <option value="General Question">1天</option>  
			    <option value="General Question">3天</option>  
			    <option value="General Question">7天</option>
			    <option value="General Question">15天</option>
			     <option value="General Question">30天</option>
			     <option value="General Question">一年</option>
			</select>
		</label>
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="button" class="button" value="发送密码到邮箱" />
			<input class="button" type="submit" class="button" value="封号" />
		    <input class="button" type="submit" class="button" value="解封" />
		</label>
	</form>
  </div>

 </body>
</html>
