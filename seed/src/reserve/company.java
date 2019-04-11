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
@WebServlet("/company")
public class company extends HttpServlet {
	public company() {
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
		job_Info job_Info = new job_Info();
        String HTMLCno= new String(request.getParameter("Cno").getBytes("ISO-8859-1"),"utf-8");
        String HTMLJno= new String(request.getParameter("Jno").getBytes("ISO-8859-1"),"utf-8");
        System.out.println(HTMLJno);
        System.out.println(HTMLCno);
		
        
 		
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";         
	    try 
	    {                                                                    // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);// 杩炵画鏁版嵁搴�  
	      ResultSet rs = conn.prepareStatement("select "
	      		+ "Jname,         JSalary,     JCondition,"
	      		+ "JWorkExp,      JEduRequire,JAgeRequire,"
	      		+ "JLanRequire,   JJobType,    JSalaryStru,"
	      		+ "JPositionState,JJobRequire, JASSET,"
	      		+ "JComStrength,  Linkman,     LinkTel,"
	      		+ "LinkE_mail,    AddTime,     Cno,Jno  "
	      		+ "from Job_info  "
	      		+ "where Cno='"+HTMLCno+"'and Jno='"+HTMLJno+"'").executeQuery();              //鏌ヨ
	     // conn.prepareStatement("update insert deletexxx").execute();      //澧炲垹鏀�
	    
	    
	    while(rs.next()) {
	    	job_Info.setCno(rs.getString("Cno"));                    //type = rs.getString("count(*)");
	    	job_Info.setJno(rs.getString("Jno"));
	    	job_Info.setJname(rs.getString("Jname"));                //JobBean.setRen(rs.getString("nre"));
	        job_Info.setJSalary(rs.getString("JSalary"));
	        job_Info.setJCondition(rs.getString("JCondition"));
	        job_Info.setJWorkExp(rs.getString("JWorkExp"));
	        job_Info.setJEduRequire(rs.getString("JEduRequire"));
	        job_Info.setJAgeRequire(rs.getString("JAgeRequire"));
	        job_Info.setJLanRequire(rs.getString("JLanRequire"));
	        job_Info.setJJobType(rs.getString("JJobType"));
	        job_Info.setJSalaryStru(rs.getString("JSalaryStru"));
	        job_Info.setJPositionState(rs.getString("JPositionState"));
	        job_Info.setJJobRequire(rs.getString("JJobRequire"));
	        job_Info.setJASSET(rs.getString("JASSET"));
	        job_Info.setJComStrength(rs.getString("JComStrength"));
	        job_Info.setLinkEmail(rs.getString("LinkE_mail"));
	        job_Info.setLinkTel(rs.getString("LinkTel"));
	        job_Info.setLinkman(rs.getString("Linkman"));
	        job_Info.setAddTime(rs.getString("AddTime"));
	      }//while
	    }
	    catch(Exception e)
	      {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	      }
	    request.getSession().setAttribute("Jno", HTMLJno);
	    request.setAttribute("job_Info",job_Info);
		request.getRequestDispatcher("company.jsp").forward(request, response);
		
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
