package reserve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class javatest {
public static void main(String[] args) {
	//String HTMLusername =request.getSession().getAttribute("sno").toString();   //从登录页面get sno值 
	//String HTMLrep_name =new String(request.getParameter("rep_name")   .toString().getBytes("ISO8859-1"),"utf-8");
	String driver = "com.mysql.jdbc.Driver";                                          //驱动程序名  
    String url = "jdbc:mysql://127.0.0.1:3306/seed?characterEncoding=UTF-8";          // URL指向要访问的数据库名Test  
    String user = "root";                                                             // MySQL配置时的用户名  
    String password = "";                                                             // Java连接MySQL配置时的密码  
    try {         // 加载驱动程序  
    Class.forName(driver);  
    Connection conn = DriverManager.getConnection(url, user, password);// 连续数据库  
    ResultSet rs = conn.prepareStatement("select * from admin_info").executeQuery();
    conn.prepareStatement("update insert deletexxx").execute();      //增删改
    
    while(rs.next()){
    	System.out.println(rs.getString("Aname"));
    }
    }catch(Exception e){  
        System.out.println("Succeeded connecting Not to the Database!");  
        e.printStackTrace();          
    }  
      
  }  
}
//disabled="disabled"
//<% out.print(resum.getSno()); %>
//doPost(request,response);