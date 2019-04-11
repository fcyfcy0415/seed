<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String Jno[] = (String[])request.getAttribute("Jno");
String Sno[] = (String[])request.getAttribute("Sno");
String shoucang[] = (String[])request.getAttribute("shoucang");
int Jno_point = (int)request.getAttribute("Jno_point");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 企业查看收件箱界面 -->
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
    
 	
	 
	 
	  <form action="ComPerOne" method="post" class="elegant-aero">
		<h1 class="h1">收到的简历
			<span class="h1>span" >查看已收到的简历</span>
		</h1>
        <label class="label">
           
			<span class="label>span">职位名称</span>
			<select class="select" name="Sno">
			 <% for(int i=0;i<Jno_point;i++){ %>
             <option value="<%out.print(Sno[i]); %>%<%out.print(Jno[i]); %>"><%out.print(Jno[i]); %></option>
             <%} %>			
			</select>
			
			
		</label>
		<label class="label">
			<span class="label>span">&nbsp;</span>
			<input class="button" type="submit" class="button" value="查询" />
		</label>
	 </form>
             
      
  </div>

 </body>
</html>