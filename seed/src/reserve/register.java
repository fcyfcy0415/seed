package reserve;
/* 浼佷笟娉ㄥ唽  */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class register extends HttpServlet {                                                         // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
  
	public register() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	doPost(request,response);
    	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    boolean flag=false;
	    boolean tal=false;
        seeker_Info seeker_Info=new seeker_Info();
		String HTMLSname  = new String( request.getParameter("Sname")   .toString().getBytes("utf-8"),"utf-8");   //鐢ㄦ埛濮撳悕
        String HTMLSex    = new String(request.getParameter("Sex")      .toString().getBytes("utf-8"),"utf-8");   //鎬у埆
        String HTMLCTel   = new String( request.getParameter("STel")    .toString().getBytes("utf-8"),"utf-8");   //鐢ㄦ埛鐢佃瘽
        String HTMLS_E_Mail=new String( request.getParameter("S_E_Mail").toString().getBytes("utf-8"),"utf-8");   //鐢ㄦ埛閭
        String HTMLPasswork=new String( request.getParameter("Passwork").toString().getBytes("utf-8"),"utf-8");   //瀵嗙爜
        String HTMLTwo_passwork=new String( request.getParameter("Two_passwork").toString().getBytes("utf-8"),"utf-8");
        String HTMLusername = request.getParameter("str");                               // Sno鍊�                                                                                  
    	System.out.println(HTMLSex);
      
    	String nextjsp="login.jsp";
        String type=null;
        String CuowuOne="error Incorrect username or password";
    	
        String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";  
	    String regex1 = "";
        Pattern p;
        Matcher m;
	    if ( HTMLS_E_Mail == null) {
	    	flag=false;
	    	}else {
	    	regex1="[a-z0-9A-Z]+@[a-z0-9A-Z]+.[a-z0-9A-Z]+";
	                  p = Pattern.compile(regex1);
	                  m = p.matcher( HTMLS_E_Mail);
	          if (m.matches()) {   
	        	  flag=true;}                                     
	    }
      if ( HTMLCTel == null) {
	    	   tal=false;}else {
	          regex1 = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
                       p = Pattern.compile(regex1);
	                   m = p.matcher(HTMLCTel);
	                 if (m.matches()) {          
	                   tal=true;}
	    	   }   
      System.out.println("tal"+tal);
      System.out.println("flag"+flag);
	    try 
	     {                                                                  // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                          // 杩炵画鏁版嵁搴�  
	      if(HTMLPasswork.equals(HTMLTwo_passwork)) 
	        {
	        	if(HTMLPasswork.length()>5&&HTMLPasswork.length()<9) 
	        	{
	        		 ResultSet rs = conn.prepareStatement("select  count(*) "	     	    		    
	                     + "from seeker_info  "
	                     + "where STel='"+HTMLCTel+"' or S_E_Mail='"+HTMLS_E_Mail+"'; ").executeQuery();
	        		 while(rs.next()) 
	    	         {
	    	    	  type = rs.getString("count(*)");
	    	    	 }
	        		 if(type.equals("0"))
	    	         {   
	        			 if(flag==true&&tal==true) {
	        			 conn.prepareStatement("insert "
	        			      		+ "into seeker_Info "
	        			      		+ "("
	        			      		+ "Sname,  Passwork,   Sex,     "
	        			      		+ "Sno,     STel,      S_E_Mail "
	        			      		+ ") "
	        			      		+ "values("
	        			      		+ "'"+HTMLSname+"',   '"+HTMLPasswork+"','"+HTMLSex+"',    "
	        			      		+ "'"+HTMLusername+"','"+HTMLCTel+"',    '"+HTMLS_E_Mail+"'  "
	        			      		+ ") ").execute();    
	        			 CuowuOne="您注册成功了，您的帐号是"+HTMLusername;		 
   	        	         nextjsp="fail.jsp";
	        			 }//if4
	        			 else 
	        			 {
	        				  CuowuOne="您的手机 或邮箱 不合法";		 
	    	        	      nextjsp="fail.jsp";  
	        			 }//else4
	    	          }//if3
	        		 else
	        		 {
	        	      CuowuOne="您的手机 或邮箱 已被注册";		 
	        	      nextjsp="fail.jsp"; 
	        		 }//else3
	        	}//if2
	        	else 
	        	{
	        		CuowuOne="密码应为6位到8位之间 包括6位，8位";
	        		nextjsp="fail.jsp"; 		
	        	}//else2
	        }//if1
	      else 
	      {
	    	 CuowuOne="两次输入密码不一致" ;
	    	 nextjsp="fail.jsp"; 
	      }
	     }//try
	    catch(Exception e)
	     {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	     }//catch

	    request.setAttribute("CuowuOne", CuowuOne);
	    request.getRequestDispatcher(nextjsp).forward(request, response);
	}//do post
	public void init() throws ServletException {
		// Put your code here
	}

}
