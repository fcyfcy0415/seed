package reserve;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homepage")
public class homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public homepage() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
	    String HTMLCname=new  String(request.getParameter("Cname").toString().getBytes("utf-8"),"utf-8");
	    String HTMLAdress=new String(request.getParameter("Adress").toString().getBytes("utf-8"),"utf-8");
	           
	    System.out.println(HTMLAdress);
	    System.out.println(HTMLCname);  
	      
	      String Cno[] = new String[10000];                              //瀹氫箟鏁扮粍
	      String Jno[] = new String[10000];
	      String Jname[] = new String[10000];  
	      String JSalary[] = new String[10000];
	      String JCondition[] = new String[10000];     
	      int Cno_point=0;           
	    
	      if(HTMLCname==null)
            HTMLCname="珠海|全职";
          if(HTMLAdress==null)
            HTMLAdress="珠海|全职";
	    
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
	      		+ "where JCondition like '"+HTMLAdress+""+"|__"+"' or JCondition like '"+HTMLAdress+""+"|___"+"' or Jname like '"+HTMLCname+"'; " ).executeQuery();//鏌ヨ
	     
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
	    request.getSession().setAttribute("Jname", HTMLCname);
	    request.getSession().setAttribute("JCondition", HTMLAdress);
		request.getRequestDispatcher("homepage.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
