<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.resum" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
resum resum = (resum)request.getAttribute("resume");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 个人简历界面 -->
<html>
<head>
<base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="text/html; charset=utf-8">
	<meta http-equiv="cache-control" content="text/html; charset=utf-8">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	<link href="http://112.74.160.130:8080/seed/personal.css" rel="stylesheet" type="text/css" />
	-->
<link href="http://112.74.160.130:8080/seed/com.css" rel="stylesheet" type="text/css" />

</head>
<body onload="onload()">
  <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/homepageTwo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/personal"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="我的简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/SeekInfo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="个人信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/homepage.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"   type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
   <div class="text0">
   </div>
 
  <div class="text2">   
   <form action="personalTwo" method="post" class="elegant-aero">
	<h1 class="h1">个人简历
		<span class="h1>span">基本资料</span>
	</h1>
        
		<label class="label">          
			<span class="label>span">姓名：</span>
			<input class="input[type=text]"  id="name" type="text" name="name" 
			placeholder="" value="<% out.print(resum.getRName()); %>"/>
		</label>
		
		<label class="label">          
			<span class="label>span">民族：</span>
			<input class="input[type=text]"  id="RName" type="text" name="nation" 
			placeholder="" value="<% out.print(resum.getRNationality()); %>"/>
		</label>
		
		<label class="label">
			<span class="label>span">性别</span>
			<select class="select" name="sex" >
			<% if(resum.getRSex().equals("1")) {%>
			  <option value="1">男</option>
			  <%}else{ %>
			  <option value="0">女</option>
			  <%} %>
			  <option value="1">男</option>
			  <option value="0">女</option>
			</select>
		</label>
		
		<label class="label">          
			<span class="label>span">籍贯：</span>
			<input class="input[type=text]"  id="RName" type="text" name="place" 
			placeholder="" value="<% out.print(resum.getRCountry()); %>"/>
		</label>
		
        <label class="label">          
			<span class="label>span">生日：</span>
			<input class="input[type=text]"  id="RName" type="text" name="birthday"
			placeholder="" value="<% out.print(resum.getRBirth()); %>"/>
		</label>
		
        <label class="label">          
			<span class="label>span">政治面貌：</span>
			<input class="input[type=text]"  id="RName" type="text" name="political"
			placeholder="" value="<% out.print(resum.getRPolitics()); %>"/>
		</label>
		
		<label class="label">
			<span class="label>span">健康状况</span>
			<input class="input[type=text]" id="language" type="text" name="health" 
			placeholder="" value="<% out.print(resum.getRhealth()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">婚姻状况</span>
			<input class="input[type=text]" id="language" type="text" name="marriage" 
			placeholder="" value="<% out.print(resum.getIsMarried()); %>"/>
   		</label>
   		
   	<h2 class="h2">
		<span class="h1>span">接受教育</span>
	</h2>
		
		<label class="label">
			<span class="label>span">学历</span>
			<input class="input[type=text]" id="language" type="text" name="education" 
			placeholder=""  value="<% out.print(resum.getRDegree()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">毕业学校</span>
			<input class="input[type=text]" id="language" type="text" name="school" 
			placeholder="" value="<% out.print(resum.getRGraduSchool()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">专业</span>
			<input class="input[type=text]" id="language" type="text" name="specialties" 
			placeholder="" value="<% out.print(resum.getRMajor()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">个人技能：</span>
			<textarea class="textarea" id="com_size"  name="skill" 
			placeholder="<% out.print(resum.getRPersonSkill()); %>" ><% out.print(resum.getRPersonSkill()); %></textarea>
		</label>
   		
   	<h3 class="h2">
		<span class="h1>span">教育培训经历</span>
	</h3>
        
        <label class="label">
			<span class="label>span">受教机构</span>
			<input class="input[type=text]" id="language" type="text" name="a_school" 
			placeholder="" value="<% out.print(resum.getSchool()); %>"/>
   		</label>

        <label class="label">
			<span class="label>span">受教日期</span>
			<input class="input[type=text]" id="language" type="text" name="a_year" 
			placeholder="" value="<% out.print(resum.getYM()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">受教内容</span>
			<input class="input[type=text]" id="language" type="text" name="a_specialties" 
			placeholder="" value="<% out.print(resum.getMajor()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">受教机构</span>
			<input class="input[type=text]" id="language" type="text" name="b_school" 
			placeholder="" value="<% out.print(resum.getB_School()); %>"/>
   		</label>

        <label class="label">
			<span class="label>span">受教日期</span>
			<input class="input[type=text]" id="language" type="text" name="b_year" 
			placeholder="" value="<% out.print(resum.getB_ym()); %>"/>
   		</label>
   		
   		<label class="label">
			<span class="label>span">受教内容</span>
			<input class="input[type=text]" id="language" type="text" name="b_specialties" 
			placeholder="" value="<% out.print(resum.getB_Major()); %>"/>
   		</label>
   		
                   
                    
   		<label class="label">
			<span class="label>span">受教机构</span>
			<input class="input[type=text]" id="language" type="text" name="c_school" 
			placeholder=""  value="<% out.print(resum.getC_School()); %>"/>
   		</label>

        <label class="label">
			<span class="label>span">受教日期</span>
			<input class="input[type=text]" id="language" type="text" name="c_year" 
			placeholder="" value="<% out.print(resum.getC_ym()); %>"  />
   		</label>
   		
   		<label class="label">
			<span class="label>span">受教内容</span>
			<input class="input[type=text]" id="language" type="text" name="c_specialties" 
			placeholder="" value="<% out.print(resum.getC_Major()); %>"/>
   		</label>
   		
   		
   	<h4 class="h5">
		<span class="h1>span">专业资料：</span>
	</h4>
		
		<label class="label">
			<span class="label>span">个人技能：</span>
			<textarea class="textarea" id="com_size"  name="skill" 
			placeholder="<% out.print(resum.getRPersonSkill()); %>" ><% out.print(resum.getRPersonSkill()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">主修课程：</span>
			<textarea class="textarea" id="com_size"  name="class" 
			placeholder="<% out.print(resum.getRMajorCourse()); %>"><% out.print(resum.getRMajorCourse()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">计算机能力：</span>
			<textarea class="textarea" id="com_size"  name="computer"
			placeholder="<% out.print(resum.getRComputerSkill()); %>" ><% out.print(resum.getRComputerSkill()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">语言能力：</span>
			<textarea class="textarea" id="com_size"  name="language" 
			placeholder="<% out.print(resum.getRLanSkill()); %>"><% out.print(resum.getRLanSkill()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">社会实践：</span>
			<textarea class="textarea" id="com_size"  name="sociology" 
			placeholder="<% out.print(resum.getRSocialPractice()); %>"><% out.print(resum.getRSocialPractice()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">获奖情况：</span>
			<textarea class="textarea" id="com_size"  name="award" 
			placeholder="<% out.print(resum.getRHonor()); %>"><% out.print(resum.getRHonor()); %></textarea>
		</label>
		
		<label class="label">
			<span class="label>span">自我评价：</span>
			<textarea class="textarea" id="com_size"  name="oneself" 
			placeholder="<% out.print(resum.getRSelfContro()); %>"><% out.print(resum.getRSelfContro()); %></textarea>
		</label>
		
	<h5 class="h4">
		<span class="h1>span">联系方式</span>
	</h5>
		
		 <label class="label">
			<span class="label>span">联系电话：</span>
			<input class="input[type=text]" id="contact_phone" type="text" name="phone" 
			placeholder="输入联系人电话" value="<% out.print(resum.getRTel()); %>"/>
		</label>
		
		 <label class="label">
			<span class="label>span">邮箱：</span>
			<input class="input[type=text]" id="contact_phone" type="text" name="email" 
			placeholder="" value="<% out.print(resum.getR_E_Mail()); %>"/>
		</label>

		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="submit" class="button" value="保存" />
			<input type="hidden" name="Reno" value="<% out.print(resum.getReno()); %>">
		</label>
		
		
	</form>
  </div>

</body>
</html>