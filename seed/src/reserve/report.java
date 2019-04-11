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
@WebServlet("/report")
public class report extends HttpServlet {
	public report() {
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
		String HTMLusername =request.getSession().getAttribute("sno").toString();   //浠庣櫥褰曢〉闈et sno鍊� 
		String HTMLCno= new String(request.getParameter("Cno").getBytes("utf-8"),"utf-8");
		String HTMLJno= new String(request.getParameter("Jno").getBytes("utf-8"),"utf-8");
        
        

	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                      // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	   
	    
	    try 
	    {                                                                   // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                          // 杩炵画鏁版嵁搴�  
//	      ResultSet rs = conn.prepareStatement("select "
//	      		+ "into user (username) values ()").executeQuery();//鏌ヨ
//	      conn.prepareStatement("update insert deletexxx").execute();                                  //澧炲垹鏀�
//	    
//	    
//	    while(rs.next()) {
//	    	                                                               //type = rs.getString("count(*)");
//	    	                                                                //JobBean.setRen(rs.getString("nre"));
//	    }
//	    
	    
	    
	    
	    
	    }catch(Exception e){  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	    }
          request.setAttribute("Jno", HTMLJno);
          request.setAttribute("Cno", HTMLCno);
          request.setAttribute("Sno", HTMLusername);
          request.getRequestDispatcher("report.jsp").forward(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
