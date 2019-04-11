package reserve;
/*浼佷笟鍒涘缓鎷涜仒淇℃伅 */
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
@WebServlet("/ComFour")
public class ComFour extends HttpServlet {
	public ComFour() {
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
	String HTMLusername     = request.getSession().getAttribute("sno").toString();      //浠庣櫥褰曢〉闈et sno鍊�
	String HTMLjno          = request.getSession().getAttribute("jno").toString();      //浠庣櫥褰曢〉闈et jno鍊�
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
	String HTMLmomey        = new String(request.getParameter("momey")        .toString().getBytes("utf-8"),"utf-8");//16宸ヨ祫
	String HTMLage          = new String(request.getParameter("age")          .toString().getBytes("utf-8"),"utf-8");//17骞撮緞
	job_Info job_Info= new job_Info();
	    
	    String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    
	    try 
	      {                                                                               // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);             // 杩炵画鏁版嵁搴�  
	      conn.prepareStatement( "update job_info "                                      
		      		+ "set  "
		      		+ "Jname='"+HTMLposition_name+"',"
		      		+ "JSalary='"+HTMLmomey+"',            JCondition='"+HTMLcondition+"', JWorkExp='"+HTMLtime+"',            "
		      		+ "JEduRequire='"+HTMLeducational+"',  JAgeRequire='"+HTMLage+"',      JLanRequire='"+HTMLlanguage+"',     " 
		      		+ "JJobType='"+HTMLposition+"',        JSalaryStru='"+HTMLwages+"',    JPositionState='"+HTMLduties+"',    "
		      		+ "JJobRequire='"+HTMLrequirements+"', JASSET='"+HTMLcom_size+"',      JComStrength='"+HTMLcom_strength+"',"
		      		+ "Linkman='"+HTMLcontact_name+"',     LinkTel='"+HTMLcontact_phone+"',LinkE_mail='"+HTMLcontact_email+"', "
		      		+ "AddTime='"+HTMLdate+"' "
		      		+ "where Jno='"+HTMLjno+"'and Cno='"+HTMLusername+"'; " ).execute();   //鏍规嵁Jno Cno淇敼鎷涜仒淇℃伅  
	      ResultSet rs = conn.prepareStatement("select "
	    		    + "Jno,          Cno,         Jname,"
		      		+ "JSalary,      JCondition,  JWorkExp,"
		      		+ "JEduRequire,  JAgeRequire, JLanRequire," 
		      		+ "JJobType,     JSalaryStru, JPositionState,"
		      		+ "JJobRequire,  JASSET,      JComStrength,"
		      		+ "Linkman,      LinkTel,     LinkE_mail,"
		      		+ "AddTime " 
                + "from job_info "
                + "where Jno='"+HTMLjno+"' and Cno='"+HTMLusername+"'; ").executeQuery();  //鏍规嵁Jno Cno鏌ユ壘鏁版嵁
	      while(rs.next())                                                                
	        {
	    	
	    	
	    	job_Info.setJname(rs.getString("Jname"));
	    	job_Info.setJSalary(rs.getString("JSalary"));
	    	job_Info.setJCondition(rs.getString("JCondition"));
	    	job_Info.setJWorkExp(rs.getString("JWorkExp"));
	    	job_Info.setJEduRequire(rs.getString("JEduRequire"));
	    	job_Info.setJAgeRequire(rs.getString("JAgeRequire"));
	    	job_Info.setJLanRequire(rs.getString("JLanRequire"));
	    	job_Info.setJJobType(rs.getString("JJobType"));
	    	job_Info.setJSalaryStru(rs.getString("JSalaryStru"));
	    	job_Info.setJPositionState(rs.getString("JPositionState"));
	    	job_Info.setJJobRequire(rs.getString("JJobRequire"));
	    	job_Info.setJASSET(rs.getString("JASSET"));
	    	job_Info.setJComStrength(rs.getString("JComStrength"));
	    	job_Info.setLinkman(rs.getString("Linkman"));
	    	job_Info.setLinkTel(rs.getString("LinkTel"));
	    	job_Info.setLinkEmail(rs.getString("LinkE_mail"));
	    	job_Info.setAddTime(rs.getString("AddTime"));
	        }//while                                               		
           } //try
	    catch(Exception e)
	      { System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	      }//catch
	    request.setAttribute("job_Info", job_Info);
		request.getRequestDispatcher("comThree.jsp").forward(request, response);
	}//dopast
	public void init() throws ServletException {
		// Put your code here
	}

}