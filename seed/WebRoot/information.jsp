<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info seeker_Info = (seeker_Info)request.getAttribute("seeker_Info");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 用户个人信息界面 -->
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
<link href="http://112.74.160.130:8080/seed/infromation.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

 	<div class="text1">
 	 <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/homepageTwo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/personal"       type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="我的简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/SeekInfo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="个人信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/information.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"       type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
   	</div>
   	<div class="text0">
   </div>
     <div class="text2">
 	<form action="information" method="post" class="elegant-aero">
		<h1 class="h1">个人信息
			<span class="h1>span">请认真填写个人信息</span>
		</h1>
        
		<label class="label">
			<span class="label>span">姓名：</span>
			<input class="input[type=text]"  id="name"  type="text" name="name" placeholder="输入您的姓名" value="<% out.print(seeker_Info.getSname()); %>"/>
		</label>

		<label class="label">
			<span class="label>span">联系电话：</span>
			<input class="input[type=email]" id="phone" type="text" name="phone" placeholder="输入您的联系电话" value="<% out.print(seeker_Info.getStel()); %>"/>
		</label>
		
		<label class="label">
		
			<span class="label>span">邮箱：</span>
			<input class="input[type=email]" id="email" type="text" name="email" placeholder="请输入您的邮箱"  value="<% out.print(seeker_Info.getEmail()); %>"/>
		</label>
		
		<label class="label">
			<span class="label>span">密码：</span>
			<input class="input[type=email]" id="passwork" type="text" name="passwork" placeholder="请输入您的原密码 " value="<% out.print(seeker_Info.getpasswork()); %>"/>
		</label>
		
		<label class="label">
			<span class="label>span">修改密码：</span>
			<input class="input[type=email]" id="modify_passwork" type="text" name="modify_passwork" placeholder="请输入您的修改密码 "/>
		</label>
		
		<label class="label">
			<span class="label>span">确认修改密码：</span>
			<input class="input[type=email]" id="confirm_modify_passwork" type="text" name="confirm_modify_passwork" placeholder="请再次输入您的修改密码 "/>
		</label>
       
       
       
        <label class="label">
			<span class="label>span">性别</span>
			<select class="select" name="sex" >
			<% if(seeker_Info.getSex().equals("1")) {%>
			  <option value="1">男</option>
			  <%}else{ %>
			  <option value="0">女</option>
			  <%} %>
			  <option value="1">男</option>
			  <option value="0">女</option>
			</select>
		</label>
		
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="submit" class="button" value="提交信息" />
		</label>
	</form>
  </div>

 </body>
</html>
