<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.report_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
report_Info report_Info=(report_Info)request.getAttribute("report_info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 举报界面 -->
<html>
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
<link href="http://112.74.160.130:8080/seed/report.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body bgcolor="#DDDDDD">
    <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/homepageTwo"       type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/personal"       type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="我的简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/Seekinfo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="个人信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/report.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"          type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
   
   <div class="text0">
   </div>
         
   <div class="text1">
              <form action="reportTwo" method="post">
               <div class="text2">
                    <input type="hidden" name="Cno" value=" <%out.print(request.getAttribute("Cno")); %>"/>
                    <input type="hidden" name="Jno" value=" <%out.print(request.getAttribute("Jno")); %>"/>
                    <div class="txt1"><input type="checkbox"  name="Reason" value="1"><font>该招聘信息与现实不符</font></div>
                    <div class="txt1"><input type="checkbox"  name="Reason" value="2">该公司是非法公司</div>
               </div>
               
        
               <div class="text3">
                   <div class="txt2"><font size=4 color=red>  如发现您有恶意举报，并造成不良影响您将受到封号处罚</font></div>
                   <div class="">
                      <input type="submit"   class="btn_style" id="btn_register" value="提交">
                   </div>
              </div>
           </form>
    </div>
</body>
</html>