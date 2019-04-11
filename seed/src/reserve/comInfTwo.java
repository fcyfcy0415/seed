package reserve;
/* comInf.jsp(浼佷笟淇℃伅椤甸潰)閫昏緫鍒ゆ柇 */
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
@WebServlet("/comInfTwo")
public class comInfTwo extends HttpServlet {
	public comInfTwo() {
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
		employer_Info employer_Info = new employer_Info();
		String HTMLusername               =request.getSession().getAttribute("sno").toString();   //浠庣櫥褰曢〉闈et sno鍊�
		String HTMLcom_address            =new String(request.getParameter("com_address").toString().getBytes("ISO8859-1"),"utf-8");//鍏徃鍦板潃
		String HTMLcname                  =new String(request.getParameter("Cname")      .toString().getBytes("ISO8859-1"),"utf-8");//鍏徃鍚�
		String HTMLrep_name               =new String(request.getParameter("rep_name")   .toString().getBytes("ISO8859-1"),"utf-8");//娉曚汉浠ｈ〃
		String HTMLpasswork               =request.getParameter("passwork");                      //瀵嗙爜
		String HTMLcom_confirm_password   =request.getParameter("com_confirm_password");          //淇敼瀵嗙爜
		String HTMLconfirm_modify_passwork=request.getParameter("confirm_modify_passwork");       //纭淇敼瀵嗙爜
		String HTMLcom_license            =request.getParameter("com_license");                   //钀ヤ笟鎵х収鍙风爜
		String HTMLcom_email              =request.getParameter("com_email");                     //閭
		String HTMLcom_phone              =request.getParameter("com_phone");                     //鍏徃鐢佃瘽
		
		String driver = "com.mysql.jdbc.Driver";                                          //椹卞姩绋嬪簭鍚�  
	    String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8";          // URL鎸囧悜瑕佽闂殑鏁版嵁搴撳悕Test  
	    String user = "root";                                                             // MySQL閰嶇疆鏃剁殑鐢ㄦ埛鍚�  
	    String password = "123456";                                                             // Java杩炴帴MySQL閰嶇疆鏃剁殑瀵嗙爜  
	    try 
	    {                                                                                         // 鍔犺浇椹卞姩绋嬪簭  
	      Class.forName(driver);  
	      Connection conn = DriverManager.getConnection(url, user, password);                     // 杩炵画鏁版嵁搴�
	      if(HTMLcom_confirm_password.equals(HTMLconfirm_modify_passwork))
	      {
	      conn.prepareStatement("update employer_Info "                                           //淇敼浼佷笟淇℃伅鏁版嵁
	              + "set "
	              + "passwork=   '"+HTMLcom_confirm_password+"'     ,Cname= '"+HTMLcname+"'      ,"
	              + "Cadress=    '"+HTMLcom_address+"'              ,Clegal='"+HTMLrep_name+"'   ,"
	              + "CTel=       '"+HTMLcom_phone+"'                ,Licno= '"+HTMLcom_license+"',"
	              + "E_E_Mail=   '"+HTMLcom_email+"'                                              "
	              + " where Cno= '"+HTMLusername+"'").execute();                                  
	      ResultSet rs = conn.prepareStatement("select "                                          //鏌ヨ浼佷笟淇℃伅鏁版嵁  
	      		+ "Ename  ,passwork ,Cname   ,"
	      		+ "Cno    ,Cadress  ,Clegal  ,"
	      		+ "CTel   ,Licno    ,E_E_Mail "
	      		+ "from employer_info "
	      		+ "where cno='"+HTMLusername+"';").executeQuery();                              //鏌ヨ
	      //conn.prepareStatement("update insert deletexxx").execute();                             //澧炲垹鏀�
	    
	    
	    while(rs.next()) 
	        {
	    	employer_Info.setCadress (rs.getString("Cadress") );
	    	employer_Info.setClegal  (rs.getString("Clegal")  );
	    	employer_Info.setCname   (rs.getString("Cname")   );
	    	employer_Info.setCno     (rs.getString("Cno")     );
	    	employer_Info.setCTel    (rs.getString("CTel")    );
	    	employer_Info.setE_E_Mail(rs.getString("E_E_Mail"));
	    	employer_Info.setEname   (rs.getString("Ename")   );
	    	employer_Info.setLicno   (rs.getString("Licno")   );
	    	employer_Info.setPasswork(rs.getString("passwork"));
	         }  //while
	      }//if
	      else
	      {ResultSet rs = conn.prepareStatement("select "                                          //鏌ヨ浼佷笟淇℃伅鏁版嵁  
		      		+ "Ename  ,passwork ,Cname   ,"
		      		+ "Cno    ,Cadress  ,Clegal  ,"
		      		+ "CTel   ,Licno    ,E_E_Mail "
		      		+ "from employer_info "
		      		+ "where cno='"+HTMLusername+"';").executeQuery();                              //鏌ヨ

		    while(rs.next()) 
		        {
		    	employer_Info.setCadress (rs.getString("Cadress") );
		    	employer_Info.setClegal  (rs.getString("Clegal")  );
		    	employer_Info.setCname   (rs.getString("Cname")   );
		    	employer_Info.setCno     (rs.getString("Cno")     );
		    	employer_Info.setCTel    (rs.getString("CTel")    );
		    	employer_Info.setE_E_Mail(rs.getString("E_E_Mail"));
		    	employer_Info.setEname   (rs.getString("Ename")   );
		    	employer_Info.setLicno   (rs.getString("Licno")   );
		    	employer_Info.setPasswork(rs.getString("passwork"));
		         }  //while
	      }
	    }       //try
	    catch(Exception e)
	       {  
	        System.out.println("Succeeded connecting Not to the Database!");  
	        e.printStackTrace();          
	        }   //catch
	    request.setAttribute("employer_Info",employer_Info);
		request.getRequestDispatcher("comInf.jsp").forward(request, response);
	}//doPast
	public void init() throws ServletException {
		// Put your code here
	}
}
