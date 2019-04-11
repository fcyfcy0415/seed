 package reserve;

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
@WebServlet("/personalThree")
public class personalThree extends HttpServlet {

	public personalThree() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String HTMLusername = request.getSession().getAttribute("sno").toString();         //浠庣櫥褰曢〉闈et sno鍊�
	                         //type = rs.getString("count(*)");
	  
	   job_Info job_Info = new job_Info();
	   String HTMLJno  = new String(request.getSession().getAttribute("Jno").toString().getBytes("UTF-8"),"UTF-8");
	   String HTMLCno= new String(request.getParameter("Cno").getBytes("GB2312"),"utf-8");
	   System.out.println(HTMLJno);
	   String CuowuOne="error Incorrect username or password";
	   String type=null;
	   String HTMLphone=request.getParameter("phone");
	   String HTMLemail=request.getParameter("email");
	   
	   System.out.println("htmljNO"+HTMLJno);
	  
	    String driver = "com.mysql.jdbc.Driver";                                           //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                              // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password ="123456";         

	    boolean flag=false;
	    boolean tal=false;
	    String regex1 = "";
        Pattern p;
        Matcher m;
	    if ( HTMLemail == null) {
	    	flag=false;
	    	}else {
	    	regex1="[a-z0-9A-Z]+@[a-z0-9A-Z]+.[a-z0-9A-Z]+";
	                  p = Pattern.compile(regex1);
	                  m = p.matcher( HTMLemail);
	          if (m.matches()) {   
	        	  flag=true;}                                     
	    }
      if ( HTMLphone == null) {
	    	   tal=false;}else {
	          regex1 = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
                       p = Pattern.compile(regex1);
	                   m = p.matcher(HTMLphone);
	                 if (m.matches()) {          
	                   tal=true;}
	    	   }   
	    Connection conn =null;
	   
	   try{

		   Class.forName(driver);  
           conn = DriverManager.getConnection(url, user, password);   // 杩炵画鏁版嵁搴�  
         
           if(flag==true&&tal==true) {
           
           String SQL = "select  count(*) "	     	    		    
                   + "from ALLS WHERE "
                   + "Cno='"+HTMLCno+"' and Jno='"+HTMLJno+"' and Sno='"+HTMLusername+"'";
           System.out.println(SQL);
           ResultSet rss = conn.prepareStatement(SQL).executeQuery();
      
           while(rss.next()) 
  	         {
  	    	  type = rss.getString("count(*)");
  	    	 }
      		  if(type.equals("0")) {
    		      CuowuOne="您提交成功，请等待企业审核";
    		   conn.prepareStatement("insert "
    		   		+ "into alls (Jno,Cno,Sno) "
    		   		+ "values('"+HTMLJno+"','"+HTMLCno+"','"+HTMLusername+"')").execute(); 
    		
    		   }//if2
    		   else 
    		   {
    			   CuowuOne="您不能多次应聘同一岗位";
    		   }//else2
           }//if1
           else 
           {
        	   CuowuOne="请您前往个人简历页面填写简历";
           }//else1
	   }//try
	   catch(Exception e)
	      {  
	        //System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	      }
	   System.out.println(HTMLCno);
	   System.out.println(HTMLJno);
	   System.out.println(HTMLusername);
	   System.out.println(CuowuOne);
	   System.out.println(type);
	   request.setAttribute("job_Info",job_Info);
	   request.setAttribute("Jno",new String(HTMLJno));
	   request.setAttribute("Cno",HTMLCno);
	   request.setAttribute("CuowuOne", CuowuOne);
	   request.getRequestDispatcher("TiJiaoJianLi.jsp").forward(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
