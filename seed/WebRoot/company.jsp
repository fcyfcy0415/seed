<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.job_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
job_Info job_Info = (job_Info)request.getAttribute("job_Info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 招聘信息详情页面 -->
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
<link href="http://112.74.160.130:8080/seed/company.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>


<body bgcolor="#DDDDDD">
    <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/homepageTwo"type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/personal"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="我的简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/Seekinfo"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="个人信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/homepage.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"   type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
   
   <div class="text0">
   </div>

  <form action="companyTwo" method="post">
   <div class="text1">
  
               <div class="text2">
                    <div class="txt1"> <font size=10 color=#5599FF><% out.print(job_Info.getJname()); %></font>     </div><!-- 职位名称 -->
                    <div class="money"><font size=5 color=#FF0000> <% out.print(job_Info.getJSalary()); %></font>   </div><!--工资-->
                    <div class="txt1"> <font size=5>               <% out.print(job_Info.getJCondition()); %></font></div><!-- 条件 -->
               </div>
               
               <!--职位要求 begin-->
                <div class="text2">
                   <div class="text-overflow">
                                                              工作经验：<span><%out.print(job_Info.getJWorkExp()); %></span>
                   </div>
                   <div class="text-overflow">
                                                              学历要求：<span><%out.print(job_Info.getJEduRequire()); %></span>
                   </div>
                   <div class="text-overflow">
                                                            年龄要求： <span><%out.print(job_Info.getJAgeRequire()); %></span>
                   </div>
                   <div class="text-overflow">
                                                            语言要求：<span><%out.print(job_Info.getJLanRequire()); %></span>
                   </div>
                </div>
                <!-- 职位描述 begin -->
            
            <div class="text3">
                  <div class="title-line">
                      <i class="min_chunk"></i>
                      <b class="color_212121"><font size=5>职位描述</font></b>
                  </div>
                  <div>
                    <div class="txt1"><font size=5>职位类别</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJJobType()); %></font></div>
                    <div class="txt1"><font size=5>工资架构</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJSalaryStru()); %></font></div>
                    <div class="txt1"><font size=5>岗位职责</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJPositionState()); %></font></div>
                    <div class="txt1"><font size=5>岗位要求</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJJobRequire()); %></font></div>
                  </div>
            </div>
            <!-- 职位描述 end -->
             <!-- 职位描述 begin -->
            <div class="text3">
                  <div class="title-line">
                      <i class="min_chunk"></i>
                      <b class="color_212121"><font size=5>公司简介</font></b>
                  </div>
                  <div>
                    <div class="txt1"><font size=5>公司规模</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJASSET()); %></font></div>
                    <div class="txt1"><font size=5>公司实力</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;<%out.print(job_Info.getJComStrength()); %></font></div>
                    <div class="txt1"><font size=4 color=red>  求职者谨防不法分子冒充用人单位进行诈骗，切勿相信来历不明的电话或者短信邀请，以免上当受骗！</font></div>
                  </div>
            </div>
            <!-- 职位描述 end -->
                 <div class="text2">
                   <div class="txt1"><font> 联系方式</font></div>
                   <div class="txt1">
                                                          联系人：<font><%out.print(job_Info.getLinkman()); %></font>
                   </div>
                    <div class="txt1">
                                                                       联系电话：        <font><%out.print(job_Info.getLinkTel()); %></font>
                                                                       电子邮件：         <font><%out.print(job_Info.getLinkEmail()); %></font>
                                                                       招聘截止日期：<font><%out.print(job_Info.getAddTime()); %></font>
                    </div>
                  </div>
            
               <div class="text4">
                <div>
                  <input type="submit"class="btn_style" id="btn_login"  onclick="login()" value="我要应聘">
                  <input type="hidden" name="Cno" value="<%out.print(job_Info.getCno());%>"/>
	              <input type="hidden" name="Jno" value="<%out.print(job_Info.getJno());%>"/>
                </div>
               </div>
           </div>
       </form>
     <!--   <form action="report">
        <div class="text4">
          <div>
              <input type="submit" class="btn_style" id="btn_login" onclick="login()" value="举报">
              <input type="hiddens" name="Cno" value="<%out.print(job_Info.getCno());%>"/>
	          <input type="hiddens" name="Jno" value="<%out.print(job_Info.getJno());%>"/>
          </div>
        </div>
       </form>  -->
  </body>
</html>