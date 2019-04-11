package reserve;
/*企业主界面 */
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
@WebServlet("/com")
public class com extends HttpServlet {
	public com() {
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
	String HTMLusername = request.getSession().getAttribute("sno").toString();                                //浠庣櫥褰曢〉闈et sno鍊�
    String HTMLposition_name= new String(request.getParameter("position_name").toString().getBytes("utf-8"),"utf-8");//1鑱屼綅鍚嶇О 
	String HTMLcondition    = new String(request.getParameter("condition")    .toString().getBytes("utf-8"),"utf-8");//2鏉′欢    
	String HTMLeducational  = new String(request.getParameter("educational")  .toString().getBytes("utf-8"),"utf-8");//3瀛﹀巻瑕佹眰
	String HTMLtime         = new String(request.getParameter("time")         .toString().getBytes("utf-8"),"utf-8");//4宸ヤ綔缁忛獙
	String HTMLlanguage     = new String(request.getParameter("language")     .toString().getBytes("utf-8"),"utf-8");//5璇█    
	String HTMLposition     = new String(request.getParameter("position")     .toString().getBytes("utf-8"),"utf-8");//6鑱屼綅绫诲埆
	String HTMLwages        = new String(request.getParameter("wages")        .toString().getBytes("utf-8"),"utf-8");//7宸ヨ祫缁撴瀯
	String HTMLduties       = new String(request.getParameter("duties")       .toString().getBytes("utf-8"),"utf-8");//8宀椾綅鑱岃矗
	String HTMLrequirements = new String(request.getParameter("requirements") .toString().getBytes("utf-8"),"utf-8");//9宀椾綅瑕佹眰  
	String HTMLcom_size     = new String(request.getParameter("com_size")     .toString().getBytes("utf-8"),"utf-8");//10鍏徃瑙勬ā    
	String HTMLcom_strength = new String(request.getParameter("com_strength") .toString().getBytes("utf-8"),"utf-8");//11鍏徃瀹炲姏
	String HTMLcontact_name = new String(request.getParameter("contact_name") .toString().getBytes("utf-8"),"utf-8");//12鑱旂郴浜哄悕
	String HTMLcontact_phone= new String(request.getParameter("contact_phone").toString().getBytes("utf-8"),"utf-8");//13鑱旂郴浜虹數璇�
	String HTMLcontact_email= new String(request.getParameter("contact_email").toString().getBytes("utf-8"),"utf-8");//14鑱旂郴浜洪偖浠�
	String HTMLdate         = new String(request.getParameter("date")         .toString().getBytes("utf-8"),"utf-8");//15鏃ユ湡
	String HTMLmomey        = new String( request.getParameter("momey")       .toString().getBytes("utf-8"),"utf-8");//16宸ヨ祫
	String HTMLage          = new String(request.getParameter("age")          .toString().getBytes("utf-8"),"utf-8");//17骞撮緞
	
	String regex1 = "";
	String nextjsp="login.jsp";
    String type=null;
    String CuowuOne="error Incorrect username or password";
	boolean flag=false;
	boolean tal=false;
	Pattern p;
    Matcher m;
    if ( HTMLcontact_email == null) {
    	flag=false;
    	}else {
    	regex1="[a-z0-9A-Z]+@[a-z0-9A-Z]+.[a-z0-9A-Z]+";
                  p = Pattern.compile(regex1);
                  m = p.matcher( HTMLcontact_email);
          if (m.matches()) {   
        	  flag=true;}                                     
    }
  if ( HTMLcontact_phone == null) {
    	   tal=false;}else {
          regex1 = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
                   p = Pattern.compile(regex1);
                   m = p.matcher(HTMLcontact_phone);
                 if (m.matches()) {          
                   tal=true;}
    	   }   
  System.out.println("tal"+tal);
  System.out.println("flag"+flag);
  
  
	String str = "";                                                                                                 //18宸ヤ綔ID 
	while(true){
		str += (int)(Math.random()*9999999);
		if(str.length() == 7){
			break;
		}
	}
	
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    try 
	      {                                                                               // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);             // 杩炵画鏁版嵁搴�  
	     
	      if(flag==true&&tal==true) {
	      String strr ="insert "                                                          //鎷涜仒淇℃伅娣诲姞
		      		+ "into job_info "
		      		+ "(Jno,         Cno,         Jname,"
		      		+ "JSalary,      JCondition,  JWorkExp,"
		      		+ "JEduRequire,  JAgeRequire, JLanRequire," 
		      		+ "JJobType,     JSalaryStru, JPositionState,"
		      		+ "JJobRequire,  JASSET,      JComStrength,"
		      		+ "Linkman,      LinkTel,     LinkE_mail,"
		      		+ "AddTime) " 
		      		+ "values("
		      		+ "'"+HTMLposition_name+str+"','"+HTMLusername+"'     ,'"+HTMLposition_name+"' ,"
		      		+ "'"+HTMLmomey+"',           '"+HTMLcondition+"'     ,'"+HTMLtime+"'          ,"
		      		+ "'"+HTMLeducational+"',     '"+HTMLage+"'           ,'"+HTMLlanguage+"'      ,"
		      		+ "'"+HTMLposition+"',        '"+HTMLwages+"'         ,'"+HTMLduties+"'        ,"
		      		+ "'"+HTMLrequirements+"',    '"+HTMLcom_size+"'      ,'"+HTMLcom_strength+"'  ,"
		      		+ "'"+HTMLcontact_name+"',    '"+HTMLcontact_phone+"' ,'"+HTMLcontact_email+"' ,"
		      		+ "'"+HTMLdate+"') ";
	      System.out.println(strr);
	      conn.prepareStatement(strr).execute();   
	      CuowuOne="发布成功";
	      }
	      else 
	      {
	    	  CuowuOne="邮箱.电话不合法";
	      }
	      } //try
	    catch(Exception e)
	      { System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	      }//catch
	    request.setAttribute("CuowuOne", CuowuOne);
		request.getRequestDispatcher("comSuccess.jsp").forward(request, response);
	}//dopast
	public void init() throws ServletException {
		// Put your code here
	}

}
