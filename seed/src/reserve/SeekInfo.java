package reserve;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SeekInfo")
public class SeekInfo extends HttpServlet {
	public SeekInfo() {
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

		    seeker_Info seeker_Info = new seeker_Info(); 
			String HTMLusername = request.getSession().getAttribute("sno").toString();         //浠庣櫥褰曢〉闈et sno鍊�
		/*	String HTMLpasswork = request.getParameter("passwork");                            //瀵嗙爜
			String HTMLmodify_passwork=request.getParameter("modify_passwork");                //淇敼瀵嗙爜
			String HTMLconfirm_modify_passwork=request.getParameter("confirm_modify_passwork");//纭淇敼瀵嗙爜
			String HTMLname=request.getParameter("name");
			String HTMLsex=request.getParameter("sex");
			String HTMLphone=request.getParameter("phone");
			String HTMLemail=request.getParameter("email");*/
			
			String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
		    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
		    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
		    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
		  
		    try 
		    {                                                                                   // 鍔犺浇椹卞姩绋嬪簭  
		      Class.forName(driver);  
		      Connection conn = DriverManager.getConnection(url, user, password);               // 杩炵画鏁版嵁搴�
	         
		      ResultSet rs = conn.prepareStatement("select Sno,sname,stel,sex,S_E_Mail,Passwork "
		      		                             + "from seeker_Info "
		      		                             + "where Sno='"+HTMLusername+"'").executeQuery();//鏌ヨ
		     while(rs.next()) 
		       {
		    	System.out.println(rs.getString("Sname"));
		    	seeker_Info.setSno(rs.getString("Sno"));
		    	seeker_Info.setEmail(rs.getString("S_E_Mail"));
		    	seeker_Info.setSex(rs.getString("sex"));
		    	seeker_Info.setpasswork(rs.getString("Passwork"));
		    	seeker_Info.setSname(rs.getString("Sname"));
		    	seeker_Info.setStel(rs.getString("Stel"));
		       }
		    }
		     catch(Exception e)
		        {  
		         System.out.println("Succeeded connecting Not to the Database!");  
		         e.printStackTrace();          
		        }
		    request.setAttribute("seeker_Info", seeker_Info);                                    //浼犳暟鍊�
		    request.getRequestDispatcher("information.jsp").forward(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
