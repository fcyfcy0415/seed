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
@WebServlet("/ComPerOne")
public class ComPerOne extends HttpServlet {

	public ComPerOne() {
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
		resum resume =new resum(); 
		String HTMLSno= new String(request.getParameter("Sno").getBytes("ISO-8859-1"),"utf-8");
		System.out.println(HTMLSno);
		
		int linshi=HTMLSno.indexOf("%");                            //鍚屾椂鑾峰彇涓や釜鏁版嵁
		String sno = HTMLSno.substring(0, linshi);
		String jno = HTMLSno.substring(linshi+1);
		System.out.println(sno);	
		System.out.println(jno);	
		
		String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    try {         // 鍔犺浇椹卞姩绋嬪簭  
	    Class.forName(driver);  
	    Connection conn = DriverManager.getConnection(url, user, password);// 杩炵画鏁版嵁搴�  
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
     		    + "where Reno='"+sno+"'").executeQuery();//鏌ヨ
	    
	    while(rs.next()) {
     	   resume.setSno(rs.getString("Sno"));
 	       resume.setRGraduSchool(rs.getString("RGraduSchool"));
 	       resume.setReno(rs.getString("Reno"));                        
 	       resume.setR_E_Mail(rs.getString("R_E_Mail"));
      	   resume.setSno(rs.getString("Reno"));
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
	      }//try
	    catch(Exception e)
	    {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	    }   
	    request.setAttribute("sno", sno); 
	    request.setAttribute("jno", jno);
	    request.getSession().setAttribute("Jno", new String(jno.getBytes("utf-8"),"ISO-8859-1"));
	    request.setAttribute("resume", resume);   
		request.getRequestDispatcher("personlCom.jsp").forward(request, response);
	}//post
	public void init() throws ServletException {
		// Put your code here
	}

}
