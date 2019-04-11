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
@WebServlet("/business")
public class business extends HttpServlet {
	public business() {
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
		request.setCharacterEncoding("utf-8");
        employer_Info employer_Info=new employer_Info();
        
        String HTMLCname  = new String( request.getParameter("Cname")   .toString().getBytes("utf-8"),"utf-8");   //鍏徃鍚嶇О
        String HTMLEname  = new String( request.getParameter("Ename")   .toString().getBytes("utf-8"),"utf-8");   //鑱旂郴浜哄鍚�
        String HTMLCTel   = new String( request.getParameter("CTel")    .toString().getBytes("utf-8"),"utf-8");   //鍏徃鐢佃瘽
        String HTMLE_E_Mail=new String( request.getParameter("E_E_Mail").toString().getBytes("utf-8"),"utf-8");   //鍏徃閭
        String HTMLCadress= new String( request.getParameter("Cadress") .toString().getBytes("utf-8"),"utf-8");   //鍏徃鍦板潃
        String HTMLClegal = new String( request.getParameter("Clegal")  .toString().getBytes("utf-8"),"utf-8");   //娉曚汉浠ｈ〃
        String HTMLLicno  = new String( request.getParameter("Licno")   .toString().getBytes("utf-8"),"utf-8");   //钀ヤ笟鎵х収缂栫爜
        String HTMLPasswork=new String( request.getParameter("Passwork").toString().getBytes("utf-8"),"utf-8");   //瀵嗙爜
        String HTMLcom_confirm_password=new String( request.getParameter("com_confirm_password").toString().getBytes("utf-8"),"utf-8");
        String HTMLusername = request.getSession().getAttribute("Cno").toString();                                // Cno鍊�                                                                                  
       
        String nextjsp="fail.jsp";
        String type=null;
        String CuowuOne="error Incorrect username or password";
        Pattern p;
        Matcher m;
        boolean flag=false;
	    boolean tal=false;    
	    String regex1 = "";
        if ( HTMLE_E_Mail == null) 
              {flag=false;}
              else 
              {
   	             regex1="[a-z0-9A-Z]+@[a-z0-9A-Z]+.[a-z0-9A-Z]+";
                 p = Pattern.compile(regex1);
                 m = p.matcher(HTMLE_E_Mail);
              if (m.matches()) 
                  {flag=true;}                                     
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
   
    	
        String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    try 
	     {                                                                  // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                          // 杩炵画鏁版嵁搴�  
	      if(HTMLPasswork.equals(HTMLcom_confirm_password)) 
	      {
	    	if(flag==true&&tal==true) 
	    	  {
	    		 ResultSet rs = conn.prepareStatement("select  count(*) "	     	    		    
	                     + "from   employer_Info "
	                     + "where CTel='"+HTMLCTel+"' or E_E_Mail='"+HTMLE_E_Mail+"'; ").executeQuery();
	        		 while(rs.next()) 
	    	         {
	    	    	  type = rs.getString("count(*)");
	    	    	 }
	    		if(type.equals("0"))
	    		  {
	              conn.prepareStatement("insert "
	      		    + "into employer_info "
	      		    + "(Ename,  passwork,  Cname,   "
	      		    + "Cno,     Cadress,   Clegal,  "
	      		    + "CTel,    Licno,     E_E_Mail)"
	      		    + "values("
	      	    	+ "'"+HTMLEname+"',   '"+HTMLPasswork+"','"+HTMLCname+"',   "
	      		    + "'"+HTMLusername+"','"+HTMLCadress+"', '"+HTMLClegal+"',  "
	      		    + "'"+HTMLCTel+"',    '"+HTMLLicno+"',   '"+HTMLE_E_Mail+"' "
	      		    + ") ").execute();  
	              CuowuOne="您";		 
        	      nextjsp="fail.jsp"; 
	    		 }//if3
	    		 else 
	    		 {
	    			  CuowuOne="您的手机 或邮箱 已被注册";		 
	        	      nextjsp="fail.jsp"; 
	    		 }//else3
	    	}//if2
	    	else 
	    	{
	    		  CuowuOne="您的手机 或邮箱 不合法";		 
        	      nextjsp="fail.jsp";  
	    	}//else2判断邮箱电话是否合法
	    }//if1
	    else 
	    {
	    	 CuowuOne="两次输入密码不一致" ;
	    	 nextjsp="fail.jsp"; 
	    }//else1
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
