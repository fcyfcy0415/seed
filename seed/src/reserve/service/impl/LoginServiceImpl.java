package reserve.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reserve.job_Info;
import reserve.seeker_Info;
import reserve.dao.DBUtils;
import reserve.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public Boolean login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		job_Info job_Info = new job_Info();
		String Cno[] = new String[10000];
		String Jno[] = new String[10000];
		String Jname[] = new String[10000];
		String JSalary[] = new String[10000];
		String JCondition[] = new String[10000];
		int Cno_point = 0;
		String homepage = "homepage.jsp";
		String CuowuOne = "error Incorrect username or password";
		String type = "0";
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Authentication");
		String HTMLusername = request.getParameter("username");
		String HTMLpassword = request.getParameter("password");
		/*
		 * $.get("http://localhost:8080/login?username=username&password=password",{
		 * username:username,password:password},function(result){ //TODO });
		 */
		String param[] = new String[2];
		param[0] = HTMLusername;
		param[1] = HTMLpassword;
		String sql = "select count(*) from seeker_Info where sno=? and passwork=?";
		ResultSet rs = DBUtils.find(sql, param);
		String HTMLpanduan = request.getParameter("panduan");
		if (HTMLpanduan.equals("qiye")) {
			homepage = "com.jsp";
		} else {
			homepage = "homepage.jsp";
		}
		seeker_Info seeker_Info = new seeker_Info();
		while (rs.next()) {
			type = rs.getString("count(*)");
		}
		if (homepage.equals("homepage.jsp")) {
			sql = "select Cno,Jno,Jname,JSalary,JCondition from job_Info where JCondition like'珠海|全职|2人'  or Jname like '珠海|全职|2人'";
			rs = DBUtils.find(sql, null);
			while (rs.next()) {
				Cno[Cno_point] = rs.getString("Cno");
				Jno[Cno_point] = rs.getString("Jno");
				Jname[Cno_point] = rs.getString("Jname");
				JSalary[Cno_point] = rs.getString("JSalary");
				JCondition[Cno_point] = rs.getString("JCondition");
				Cno_point = Cno_point + 1;
			}
			if (type.equals("0")&&false) {// fail
				CuowuOne = "用户名或密码错误";
				request.setAttribute("CuowuOne", CuowuOne);
				request.getRequestDispatcher("fail.jsp").forward(request, response);
			} else {// success
				System.out.println(Cno_point);
//				request.getSession().setAttribute("sno", HTMLusername);
//				request.setAttribute("seeker_Info", seeker_Info);
//				request.setAttribute("Cno", Cno);
//				request.setAttribute("Jno", Jno);
//				request.setAttribute("Jname", Jname);
//				request.setAttribute("JSalary", JSalary);
//				request.setAttribute("JCondition", JCondition);
//				request.setAttribute("Cno_point", Cno_point);

				response.setCharacterEncoding("UTF-8");

				// 指定浏览器以什么码表打开浏览器发送的数据
				// response.setHeader("content-type", "text/html;charset=UTF-8");
				response.setContentType("text/html;charset=UTF-8");
				// 上面那句话间接的包含了setCharacterEncoding("UTF-8");
				String data = "中国";

				PrintWriter out = response.getWriter();
				// writer流只能写字符或者字符串（写字节流的东西不行）
				System.out.print("111");
				out.write("111");
				out.flush();
				out.close();

//				request.getRequestDispatcher(homepage).forward(request, response);
			}
		}
		return null;
	}

}
