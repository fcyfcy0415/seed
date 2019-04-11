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
@WebServlet("/ComPerTwo")

public class ComPerTwo extends HttpServlet {
	public ComPerTwo() {
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
		String HTMLSno= request.getParameter("Sno");
		String HTMLJno= new String(request.getParameter("Jno").getBytes("utf-8"),"utf-8");
		String HTMLusername =request.getSession().getAttribute("sno").toString();   //浠庣櫥褰曢〉闈et sno鍊� 
		
		String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    all all=new all();
	    String Sno[] = new String[10000];                                         //瀹氫箟鏁扮粍
	    String Jno[] = new String[10000];  
	    String shoucang[] = new String[10000];                                       //瀹氫箟鏁扮粍
	    int Jno_point=0;
	    
	    String Snoo[] = new String[10000];                                         //瀹氫箟鏁扮粍
	    String Jnoo[] = new String[10000];  
	    String shoucango[] = new String[10000];                                       //瀹氫箟鏁扮粍
	    int Jnoo_point=0; 
	   
	    try 
	    {                                                                                  // 鍔犺浇椹卞姩绋嬪簭  
	     Class.forName(driver);  
	     Connection conn = DriverManager.getConnection(url, user, password);               // 杩炵画鏁版嵁搴�  
	     conn.prepareStatement("update alls"
	    		+ "set shoucang=1"
	    		+ "where Sno='"+HTMLSno+"' and Jno='"+HTMLJno+"' and Cno='"+HTMLusername+"' ; ").execute();     //鏀�
	     
	     ResultSet rs = conn.prepareStatement("select Sno,Jno,shoucang  "
		      		+ "from alls "
		      		+ "where Cno='"+HTMLusername+"' ;").executeQuery();                   //鏌ヨ
	    
		      while(rs.next())                                                               
		       {
		    	shoucang[Jno_point]=rs.getString("shoucang");
		    	Sno[Jno_point]=rs.getString("Sno");
		    	Jno[Jno_point]=rs.getString("Jno");
		    	Jno_point =Jno_point+1;
	           }//while
		      
		      ResultSet rss = conn.prepareStatement("select Sno,Jno,shoucang  "
			      		+ "from alls "
			      		+ "where Cno='"+HTMLusername+"' and shoucang='"+1+"' " ).executeQuery();                   //鏌ヨ
		      while(rss.next())                                                               
		       {
		    	shoucang[Jno_point]=rs.getString("shoucang");
		    	Sno[Jno_point]=rs.getString("Sno");
		    	Jno[Jno_point]=rs.getString("Jno");
		    	Jno_point =Jno_point+1;
		       }//while
	    }
	    catch(Exception e)
	     {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	     } 
	    request.setAttribute("Jno", Jno);
	    request.setAttribute("Sno", Sno);
	    request.setAttribute("shoucang", shoucang);
	    request.setAttribute("Jno_point", Jno_point);
	    request.setAttribute("Jno", Jnoo);
	    request.setAttribute("Sno", Snoo);
	    request.setAttribute("shoucang", shoucango);
	    request.setAttribute("Jno_point", Jnoo_point);
	    request.getRequestDispatcher("resume.jsp").forward(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
