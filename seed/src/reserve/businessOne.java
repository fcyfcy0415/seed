package reserve;
/*浼佷笟娉ㄥ唽 */
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
@WebServlet("/businessOne")

public class businessOne extends HttpServlet {
	public businessOne() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
    	doPost(request,response);
    	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "";                                                                                          //18宸ヤ綔ID 
    	while(true){
    		str += (int)(Math.random()*9999999);
    		if(str.length() == 7){
    			break;
    		}
    	}
    	System.out.print(str);
    	String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    try 
	     {                                                                  // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                          // 杩炵画鏁版嵁搴�  
	     }//try
	    catch(Exception e)
	     {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	     }//catch
	    request.getSession().setAttribute("Cno", str);
	    request.getRequestDispatcher("business.jsp?str="+str).forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}//do post
	public void init() throws ServletException {
		// Put your code here
	}

}
