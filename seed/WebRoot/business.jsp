<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.employer_Info" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
employer_Info employer_Info = (employer_Info)request.getAttribute("employer_Info");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- 企业注册界面 -->
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
<style type="text/css">
    .text2{                                 /*搜索栏样式1*/
        margin-top:150px;
        height:510px;
        width:100%;
        background-image: url(Picture1.png);
        }
	.dark-matter {

       margin-left: auto;
       margin-right: auto;
       max-width: 500px;
       background: #555;
       padding: 20px 30px 20px 30px;
       font: 12px "Helvetica Neue", Helvetica, Arial, sans-serif;
       color: #D3D3D3;
       text-shadow: 1px 1px 1px #444;                    /*基础文本阴影效果*/
       border: none;
       border-radius: 5px;                               /*圆角边框*/
       -webkit-border-radius: 5px;
       -moz-border-radius: 5px;
                   }
                   
    .dark-matter h1 {
       padding: 0px 0px 10px 40px;
       display: block;
       border-bottom: 1px solid #444;
       margin: -10px -30px 30px -30px;
                   }
     .dark-matter h1>span {
       display: block;
       font-size: 11px;
                   }
     .dark-matter label {
       display: block;
       margin: 0px 0px 5px;
                    }
     .dark-matter label>span {
       float: left;
       width: 20%;
       text-align: right;
       padding-right: 10px;
       margin-top: 10px;
       font-weight: bold;
                     }
     .dark-matter input[type=text], .dark-matter textarea, .dark-matter select {
       border: none;
       color: #525252;
       height: 25px;
       line-height:15px;
       margin-bottom: 16px;
       margin-right: 6px;
       margin-top: 2px;
       outline: 0 none;
       padding: 5px 0px 5px 5px;
       width: 70%;
       border-radius: 2px;
       -webkit-border-radius: 2px;
       -moz-border-radius: 2px;
       -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
       background: #DFDFDF;
                        }
    .dark-matter input[type=email]{
       border: none;
       color: #525252;
       height: 25px;
       line-height:15px;
       margin-bottom: 16px;
       margin-right: 12px;
       margin-top: 2px;
       outline: 0 none;
       padding: 5px 0px 5px 5px;
       width: 30%;
       border-radius: 2px;
       -webkit-border-radius: 2px;
       -moz-border-radius: 2px;
       -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
       background: #DFDFDF;
                        } 
    .dark-matter input[type=password]{
       border: none;
       color: #525252;
       height: 25px;
       line-height:15px;
       margin-bottom: 16px;
       margin-right: 12px;
       margin-top: 2px;
       outline: 0 none;
       padding: 5px 0px 5px 5px;
       width: 30%;
       border-radius: 2px;
       -webkit-border-radius: 2px;
       -moz-border-radius: 2px;
       -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
       background: #DFDFDF;
                        } 
    .dark-matter select {
      background: #DFDFDF url('down-arrow.png') no-repeat right;
      background: #DFDFDF url('down-arrow.png') no-repeat right;
      appearance:none;
      -webkit-appearance:none;
      -moz-appearance: none;
      text-indent: 0.01px;
      text-overflow: '';
      width: 70%;
      height: 35px;
      color: #525252;
      line-height: 25px;
                          }
   .dark-matter textarea{
         height:100px;
         padding: 5px 0px 0px 5px;
         width: 70%;
                            }
   .dark-matter .button {
         background: #FFCC02;
         border: none;
         padding: 10px 25px 10px 25px;
         color: #585858;
         border-radius: 4px;
         -moz-border-radius: 4px;
         -webkit-border-radius: 4px;
         text-shadow: 1px 1px 1px #FFE477;
         font-weight: bold;
         box-shadow: 1px 1px 1px #3D3D3D;
         -webkit-box-shadow:1px 1px 1px #3D3D3D;
         -moz-box-shadow:1px 1px 1px #3D3D3D;
                             }
   .dark-matter .button2 {
         background: #FFCC02;
         border: none;
         padding: 10px 25px 10px 25px;
         color: #585858;
         border-radius: 4px;
         -moz-border-radius: 4px;
         -webkit-border-radius: 4px;
         text-shadow: 1px 1px 1px #FFE477;
         font-weight: bold;
         box-shadow: 1px 1px 1px #3D3D3D;
         -webkit-box-shadow:1px 1px 1px #3D3D3D;
         -moz-box-shadow:1px 1px 1px #3D3D3D;
                             }
    .dark-matter .button:hover {
         color: #333;
         background-color: #EBEBEB;
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="text1">
   </div>
  <div class="text2">  
  <form class="dark-matter" action="business" method="post">
   <h1 class="h1">企业注册
     <span class="h1>span">你的账号是：<% out.print(request.getParameter("str")); %></span>
   </h1>
   
  <label class="label">
   <span  class="label>span">公司名称:</span>
    <input class="input[type=text]" id="Cname" type="text" name="Cname" placeholder="您的公司名称" />
   </label >
   
   <label class="label">
   <span  class="label>span">联系人:</span>
    <input class="input[type=text]" id="Ename" type="text" name="Ename" placeholder="输入您的姓名" />
   </label >
   
   <label class="label">
   <span  class="label>span">公司电话:</span>
    <input class="input[type=text]" id="CTel" type="text" name="CTel" placeholder="您的手机号" />
   </label >
   
   <label class="label">
   <span  class="label>span">公司邮箱:</span>
    <input class="input[type=text]" id="E_E_Mail" type="text" name="E_E_Mail" placeholder="您的邮箱" />
   </label >
   
   <label class="label">
   <span  class="label>span">公司地址:</span>
    <input class="input[type=text]" id="Cadress" type="text" name="Cadress" placeholder="您的公司地址" />
   </label >
   
   <label class="label">
   <span  class="label>span">法人代表:</span>
    <input class="input[type=text]" id="Clegal" type="text" name="Clegal" placeholder="您公司的法人代表" />
   </label >
   
    <label class="label">
   <span  class="label>span">营业执照编码:</span>
    <input class="input[type=text]" id="Licno" type="text" name="Licno" placeholder="您公司的营业执照编码" />
   </label >
   
   <label class="label">
   <span  class="label>span">密码:</span>
    <input class="input[type=password]" id="Passwork" type="password" name="Passwork" placeholder="输入您的密码" />
   </label >
   
   <label class="label">
   <span  class="label>span">密码:</span>
    <input class="input[type=password]" id="com_confirm_password" type="password" name="com_confirm_password" placeholder="再次输入您的密码" />
   </label >
 
   <label class="label">
    <span class="label>span">&nbsp;</span>
     </label>
   
    <label class="label">
    <span class="label>span">&nbsp;</span>
    <input type="submit" class="button" value="注册" />
   </label>
  </form>
  </div> 
</body>
</html>