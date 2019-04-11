<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.seeker_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
seeker_Info JobBean = (seeker_Info)request.getAttribute("JobBean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 游客页面 -->

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
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/visitor.jsp"    type="button"  id="" onclick="" >                                         <input class="button3" type="button" class="" value="首页"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/homepage.jsp" type="button"  id="" onclick="" > <input class="button3" type="button" class="" value="关于我们"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"       type="button"  id="" onclick="" >                                        <input class="button3" type="button" class="" value="退出"></a></div></th>
       </tr>
     </table>
       <form action="visitor" method="post">
         <div class="text1" align="center">
         <div class="text2">
                <input title="公司/职位"class="btn_style" id="btn_register"  type="text">
                <input title="工作地点" class="btn_style" id="btn_register"  type="text">
                <a href="http://112.74.160.130:8080/seed/login.jsp""><input class="text3" id="" type="button" ></a>
         </div>
         </div>
       </form>     
       
     
     
     
 <div class="gap" align="left">
	<h2 class="titBar">
		<font color="	#CC0000">珠海急聘职位</font>
	</h2>
	<ul class="job-card" >
	
	
	
	        
	  <li class="col-4">
	 	<div class="inner"> 
	       <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="自动化工程师">
	          <span class="txt">自动化工程师 </span>
	       </a>
	       <span class="money">6000-12000元/月</span>
	       
	       <div class="col-12" title="大专 | 3年经验 | 广东珠海">
		   	大专 | 3年经验 | 广东珠海
	       </div>
	      
	       <div class="tag-box">
		   	<span class="tao-tag">免费班车</span>
		   	<span class="tao-tag">话费补助</span>
		   	<span class="tao-tag">餐补       </span>
		   	<span class="tao-tag">包住       </span>
		   	<span class="tao-tag">养老保险</span>
		   
	       </div>
	    </div>  
	</li>
	  
	<li class="col-4" > 
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="硅橡胶配料师傅" >
	          <span class="txt">硅橡胶配料师傅 </span>
	       </a>
	       <span class="money">6000-10000元/月</span>
	       
	       <div class="col-12" title="初中及以下 | 5年经验 | 广东珠海香洲区">
		   	初中及以下 | 5年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">加班补助</span>
		   	<span class="tao-tag">工伤保险</span>
		   	<span class="tao-tag">失业保险</span>
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/visitorcompany.jsp" title="项目经理" >
	          <span class="txt">项目经理 </span>
	       </a>
	       <span class="money">10000-20000元/月</span>
	       
	       <div class="col-12" title="大专 | 3年经验 | 广东珠海">
		   	大专 | 3年经验 | 广东珠海
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">餐补</span>
		   	<span class="tao-tag">带薪年假</span>
		   	<span class="tao-tag">高提成</span>
		   	<span class="tao-tag">全勤奖</span>
		   	<span class="tao-tag">绩效奖</span>
		   
	       </div>
	    </div>  
	  </li>           
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="资深IE工程师/IE主管" >
	          <span class="txt">资深IE工程师/IE主管 </span>
	       </a>
	       <span class="money">5000-10000元/月</span>
	       
	       <div class="col-12" title="大专 | 3年经验 | 广东珠海金湾区">
		   	大专 | 3年经验 | 广东珠海金湾区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">话费补助</span>
		   	<span class="tao-tag">免费班车</span>
		   	<span class="tao-tag">带薪年假</span>
		   	
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="pmc主管" >
	          <span class="txt">pmc主管 </span>
	       </a>
	       <span class="money">3500-7000元/月</span>
	       
	       <div class="col-12" title="大专 | 1年经验 | 广东珠海香洲区">
		   	大专 | 1年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">交通补助</span>
		   	<span class="tao-tag">加班补助</span>
		   	<span class="tao-tag">餐补</span>
		   	<span class="tao-tag">养老保险</span>
		   	
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="外贸业务员" >
	          <span class="txt">外贸业务员 </span>
	       </a>
	       <span class="money">4000-8000元/月</span>
	       
	       <div class="col-12" title="大专 | 1年经验 | 广东珠海斗门区">
		   	大专 | 1年经验 | 广东珠海斗门区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">8小时工作制</span>
		   	<span class="tao-tag">高提成</span>
		   	<span class="tao-tag">全勤奖</span>
		   
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="项目经理" >
	          <span class="txt">项目经理 </span>
	       </a>
	       <span class="money">10000-20000元/月</span>
	       
	       <div class="col-12" title="大专 | 3年经验 | 广东珠海">
		   	大专 | 3年经验 | 广东珠海
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">餐补</span>
		   	<span class="tao-tag">带薪年假</span>
		   	<span class="tao-tag">高提成</span>
		   	<span class="tao-tag">全勤奖</span>
		   	<span class="tao-tag">绩效奖</span>
		   
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="产品外观设计师" >
	          <span class="txt">产品外观设计师 </span>
	       </a>
	       <span class="money">8000-15000元/月</span>
	       
	       <div class="col-12" title="大专 | 1年经验 | 广东珠海金湾区">
		   	大专 | 1年经验 | 广东珠海金湾区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">免费班车</span>
		   	<span class="tao-tag">五险一金</span>
		   	<span class="tao-tag">年终奖</span>
		   
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="五金模具设计工程师" >
	          <span class="txt">五金模具设计工程师 </span>
	       </a>
	       <span class="money">5000-10000元/月</span>
	       
	       <div class="col-12" title="大专 | 2年经验 | 广东珠海香洲区">
		   	大专 | 2年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">餐补</span>
		   	<span class="tao-tag">五险一金</span>
		   	<span class="tao-tag">带薪年假</span>
		   	<span class="tao-tag">年终奖</span>
		  
		 
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="技术员" >
	          <span class="txt">技术员 </span>
	       </a>
	       <span class="money">4000-6000元/月</span>
	       
	       <div class="col-12" title="本科 | 1年经验 | 广东珠海香洲区">
		   	本科 | 1年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">节日福利</span>
		   	<span class="tao-tag">生日礼物</span>
		   	<span class="tao-tag">工作环境优美</span>
		   	<span class="tao-tag">交通便利</span>
		   	
		   	 </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="急招单车维修员OFO" >
	          <span class="txt">急招单车维修员OFO </span>
	       </a>
	       <span class="money">3000-5000元/月</span>
	       
	       <div class="col-12" title="不限 | 不限 | 广东珠海香洲区">
		   	不限 | 不限 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">绩效奖</span>
		   	<span class="tao-tag">8小时工作制</span>
		   	<span class="tao-tag">工伤保险</span>
		   	
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="生产总监" >
	          <span class="txt">生产总监 </span>
	       </a>
	       <span class="money">7000-10000元/月</span>
	       
	       <div class="col-12" title="大专 | 5年经验 | 广东珠海香洲区">
		   	大专 | 5年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">绩效奖</span>
		   	<span class="tao-tag">免费培训</span>
		   	<span class="tao-tag">生日礼物</span>
		   	<span class="tao-tag">团队活动丰富</span>
		  
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="技术领班" >
	          <span class="txt">技术领班 </span>
	       </a>
	       <span class="money">6000-7000元/月</span>
	       
	       <div class="col-12" title="高中 | 3年经验 | 广东珠海金湾区">
		   	高中 | 3年经验 | 广东珠海金湾区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">生日礼物</span>
		   	<span class="tao-tag">节日福利</span>
		   	<span class="tao-tag">交通便利</span>
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="日语营业担当" >
	          <span class="txt">日语营业担当 </span>
	       </a>
	       <span class="money">4000-7000元/月</span>
	       
	       <div class="col-12" title="大专 | 1年经验 | 广东珠海香洲区">
		   	大专 | 1年经验 | 广东珠海香洲区
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">包吃</span>
		   	<span class="tao-tag">包住</span>
		   	<span class="tao-tag">五险一金</span>
		   	<span class="tao-tag">带薪年假</span>
		   	<span class="tao-tag">免费培训</span>
	       </div>
	    </div>  
	  </li>              
	 <li class="col-4">
	 	<div class="inner">
	      <a class="col-6"  href="http://112.74.160.130:8080/seed/login.jsp" title="电子商务运营总监" >
	          <span class="txt">电子商务运营总监 </span>
	       </a>
	       <span class="money">8000-10000元/月</span>
	       
	       <div class="col-12" title="本科 | 5年经验 | 广东珠海">
		   	本科 | 5年经验 | 广东珠海
	       </div>
	       <div class="tag-box">
		   	<span class="tao-tag">五险一金</span>
	       </div>
	    </div>  
	  </li>              
	     
	  
	  
	               
	   </ul>
	</div>         
     
  </body>
</html>