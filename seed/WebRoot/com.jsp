<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.job_Info" %>
<%@ page import="reserve.employer_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
job_Info job_Info = (job_Info)request.getAttribute("job_Info");
employer_Info employer_Info=(employer_Info)request.getAttribute("employer_Info");
//String job[] = (String[])request.getAttribute("job");
//int job_point = (int)request.getAttribute("job_point");
%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 企业发布招聘信息界面 -->
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
<link href="http://112.74.160.130:8080/seed/com.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
 	<div class="text1">
 	 <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/com.jsp"    type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="招聘信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/comInf"     type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="基本信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/resume" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="收到简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"  type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="退出">   </a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/com.jsp" type="button" id="btn_register" onclick="" ><input class="button3"type="button" class="" value="关于我们"></a></div></th>
       </tr>
   </table>
   	</div>
   	<div class="text0">
   </div>
   
  
  <div class="text2">  
    
      <form action="Comtwo" method="get" class="elegant-aero">
		<h1 class="h1">已发布招聘信息
			<span class="h1>span" >查看已发布招聘信息</span>
		</h1>
	
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="submit" class="button" value="搜索" />
		</label>
     </form>

 	<form action="com" method="get" class="elegant-aero">
		<h1 class="h1">招聘信息
			<span class="h1>span">请认真填写招聘信息</span>
		</h1>
        
		<label class="label">
			<span class="label>span">职位名称：</span>
			<input class="input[type=text]"  id="position_name" type="text" name="position_name" 
			placeholder="输入您的职位名称" value=""/>
		</label>

		<label class="label">
			<span class="label>span">工资：</span>
			<input class="input[type=email]" id="momey"         type="text" name="momey"         
			placeholder="输入您提供的薪酬" value=""/>
		</label>
		
		<label class="label">
			<span class="label>span">条件：</span>
			<input class="input[type=email]" id="condition"     type="text" name="condition"     
			placeholder="工作地点|实习(全职)|人数" value=""/>
		</label>
       
        <h2 class="h2">
			<span class="h1>span">职位要求</span>
		</h2>
		
        <label class="label">
			<span class="label>span">工作经验</span>
			<select class="select" name="time">
			  <option value="无要求">无要求</option>
			  <option value="1-2年">1-2年</option>
			  <option value="2-4年">2-4年</option>
			  <option value="4-6年">4-6年</option>
			  <option value="6年以上">6年以上</option>
			</select>
		</label>
		   
		<label class="label">
			<span class="label>span">学历要求</span>
			<select class="select" name="educational">
			  <option value="无要求">无要求</option>
			  <option value="高中以上">高中以上</option>
			  <option value="专科以上">专科以上</option>
			  <option value="三本本科以上">三本本科以上</option>
			  <option value="二本本科以上">二本本科以上</option>
			  <option value="一本本科以上">一本本科以上</option>
			  <option value="研究生以上">研究生以上</option>
			  <option value="博士生以上">博士生以上</option>
			  <option value="博士生后以上">博士生后以上</option>
			</select>
   		</label>
		<label class="label">
			<span class="label>span">年龄要求：</span>
			<input class="input[type=text]" id="age"      type="text" name="age" placeholder="输入招聘职位对年龄的要求" />
   		</label>
   		<label class="label">
			<span class="label>span">语言要求</span>
			<input class="input[type=text]" id="language" type="text" name="language" placeholder="输入招聘职位对语言的要求" />
   		</label>
   		
   		<h3 class="h2">
			<span class="h1>span">职位描述</span>
		</h3>
		<label class="label">
			<span class="label>span">职位类别：</span>
			<input class="input[type=text]" id="position" type="text" name="position" placeholder="输入您的职位类别" />
		</label>
		
		<label class="label">
			<span class="label>span">工资架构：</span>
			<input class="input[type=text]" id="wages"    type="text" name="wages" placeholder="输入您的工资结构" />
		</label>
		<label class="label">
			<span class="label>span">岗位职责：</span>
			<textarea class="textarea" id="duties"                    name="duties" placeholder="输入岗位职责"></textarea>
		</label>
		<label class="label">
			<span class="label>span">岗位要求：</span>
			<textarea class="textarea" id="requirements"              name="requirements" placeholder="输入岗位要求"></textarea>
		</label>
		<h4 class="h4">
			<span class="h1>span">公司简介</span>
		</h4>
		
		<label class="label">
			<span class="label>span">公司规模：</span>
			<textarea class="textarea" id="com_size"                  name="com_size" placeholder="输入公司规模"></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">公司实力：</span>
			<textarea class="textarea" id="company_strength"          name="com_strength" placeholder="输入公司实力"></textarea>
		</label>
		<h5 class="h5">
			<span class="h1>span">联系方式</span>
		</h5>
		
		<label class="label">
			<span class="label>span">联系人：</span>
			<input class="input[type=text]" id="contact_name"  type="text" name="contact_name" placeholder="输入联系人姓名" />
		</label>
        <label class="label">
			<span class="label>span">联系电话：</span>
			<input class="input[type=text]" id="contact_phone" type="text" name="contact_phone" placeholder="输入联系人电话" />
		</label>
		<label class="label">
			<span class="label>span">联系邮箱：</span>
			<input class="input[type=text]" id="contact_email" type="text" name="contact_email"   placeholder="输入公司邮箱" />
		</label>
		
		<label class="label">
			<span class="label>span">招聘期限：</span>
			<input class="input[type=text]" id="date"          type="text" name="date"          placeholder="填写招聘开始日期和截止日期" />
		</label>
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="submit" class="button" value="发布信息" />
		</label>
	</form>
  </div>

 </body>
</html>
