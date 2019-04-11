<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info JobBean = (seeker_Info)request.getAttribute("JobBean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 游客参观招聘信息详情页面 -->
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
<link href="http://112.74.160.130:8080/seed/company.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>


<body bgcolor="#DDDDDD">
    <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/visitor.jsp"    type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/company.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"       type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
   
   <div class="text0">
   </div>
    <form action="visitorcompany" method="post" ></form>    
   <div class="text1">
  
               <div class="text2">
                    <div class="txt1"><font size=10 color=#5599FF>项目经理</font></div>
                    <div class="money"><font size=5 color=#FF0000>10000-20000元/月</font></div>
                    <div class="txt1"><font size=5>珠海-横琴新区|全职|2人</font></div>
               </div>
               
               <!--职位要求 begin-->
                <div class="text2">
                   <div class="text-overflow">
                                                    工作经验：<span>3</span>
                   </div>
                   <div class="text-overflow">
                                                     学历要求：<span>大专</span>
                   </div>
                   <div class="text-overflow">
                                                      年龄要求：<span> 不限</span>
                   </div>
                   <div class="text-overflow">
                                                     语言要求：<span>不限</span>
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
                     <div class="txt2"><font size=4>&nbsp;&nbsp;高级猎头顾问 人力资源总监</font></div>
                    <div class="txt1"><font size=5>工资架构</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;10K-25K/月+提成+团队奖金</font></div>
                    <div class="txt1"><font size=5>岗位职责</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;根据公司业绩指标，进行目标分解与与实时跟踪；统筹、督促公司所有项目的高效运行，完善项目统筹管理机制，对项目结果负责；
                                                     实时掌握所有项目的进度，根据项目中不同困难能够协助项目顾问及时进行调整找到解决方法；协助项目顾问进行项目难点的分析与
                                                     解决，不断培养、提升项目顾问的个人能力；定期培训工作的组织与开展。</font></div>
                    <div class="txt1"><font size=5>岗位要求</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;大专以上学历，5年以上猎头服务、电话销售、项目管理经验，2年以上团队管理经验。</font></div>
                  
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
                     <div class="txt2"><font size=4>&nbsp;&nbsp;本公司总部在北京，在全国各地有15个分部员工超过1500人</font></div>
                    <div class="txt1"><font size=5>公司实力</font></div>
                     <div class="txt2"><font size=4>&nbsp;&nbsp;本公司在本业界是数一数二的公司。从2003年成立一步步走到了今天，本公司有着自己的企业文化，公司整个氛围积极向上，员工福利在业界也是顶尖。</font></div>
                    <div class="txt1"><font size=4 color=red>  求职者谨防不法分子冒充用人单位进行诈骗，切勿相信来历不明的电话或者短信邀请，以免上当受骗！</font></div>
                  </div>
            </div>
            <!-- 职位描述 end -->
                 <div class="text2">
                   <div class="txt1"><font> 联系方式</font></div>
                   <div class="txt1">
                                                          联系人：<font> 赵春迎</font>
                   </div>
                    <div class="txt1">
                            
                                                          联系电话：<font><img src="" /></font>
                            
                                                           电子邮件：<font><img src="" /></font>
                     </div>
                  </div>
            
               <div class="text4">
                <div>
                  <a href="http://112.74.160.130:8080/seed/register.jsp"><input type="button"  class="btn_style" id="btn_login"    onclick="login()" value="举报"></a>
                  <a href="http://112.74.160.130:8080/seed/register.jsp"><input type="button"   class="btn_style" id="btn_login"    onclick="login()" value="我要应聘"></a>
   
                </div>
             </div>
    </div>






 </body>
</html>