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
@WebServlet("/Comtwo")
public class Comtwo extends HttpServlet {
	public Comtwo() {
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
	String HTMLusername = request.getSession().getAttribute("sno").toString();            //浠庣櫥褰曢〉闈et sno鍊�
   
	
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    try 
	      {                                                                               // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      String job[] = new String[10000];                                               //瀹氫箟鏁扮粍
	      int job_point=0;                                                                //瑙勫畾job_point鍙橀噺
	      Connection conn = DriverManager.getConnection(url, user, password);             // 杩炵画鏁版嵁搴�  
	      ResultSet rs = conn.prepareStatement("select Jno "
                  + "from job_info "
                  + "where Cno='"+HTMLusername+"'").executeQuery();
	      while(rs.next())                                                                //灏嗘煡璇㈠埌鐨凧no璧嬪�肩粰鏁扮粍
	       {
	    	job_Info job_Info= new job_Info();
	    	job[job_point]=rs.getString("jno");
	    	job_point =job_point+1;
	    	
	       }

	    request.setAttribute("job", job);
	    request.setAttribute("job_point", job_point);                                                  
	      } //try
	    catch(Exception e)
	      { System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();   
	      }
		request.getRequestDispatcher("comTwo.jsp").forward(request, response);
	}//dopast
	public void init() throws ServletException {
		// Put your code here
	}

}
