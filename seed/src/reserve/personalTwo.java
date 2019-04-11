package reserve;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/personalTwo")
public class personalTwo extends HttpServlet {
	public personalTwo() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String HTMLusername = request.getSession().getAttribute("sno").toString(); //从登陆页面get sno  值。                             
    	resum resume =new resum(); 
    	seeker_Info seeker_info=new seeker_Info();
    	String HTMLReno =request.getParameter("Reno");
    	String HTMLname = new String(request.getParameter("name").toString().getBytes("ISO8859-1"),"utf-8");                            //浠庣綉椤礸et鍊�
		String HTMLsex = new String(request.getParameter("sex").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLhead = request.getParameter("head");
		String HTMLnation = new String(request.getParameter("nation").toString().getBytes("ISO8859-1"),"utf-8");                           //
		String HTMLplace = new String(request.getParameter("place").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLbirthday = new String(request.getParameter("birthday").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLpolitical = new String(request.getParameter("political").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLhealth = new String(request.getParameter("health").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLmarriage = new String(request.getParameter("marriage").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLschool = new String(request.getParameter("school").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLspecialties = new String(request.getParameter("specialties").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLeducation = new String(request.getParameter("education").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLphone = request.getParameter("phone");
		String HTMLemail = request.getParameter("email");
		String HTMLskill = new String(request.getParameter("skill").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLa_year = new String(request.getParameter("a_year").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLa_school = new String(request.getParameter("a_school").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLa_specialties = new String(request.getParameter("a_specialties").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLb_year = new String(request.getParameter("b_year").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLb_school = new String(request.getParameter("b_school").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLb_specialties = new String(request.getParameter("b_specialties").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLc_year = new String(request.getParameter("c_year").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLc_school = new String(request.getParameter("c_school").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLc_specialties = new String(request.getParameter("c_specialties").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLclass = new String(request.getParameter("class").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLcomputer =new String( request.getParameter("computer").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLlanguage = new String(request.getParameter("language").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLsociology =new String( request.getParameter("sociology").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLaward = new String(request.getParameter("award").toString().getBytes("ISO8859-1"),"utf-8");
		String HTMLoneself = new String(request.getParameter("oneself").toString().getBytes("ISO8859-1"),"utf-8");
		String CuowuOne="null";
		
		String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    String type="";                                                
	    try 
	    {                                                                    // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);// 杩炵画鏁版嵁搴�  
	    
	      ResultSet rss = conn.prepareStatement("select STel,S_E_Mail "
	      		+ "from seeker_info "
	      		+ "where Sno='"+HTMLusername+"'").executeQuery();
	      while(rss.next()) 
	         {
	    	  HTMLphone = rss.getString("STel");
	    	  HTMLemail = rss.getString("S_E_Mail");
	    	 }
	      System.out.println(HTMLemail);
	      System.out.println(HTMLphone);
	      if(HTMLReno.equals("100")){
	    	  conn.prepareStatement("insert "
 	  		+ "into resume("
 	  		+ "RName    ,Reno        ,Sno           ,"
 	  		+ "RBirth   ,RSex        ,RPicture      ,"
 	  		+ "RTel     ,R_E_Mail    ,"
 	  		+ "isMarried,RCountry    ,RNationality  ,"
 	  		+ "RPolitics,RGraduSchool,RComputerSkill,"
 	  		+ "RDegree  ,RPersonSkill,RMajorCourse  ,"
 	  		+ "YM       ,b_ym        ,c_ym          ,"
 	  		+ "School   ,b_School    ,c_School      ,"
 	  		+ "Major    ,b_Major     ,c_Major       ,"
 	  		+ "RLanSkill,RMajor      ,RSocialPractice,"
 	  		+ "RHonor   ,RSelfContro ,Rhealth "
 	  		+ ") "
 	  		+ "values("
 	  		+ "'"+HTMLname+"'           ,'"+HTMLusername+"'         ,'"+HTMLusername+"'            ,"
 	  		+ "'"+HTMLbirthday+"'       ,'"+HTMLsex+"'              ,'"+HTMLhead+"'                ,"
 	  		+ "'"+HTMLphone+"'          ,'"+HTMLemail+"'            ,"
 	  		+ "'"+HTMLmarriage+"'       ,'"+HTMLplace+"'            ,'"+HTMLnation+"'              ,"
 	  		+ "'"+HTMLpolitical+"'      ,'"+HTMLschool+"'           ,'"+HTMLcomputer+"'            ,"
 	  		+ "'"+HTMLeducation+"'      ,'"+HTMLskill+"'            ,'"+HTMLcomputer+"'            ,"
 	  		+ "'"+HTMLa_year+"'         ,'"+HTMLb_year+"'           ,'"+HTMLc_year+"'              ,"
 	  		+ "'"+HTMLa_school+"'       ,'"+HTMLb_school+"'         ,'"+HTMLc_school+"'            ,"
 	  		+ "'"+HTMLa_specialties+"'  ,'"+HTMLb_specialties+"'    ,'"+HTMLc_specialties+"'       ,"
 	  		+ "'"+HTMLlanguage+"'       ,'"+HTMLspecialties+"'      ,'"+HTMLsociology+"'           ,"
 	  		+ "'"+HTMLaward+"'          ,'"+HTMLoneself+"'          ,'"+HTMLhealth+"'              "
 	  		+ ")").execute(); 
	    	  
	    	   
	      
	         ResultSet rs = conn.prepareStatement("select "
	          		 + "Reno,Sno,RBirth,"
	          		 + "RName,RSex,RPicture,"
	          		 + "isMarried,Rhealth,"
	      		     + "RCountry,RNationality,RPolitics,"
	      		     + "RGraduSchool,RMajor,RDegree,"
	      		     + "YM,b_ym,c_ym,"
	      		     + "School,b_School,c_School,"
	      		     + "Major,b_Major,c_Major,"
	      		     + "RMajorCourse,RPersonSkill,R_E_Mail,"
	      		     + "RComputerSkill,RLanSkill,RTel,"
	      		     + "RSocialPractice,RHonor,RSelfContro "
	      		    + "from resume "
	      		    + "where Reno='"+HTMLusername+"'").executeQuery();//鏌ヨ
	    	  
	      
	    	  
	    	 
	         while(rs.next()) {
	        	   resume.setSno(rs.getString("Sno"));
	    	       resume.setRGraduSchool(rs.getString("RGraduSchool"));
	    	       resume.setRDegree(rs.getString("RDegree"));
	    	       resume.setReno(rs.getString("Reno"));
	    	       resume.setR_E_Mail(rs.getString("R_E_Mail"));
	         	   resume.setSno(rs.getString("Sno"));
	    	       resume.setRBirth(rs.getString("RBirth"));
	    	       resume.setRName(rs.getString("RName"));
	    	       resume.setRSex(rs.getString("RSex"));
	    	       resume.setRPicture(rs.getString("RPicture"));
	    	       resume.setRTel(rs.getString("RTel"));
	    	       resume.setIsMarried(rs.getString("isMarried"));
	    	       resume.setRCountry(rs.getString("RCountry"));
	    	       resume.setRNationality(rs.getString("RNationality"));
	    	       resume.setRPolitics(rs.getString("RPolitics"));
	    	       resume.setRMajor(rs.getString("RMajor"));
	    	       resume.setRPersonSkill(rs.getString("RPersonSkill"));
	    	       resume.setYM(rs.getString("YM"));
                   resume.setB_ym(rs.getString("b_ym"));
                   resume.setC_ym(rs.getString("c_ym"));
	    	       resume.setSchool(rs.getString("School"));
	    	       resume.setB_School(rs.getString("b_School"));
	    	       resume.setC_School(rs.getString("c_School"));
	    	       resume.setMajor(rs.getString("Major"));
	    	       resume.setB_Major(rs.getString("b_Major"));
	    	       resume.setC_Major(rs.getString("c_Major"));
	    	       resume.setRhealth(rs.getString("Rhealth"));
	    	       resume.setRMajorCourse(rs.getString("RMajorCourse"));
	    	       resume.setRComputerSkill(rs.getString("RComputerSkill"));
	    	       resume.setRLanSkill(rs.getString("RLanSkill"));
	    	       resume.setRSocialPractice(rs.getString("RSocialPractice"));
	    	       resume.setRHonor(rs.getString("RHonor"));
	    	       resume.setRSelfContro(rs.getString("RSelfContro"));
	               CuowuOne="保存成功";         
	              }  //while
	            }//if
	     else{
	    	 
	    	  conn.prepareStatement("update resume "
		                + "set RName='"+HTMLname+"'       ,     Rhealth='"+HTMLhealth+"'     , Sno='"+HTMLusername+"'        ,"
		              	+ "b_Major='"+HTMLb_specialties+"',     RSex='"+HTMLsex+"'           , R_E_Mail='"+HTMLemail+"'      ,"
		                + "RBirth='"+HTMLbirthday+"'      ,     RPicture='"+HTMLhead+"'      ,"
		                + "isMarried='"+HTMLmarriage+"'   ,     RCountry='"+HTMLplace+"'     , RNationality='"+HTMLnation+"' ,"
		                + "RPolitics='"+HTMLpolitical+"'  ,     RMajor='"+HTMLspecialties+"' , "
		                + "RDegree='"+HTMLeducation+"'    ,     RPersonSkill='"+HTMLskill+"' , RTel='"+HTMLphone+"'          ,"
		                + "RGraduSchool='"+HTMLschool+"'  ,     b_ym='"+HTMLb_year+"'        , c_ym='"+HTMLc_year+"'         ,"
		                + "RSocialPractice='"+HTMLsociology+"', b_School='"+HTMLb_school+"'  , c_School='"+HTMLc_school+"'   ,"
		                + "Major='"+HTMLa_specialties+"'  ,     Reno='"+HTMLusername+"'      , c_Major='"+HTMLc_specialties+"',"
		                + " RMajorCourse='"+HTMLclass+"',     YM='"+HTMLa_year+"'          , RLanSkill='"+HTMLlanguage+"'  ,"
		                + "RComputerSkill='"+HTMLcomputer+"',   RSelfContro='"+HTMLoneself+"', School='"+HTMLa_school+"'     ,"
		                + "RLanSkill='"+HTMLlanguage+"'   ,     RHonor='"+HTMLaward+"'           "		             
		              + " where Reno='"+HTMLusername+"'").execute();  
	    	  
	          ResultSet rs = conn.prepareStatement("select "
	        		    + "RName    ,Reno        ,Sno           ,"
		    	  		+ "RBirth   ,RSex        ,RPicture      ,"
		    	  		+ "RTel     ,R_E_Mail    ,"
		    	  		+ "isMarried,RCountry    ,RNationality  ,"
		    	  		+ "RPolitics,RGraduSchool,RComputerSkill,"
		    	  		+ "RDegree  ,RPersonSkill,RMajorCourse  ,"
		    	  		+ "YM       ,b_ym        ,c_ym          ,"
		    	  		+ "School   ,b_School    ,c_School      ,"
		    	  		+ "Major    ,b_Major     ,c_Major       ,"
		    	  		+ "RLanSkill,RMajor      ,RSocialPractice,"
		    	  		+ "RHonor   ,RSelfContro ,Rhealth "
	      		    + "from resume "
	      		    + "where Reno='"+HTMLusername+"'").executeQuery();             //鏌ヨ
	          
	         
	         while(rs.next()) {
	        	   resume.setSno(rs.getString("Sno"));
	    	       resume.setRGraduSchool(rs.getString("RGraduSchool"));
	    	       resume.setReno(rs.getString("Reno"));                        
	    	       resume.setR_E_Mail(rs.getString("R_E_Mail"));
	    	       resume.setRDegree(rs.getString("RDegree"));
	    	       resume.setRBirth(rs.getString("RBirth"));
	    	       resume.setRName(rs.getString("RName"));
	    	       resume.setRSex(rs.getString("RSex"));
	    	       resume.setRPicture(rs.getString("RPicture"));
	    	       resume.setRTel(rs.getString("RTel"));
	    	       resume.setIsMarried(rs.getString("isMarried"));
	    	       resume.setRCountry(rs.getString("RCountry"));
	    	       resume.setRNationality(rs.getString("RNationality"));
	    	       resume.setRPolitics(rs.getString("RPolitics"));
	    	       resume.setRMajor(rs.getString("RMajor"));
	    	       resume.setRPersonSkill(rs.getString("RPersonSkill"));
	    	       resume.setYM(rs.getString("YM"));
                   resume.setB_ym(rs.getString("b_ym"));
                   resume.setC_ym(rs.getString("c_ym"));
	    	       resume.setSchool(rs.getString("School"));
	    	       resume.setB_School(rs.getString("b_School"));
	    	       resume.setC_School(rs.getString("c_School"));
	    	       resume.setMajor(rs.getString("Major"));
	    	       resume.setB_Major(rs.getString("b_Major"));
	    	       resume.setC_Major(rs.getString("c_Major"));
	    	       resume.setRhealth(rs.getString("Rhealth"));
	    	       resume.setRMajorCourse(rs.getString("RMajorCourse"));
	    	       resume.setRComputerSkill(rs.getString("RComputerSkill"));
	    	       resume.setRLanSkill(rs.getString("RLanSkill"));
	    	       resume.setRSocialPractice(rs.getString("RSocialPractice"));
	    	       resume.setRHonor(rs.getString("RHonor"));
	    	       resume.setRSelfContro(rs.getString("RSelfContro"));
	                          }  //while
	               CuowuOne="保存成功";
	                  }//else
                }   //try
	    catch(Exception e)
	       {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	       }
	       System.out.println(HTMLeducation);
	       request.setAttribute("CuowuOne",CuowuOne);	  
	       request.setAttribute("resume", resume);   
	       request.getRequestDispatcher("personalSuccess.jsp").forward(request, response);  
	}
	public void init() throws ServletException {
		// Put your code here
	}
	
}
