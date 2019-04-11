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
@WebServlet("/homepageTwo")
public class homepageTwo extends HttpServlet {

	public homepageTwo() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    Object HTMLCname = request.getSession().getAttribute("Jname"); //浠巋omepage椤甸潰get Jname鍊�      
		    Object HTMLAdress = request.getSession().getAttribute("JCondition"); //浠巋omepage椤甸潰get JCondition鍊� 
		      String Cno[] = new String[10000];                              //瀹氫箟鏁扮粍
		      String Jno[] = new String[10000];
		      String Jname[] = new String[10000];  
		      String JSalary[] = new String[10000];
		      String JCondition[] = new String[10000];     
		      int Cno_point=0;
		    if(HTMLCname==null)
		    {
		    	HTMLCname="珠海|全职|2人";
		    }
		    if(HTMLAdress==null)
		    {
		    	HTMLAdress="珠海|全职|2人";
		    }
		    		
		    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
		    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
		    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
		    String password = "123456";         
		    try 
		    {                                                                  // 鍔犺浇椹卞姩绋嬪簭  
		      Class.forName(driver); 
		      Connection conn = DriverManager.getConnection(url, user, password); // 杩炵画鏁版嵁搴�  
		      
		      ResultSet rs = conn.prepareStatement("select Cno,Jno,Jname,JSalary,JCondition "
		      		+ "from job_Info "
		      		+ "where JCondition like'"+HTMLAdress+"' or Jname like'"+HTMLCname+"'").executeQuery();//鏌ヨ
		     
		                                                  //瑙勫畾job_point鍙橀噺
		      while(rs.next())                                               //灏嗘煡璇㈠埌鐨凧no璧嬪�肩粰鏁扮粍
		       {
		    	job_Info job_Info= new job_Info();
		    	Cno[Cno_point]=rs.getString("Cno");
		    	Jno[Cno_point]=rs.getString("Jno");
		    	Jname[Cno_point]=rs.getString("Jname");
		    	JSalary[Cno_point]=rs.getString("JSalary");
		    	JCondition[Cno_point]=rs.getString("JCondition");
		    	Cno_point =Cno_point+1;
		    	}
		   //   conn.prepareStatement("update insert deletexxx").execute();                                  //澧炲垹鏀�
		    
		    }
		    catch(Exception e)
		    {  
		        System.out.println("Succeeded connecting Not to the Database!");  
		        e.printStackTrace();          
		    }
		   
		      request.setAttribute("Cno", Cno);
		      request.setAttribute("Jno", Jno);
		      request.setAttribute("Jname", Jname);
		      request.setAttribute("JSalary", JSalary);
		      request.setAttribute("JCondition", JCondition);
		      request.setAttribute("Cno_point", Cno_point);
			  request.getRequestDispatcher("homepage.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		doGet(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
