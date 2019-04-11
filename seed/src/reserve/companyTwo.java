package reserve;
/* 涓汉绠�鍘唒ersonal.jsp椤甸潰閫昏緫鍒ゆ柇  */
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
@WebServlet("/companyTwo")
public class companyTwo extends HttpServlet {
	public companyTwo() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
			doPost(request,response);
	}
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String HTMLusername = request.getSession().getAttribute("sno").toString();    //浠庣櫥褰曢〉闈et sno鍊�                                    //type = rs.getString("count(*)");
	   resum resume = new resum(); 
	   String HTMLCno= new String(request.getParameter("Cno").getBytes("utf-8"),"utf-8");
	   String HTMLJno  = new String(request.getSession().getAttribute("Jno").toString().getBytes("UTF-8"),"UTF-8");
		System.out.println(HTMLJno);
		System.out.println(HTMLJno);
		System.out.println(HTMLJno);
		System.out.println(HTMLJno);
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";         
	    String CuowuOne="";
	    String type="";
	    String nextjsp="personalTwo.jsp";
		    try 
		    {                                                                       // 鍔犺浇椹卞姩绋嬪簭  
		      Class.forName(driver);  
		      Connection conn = DriverManager.getConnection(url, user, password);   // 杩炵画鏁版嵁搴�  
		    
		      ResultSet rss = conn.prepareStatement("select count(*) "
	      		    + "from resume "
	      		    + "where Reno='"+HTMLusername+"'").executeQuery();//鏌ヨ
		      while(rss.next()) 
	  	         {
	  	    	  type = rss.getString("count(*)");
	  	    	 }
		      if(type.equals("0")) 
		      {
		    	 CuowuOne="请您先填写个人简历";
		    	 nextjsp="TiJiaoJianLi.jsp";
		      }
		      else {
		      ResultSet rs = conn.prepareStatement("select  "
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
	      		    + "where Reno='"+HTMLusername+"'").executeQuery();//鏌ヨ

		    		     // conn.prepareStatement("update insert deletexxx").execute();                                  //澧炲垹鏀�
		    
		      
		      while(rs.next()) {
	    	       System.out.println    (rs.getString("RName"));
	    	       resume.setReno        (rs.getString("Reno"));                       
	    	       resume.setR_E_Mail    (rs.getString("R_E_Mail"));
	         	   resume.setSno         (rs.getString("Sno"));
	    	       resume.setRBirth      (rs.getString("RBirth"));
	    	       resume.setRName       (rs.getString("RName"));
	    	       resume.setRSex        (rs.getString("RSex"));
	    	       resume.setRPicture    (rs.getString("RPicture"));
	    	       resume.setRTel        (rs.getString("RTel"));
	    	       resume.setIsMarried   (rs.getString("isMarried"));
	    	       resume.setRCountry    (rs.getString("RCountry"));
	    	       resume.setRNationality(rs.getString("RNationality"));
	    	       resume.setRPolitics   (rs.getString("RPolitics"));
	    	       resume.setRMajor      (rs.getString("RMajor"));
	    	       resume.setRPersonSkill(rs.getString("RPersonSkill"));
	    	       resume.setYM          (rs.getString("YM"));
                   resume.setB_ym        (rs.getString("b_ym"));
                   resume.setC_ym        (rs.getString("c_ym"));
	    	       resume.setSchool      (rs.getString("School"));
	    	       resume.setB_School    (rs.getString("b_School"));
	    	       resume.setC_School    (rs.getString("c_School"));
	    	       resume.setMajor       (rs.getString("Major"));
	    	       resume.setB_Major     (rs.getString("b_Major"));
	    	       resume.setC_Major     (rs.getString("c_Major"));
	    	       resume.setRhealth     (rs.getString("Rhealth"));
	    	       resume.setRMajorCourse(rs.getString("RMajorCourse"));
	    	       resume.setRComputerSkill(rs.getString("RComputerSkill"));
	    	       resume.setRLanSkill   (rs.getString("RLanSkill"));
	    	       resume.setRSocialPractice(rs.getString("RSocialPractice"));
	    	       resume.setRHonor      (rs.getString("RHonor"));
	    	       resume.setRSelfContro (rs.getString("RSelfContro"));
		                      }//while
		      }//else
		     }//try
		    catch(Exception e)
		      {  
		        System.out.println("Succeeded connecting Not to the Database!");  
		        e.printStackTrace();          
		      }
		    request.setAttribute("resume", resume);   
		    request.setAttribute("Cno",HTMLCno);
		    request.setAttribute("Jno",new String(HTMLJno));
		    request.setAttribute("CuowuOne", CuowuOne);
			request.getRequestDispatcher(nextjsp).forward(request, response);
		}
		public void init() throws ServletException {
			// Put your code here
		}

	}
