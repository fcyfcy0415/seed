package reserve;
/*浼佷笟鎼滅储鎷涜仒淇℃伅 */
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
@WebServlet("/ComThree")
public class ComThree extends HttpServlet {
	public ComThree() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	} 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");
    	doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	String HTMLusername = request.getSession().getAttribute("sno").toString();                   //浠庣櫥褰曢〉闈et sno鍊�
    String HTMLjno= new String(request.getParameter("jno").toString().getBytes("utf-8"),"utf-8");//1鑱屼綅ID 
    job_Info job_Info= new job_Info();

	
	   
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    try 
	      {                                                                               // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);             // 杩炵画鏁版嵁搴�  
	      ResultSet rs = conn.prepareStatement("select "
	    		    + "Jno,         Cno,         Jname,"
		      		+ "JSalary,      JCondition,  JWorkExp,"
		      		+ "JEduRequire,  JAgeRequire, JLanRequire," 
		      		+ "JJobType,     JSalaryStru, JPositionState,"
		      		+ "JJobRequire,  JASSET,      JComStrength,"
		      		+ "Linkman,      LinkTel,     LinkE_mail,"
		      		+ "AddTime " 
                  + "from job_info "
                  + "where Jno='"+HTMLjno+"' and Cno='"+HTMLusername+"'").executeQuery();//鏍规嵁Jno鏌ユ壘鏁版嵁
	      while(rs.next())                                                                
	        {
	    	
	    	job_Info.setJname(rs.getString("Jname"));
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
	    	job_Info.setLinkman(rs.getString("Linkman"));
	    	job_Info.setLinkTel(rs.getString("LinkTel"));
	    	job_Info.setLinkEmail(rs.getString("LinkE_mail"));
	    	job_Info.setAddTime(rs.getString("AddTime"));
	        }//while                                                 
	      } //try
	    catch(Exception e)
	      { System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();   
	      }
	    request.setAttribute("job_Info", job_Info);
	    request.getSession().setAttribute("jno", HTMLjno);
		request.getRequestDispatcher("comThree.jsp").forward(request, response);
	}//dopast
	public void init() throws ServletException {
		// Put your code here
	}

}