<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="reserve.resum" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
resum resum = (resum)request.getAttribute("resume");
%>
<%@ page language="java" contentType="text/html; charset=utf-8"pageEncoding="utf-8"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 企业查看个人简历页面 -->
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
<link href="http://112.74.160.130:8080/seed/personal.css" rel="stylesheet" type="text/css" />

</head>
<body onload="onload()">
  <table cellspacing=10px>
       <tr>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/Comtwo"    type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="招聘信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/comInf"     type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="基本信息"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/resume" type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="收到简历"></a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/login.jsp"  type="button"  id="btn_register" onclick="" ><input class="button3"type="button" class="" value="退出">   </a></div></th>
         <th align="right"><div><a href="http://112.74.160.130:8080/seed/index.html?str=http://112.74.160.130:8080/seed/com.jsp" type="button" id="btn_register" onclick="" ><input class="button3"type="button" class="" value="关于我们"></a></div></th>
       </tr>
   </table>
   <div class="text0">
   </div>
   <form action="" method="post">
     <div class="text1">
            <div>
             <p style="text-align:left;">
             <span style="font-family:LiSu;font-size:30.0pt;">个人简历</span></p>
            </div>
       
        <div class="text2">
          <table width="581" border="1" cellpadding="0" cellspacing="1"> 
            <tbody>
                 <tr>
                    <td rowspan="7" style="width:61.2pt;height:20.5pt;">
                      <p style="text-align:center;"><span style="font-family:宋体;font-size:11.0pt;">基 本</span></p>  
                      <p style="text-align:center;"><span style="font-family:宋体;font-size:11.0pt;">资 料</span></p>
                    </td>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;" >姓 名： </span></p>
                    </td>
                    <td colspan="2" style="width:74.15pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="name" style="border:0px;float:left;margin-top:-15px;height:40px;" value="<% out.print(resum.getRName()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="2" style="width:71.75pt;height:20.5pt;">
                       <div style="width:100px;"></div>
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">性 别： </span></p>
                    </td>
                    <td colspan="3" style="width:71.8pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="sex" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRSex()); %>">&nbsp;</span></p>
                    </td>
                    <td rowspan="5" style="width:82.6pt;height:20.5pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="file" name="head"id="head" onclick="onload()" class="btn_style" style="border:10px;float:left;margin-top:-15px;height:40px;" value="上传头像">&nbsp;</span></p>
                    </td>
                 </tr>
                      
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">民 族： </span></p>
                    </td>
                    <td colspan="2" style="width:74.15pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="nation" style="border:0px; float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRNationality()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="2" style="width:71.75pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">籍 贯： </span></p>
                    </td>
                    <td colspan="3" style="width:71.8pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="place" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRCountry()); %>">&nbsp;</span></p>
                    </td>
                 </tr>
                      
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">出生日期： </span></p>
                    </td>
                    <td colspan="2" style="width:74.15pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="birthday"style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRBirth()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="2" style="width:71.75pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">政治面貌： </span></p>
                    </td>
                    <td colspan="3" style="width:71.8pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="political"style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRPolitics()); %>">&nbsp;</span></p></td>
                 </tr>
        
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">健康状况： </span></p>
                    </td>
                    <td colspan="2" style="width:74.15pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="health" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRhealth()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="2" style="width:71.75pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">婚姻状况： </span></p>
                    </td>
                    <td colspan="3" style="width:71.8pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="marriage" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getIsMarried()); %>">&nbsp;</span></p>
                    </td>
                 </tr>
                       
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">毕业学校：</span></p>
                    </td>
                    <td colspan="7" style="width:219.1pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="school" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRGraduSchool()); %>">&nbsp;</span></p>
                    </td>
                 </tr>
                       
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">专 业： </span></p>
                    </td>
                    <td colspan="4" style="width:146.65pt;height:20.5pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="specialties" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRMajor()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="3" style="width:71.8pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">学 历： </span></p>
                    </td>
                    <td style="width:82.6pt;height:20.5pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"name="education"  style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRDegree()); %>">&nbsp;</span></p>
                    </td>
                  </tr>
                       
                 <tr>
                    <td style="width:69.35pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">联系电话： </span></p>
                    </td>
                    <td colspan="4" style="width:116.0pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="phone" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRTel()); %>">&nbsp;</span></p>
                    </td>
                    <td colspan="3" style="width:71.1pt;height:20.5pt;">
                       <p style="text-align:right;"><span style="font-family:宋体;font-size:9.0pt;">E-mail</span>
                       <span style="font-family:宋体;font-size:9.0pt;">：&nbsp; </span>
                       </p>
                    </td>
                    <td colspan="3" style="width:113.9pt;height:20.5pt;">
                       <p><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="email" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getR_E_Mail()); %>">&nbsp;</span></p>
                    </td>
                  </tr>
                       
                  <tr style="width:180px;">
                    <td style="width:80%;height:51.2pt;">
                    <div style="width:180px;"></div>
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">个 人</span></p>
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">技 能</span></p>
                    </td>
                    <td colspan="9" style="width:372.45pt;height:51.2pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input name="skill"type="text"  style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRPersonSkill()); %>">&nbsp;</span></p>
                    </td>
                  </tr>
                       
                  <tr>
                    <td rowspan="4" style="width:61.2pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">教 育</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">培 训</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">经 历</span></p>
                     </td>
                     <td colspan="2" style="width:108.25pt;height:20.5pt;"><p style="text-align:center;">
                       <span style="font-family:宋体;font-size:9.0pt;">年月</span></p>
                     </td>
                     <td colspan="5" style="width:170.5pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">学校/机构</span></p>
                     </td>
                     <td colspan="2" style="width:92.35pt;height:20.5pt;">
                       <p style="text-align:center;">
                       <span style="font-family:宋体;font-size:9.0pt;">专业</span></p>
                     </td>
                   </tr>
                       
                   <tr>
                     <td colspan="2" style="width:108.25pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="a_year" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getYM()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="5" style="width:170.5pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="a_school" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getSchool()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="2" style="width:92.35pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="a_specialties"style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getMajor()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                       
                   <tr>
                     <td colspan="2" style="width:108.25pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="b_year"style="border:0px;float:left;margin-top:-15px;height:40px;"    value="<% out.print(resum.getB_ym()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="5" style="width:170.5pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="b_school" style="border:0px;float:left;margin-top:-15px;height:40px;"   value="<% out.print(resum.getB_School()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="2" style="width:92.35pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="b_specialties" style="border:0px;float:left;margin-top:-15px;height:40px;" value="<% out.print(resum.getB_Major()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                       
                   <tr>
                     <td colspan="2" style="width:108.25pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="c_year"style="border:0px;float:left;margin-top:-15px;height:40px;" value="<% out.print(resum.getC_ym()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="5" style="width:170.5pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="c_school"style="border:0px;float:left;margin-top:-15px;height:40px;" value="<% out.print(resum.getC_School()); %>">&nbsp;</span></p>
                     </td>
                     <td colspan="2" style="width:92.35pt;height:20.5pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="c_specialties"style="border:0px;float:left;margin-top:-15px;height:40px;" value="<% out.print(resum.getC_Major()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                      
                   <tr>
                     <td style="width:61.2pt;height:51.2pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">主 修</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">课 程</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:51.2pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="class" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRMajorCourse()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                       
                   <tr>
                     <td style="width:61.2pt;height:38.35pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">计算机</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">能 力</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:38.35pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="computer" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRComputerSkill()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                   
                   <tr>
  
                     <td style="width:61.2pt;height:38.35pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">语 言</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">能 力</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:38.35pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="language" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRLanSkill()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                   <tr>
                     <td style="width:61.2pt;height:51.2pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">社 会</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">实 践</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:51.2pt;"><p style="text-align:left;">
                       <span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text"  name="sociology"style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRSocialPractice()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                   <tr>
                     <td style="width:61.2pt;height:51.2pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">获 奖</span></p>
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">情 况</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:51.2pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="award" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRHonor()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                     
                   <tr>
                     <td style="width:61.2pt;height:51.2pt;">
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">自 我</span></p>  
                       <p style="text-align:center;"><span style="font-family:宋体;font-size:9.0pt;">评 价</span></p>
                     </td>
                     <td colspan="9" style="width:372.45pt;height:51.2pt;">
                       <p style="text-align:left;"><span style="font-family:宋体;font-size:9.0pt;">
                       <input type="text" name="oneself" style="border:0px;float:left;margin-top:-15px;height:40px;"value="<% out.print(resum.getRSelfContro()); %>">&nbsp;</span></p>
                     </td>
                   </tr>
                      
                 </tbody>
          </table>
        </div>
               
                   <div class="text5">
                    <form action="shanchu" method="post">
                      <input type="submit"   class="btn_style" id="btn_register" onclick="" value="删除">
                      <input type="hidden" name="Sno" value="value="<% out.print(resum.getSno()); %>">
                    </form>
                    
                  </div>
     </div>
   </form>


</body>
<script type="text/javascript" src="http://112.74.160.130:8080/seed/jquery-3.3.1.min.js">
function onload(){
$("#buttonss").attr("type", "file");
}
</script>
</html>
