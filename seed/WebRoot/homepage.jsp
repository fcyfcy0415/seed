<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.job_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String Jname[] = (String[])request.getAttribute("Jname");
String Jno[] = (String[])request.getAttribute("Jno");
String Cno[] = (String[])request.getAttribute("Cno");
int Cno_point = (int)request.getAttribute("Cno_point");
String JSalary[] = (String[])request.getAttribute("JSalary");
String JCondition[] = (String[])request.getAttribute("JCondition");
job_Info job_Info = (job_Info)request.getAttribute("job_Info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 主页面 -->

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
<link href="http://112.74.160.130:8080/seed/homepage.css" rel="stylesheet" type="text/css" />
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>Insert title here</title>
</head>
<body bgcolor="#DDDDDD">
     <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/homepageTwo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/personal"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="我的简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/SeekInfo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="个人信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/homepage.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"   type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
      
       <form action="homepage" method="post">
         <div class="text1" align="center">
         <div class="text2">
                <input title="公司/职位"  placeholder="职位名称" class="btn_style" id="btn_register"  type="text"          name="Cname" value="">
                <input title="工作地点" placeholder="工作地点|实习(全职)（兼职）" class="btn_style" id="btn_register"  type="text" name="Adress" value="">
                <input class="text3" id="" type="submit" value="">
         </div>
         </div>
       </form> 
  
  <div class="gap" align="left">
	<h2 class="titBar">
		<font color="	#CC0000"></font>
	</h2>
	<ul class="job-card" >
	
	
   <% for(int i=0;i<Cno_point;i++){ %>

    <form action="company" method="post">
	  <li class="col-4">
	 	<div class="inner"> 
	 	      <input type="submit" class="col-6" value="查看详情">
	          <input type="hidden" name="Cno" value="<%out.print(Cno[i]); %>"/>
	          <input type="hidden" name="Jno" value="<%out.print(Jno[i]);%>"/>
	          <span class="txt"><%out.print(Jname[i]); %></span>
	       
	       <span class="money"><%out.print(JSalary[i]); %></span>
	       <div class="col-12" title="大专 | 3年经验 | 广东珠海">
		   	<%out.print(JCondition[i]); %>
	       </div>
	    </div>  
	</li>
	</form>
   <%} %>            
	   </ul>
	</div>         
  </body>
</html>