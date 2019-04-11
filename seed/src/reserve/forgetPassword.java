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
@WebServlet("/forgetPassword")
public class forgetPassword extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public forgetPassword() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String driver = "com.mysql.jdbc.Driver";                           //驱动程序名  
	    String url = "jdbc:mysql://127.0.0.1:3306/seed";                   // URL指向要访问的数据库名Test  
	    String user = "root";                                              // MySQL配置时的用户名  
	    String password = "135132fcy";                                     // Java连接MySQL配置时的密码  
	    try 
	    {                                                                   // 加载驱动程序  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                          // 连续数据库  
	      ResultSet rs = conn.prepareStatement("select into user (username) values ()").executeQuery();//查询
	      conn.prepareStatement("update insert deletexxx").execute();                                  //增删改
	    
	    
	    while(rs.next()) {
	    	                                                               //type = rs.getString("count(*)");
	    	                                                                //JobBean.setRen(rs.getString("nre"));
	    }
	    
	    
	    
	    
	    
	    }catch(Exception e){  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	    }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
