<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.employer_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
employer_Info employer_Info = (employer_Info)request.getAttribute("employer_Info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 企业基本信息界面 -->
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
<link href="http://112.74.160.130:8080/seed/comInf.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
 	<div class="text1">
 	 <table cellspacing=10px>
       <tr>
         <th align="right"> <div><a href="http://112.74.160.130:8080/seed/com.jsp"    type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="招聘信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/comInf"     type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="基本信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/resume" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="收到简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"  type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="退出">   </a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/com.jsp" type="button" id="btn_register" onclick="" ><input class="button3"type="button" class="" value="关于我们"></a></div></th>
       </tr>
    </table>
  </div>
  
   
   	<div class="text0"></div>
  
 
  <div class="text2">  
    <form action="comInfTwo" method="post" class="elegant-aero">
		<h1 class="h1">企业基本信息
			<span class="h1>span">请认真填写企业基本信息</span>
		</h1>
        <label class="label">
			<span class="label>span">公司名称：</span>
			<input class="input[type=email]" id="Cname" type="text" name="Cname" 
			 placeholder="输入公司名称" value="<% out.print(employer_Info.getCname()); %>"/>
		</label>
		<label class="label">
			<span class="label>span">公司地址：</span>
			<input class="input[type=text]" id="com_address" type="text" name="com_address" 
			placeholder="填写公司地址" value="<% out.print(employer_Info.getCadress()); %>"/>
		</label>

		<label class="label">
			<span class="label>span">营业执照号码：</span>
			<input class="input[type=email]" id="com_license" type="text" name="com_license" 
			placeholder="填写营业执照号码" value="<% out.print(employer_Info.getLicno()); %>"/>
		</label>
		
		<label class="label">
			<span class="label>span">法人代表：</span>
			<input class="input[type=email]" id="rep_name" type="text" name="rep_name" 
			placeholder="法人代表姓名" value="<% out.print(employer_Info.getEname()); %>"/>
		</label>
		<label class="label">
			<span class="label>span">公司电话：</span>
			<input class="input[type=email]" id="com_phone" type="text" name="com_phone" 
			placeholder="输入公司电话" value="<% out.print(employer_Info.getCTel()); %>"/>
		</label>
		 
	   <label class="label">
			<span class="label>span">邮箱：</span>
			<input class="input[type=email]" id="com_email" type="text" name="com_email" 
			placeholder="输入邮箱" value="<% out.print(employer_Info.getE_E_Mail()); %>"/>
		</label>
		  <label class="label">
			<span class="label>span">密码：</span>
			<input class="input[type=email]" id="password" type="text" name="password" 
			placeholder="输入原密码" value="<% out.print(employer_Info.getPasswork()); %>"/>
		</label>
		 <label class="label">
			<span class="label>span">修改密码：</span>
			<input class="input[type=email]" id="com_confirm_password" type="text" name="com_confirm_password" placeholder="输入修改密码" />
		</label>
		 <label class="label">
			<span class="label>span">再次输入修改密码：</span>
			<input class="input[type=email]" id="confirm_modify_passwork" type="text" name="confirm_modify_passwork" placeholder="再次输入修改密码" />
		</label>
		
		<label class="label">
			<span class="label>span">&nbsp;</span>
			
			<input class="button" type="submit" class="button" value="提交信息" />
		</label>
	</form>
  </div>

 </body>
</html>
