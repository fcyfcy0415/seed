package reserve;
/* information.jsp(鐢ㄦ埛涓汉淇℃伅)椤甸潰閫昏緫鍒ゆ柇 */
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
@WebServlet("/information")
public class information extends HttpServlet {
	public information() {
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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    seeker_Info seeker_Info = new seeker_Info(); 
	    System.out.println("HTMLusername"+request.getSession().getAttribute("sno"));
		String HTMLusername = request.getSession().getAttribute("sno").toString();         //浠庣櫥褰曢〉闈et sno鍊�
		String HTMLpasswork = request.getParameter("passwork");                            //瀵嗙爜
		String HTMLmodify_passwork=request.getParameter("modify_passwork");                //淇敼瀵嗙爜
		String HTMLconfirm_modify_passwork=request.getParameter("confirm_modify_passwork");//纭淇敼瀵嗙爜
		String HTMLname=new String(request.getParameter("name").toString().getBytes("ISO8859-1"),"utf-8");//瀛楃绫诲瀷
		String HTMLsex=request.getParameter("sex");
		String HTMLphone=request.getParameter("phone");
		String HTMLemail=request.getParameter("email");
		String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	   
	    boolean flag=false;
	    boolean tal=false;
	    String nextjsp="login.jsp";
        String type=null;
        String CuowuOne="error Incorrect username or password";
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
      System.out.println("tal"+tal);
      System.out.println("flag"+flag);
	    try 
	    {                                                                                    // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);               // 杩炵画鏁版嵁搴�
	      if(flag==true&&tal==true) {
	      conn.prepareStatement("update seeker_Info "
		          + "set passwork='"+HTMLmodify_passwork+"',Sname=   '"+HTMLname+"',   Sex='"+HTMLsex+"',"
		          + "    STel=    '"+HTMLphone+"'          ,S_E_Mail='"+HTMLemail+"'                     "
		          + "where sno=   '"+HTMLusername+"'").execute();                           //澧炲垹鏀�  
	        CuowuOne="修改成功";
	      }
	      else {
	    	  CuowuOne="修改失败";
	      }
	   /*   ResultSet rs = conn.prepareStatement("select "
	      		+ "sno,   sname,      stel     ,"
	      		+ "sex,   S_E_Mail,   Passwork  "
	      		+ "from   seeker_Info "
	     	    + "where  sno="+HTMLusername+"").executeQuery();//鏌ヨ
	     while(rs.next()) 
	       {
	    	seeker_Info.setSno(rs.getString("sno"));
	    	seeker_Info.setEmail(rs.getString("S_E_Mail"));
	    	seeker_Info.setSex(rs.getString("sex"));
	    	seeker_Info.setpasswork(rs.getString("Passwork"));
	    	seeker_Info.setSname(rs.getString("Sname"));
	    	seeker_Info.setStel(rs.getString("Stel"));
	       } */
	  }
	    catch(Exception e)
	        {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();           
	        }
	    request.setAttribute("CuowuOne", CuowuOne);
	    request.setAttribute("seeker_Info", seeker_Info);                                    //浼犳暟鍊�
		request.getRequestDispatcher("informationSuccessjsp.jsp").forward(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
