package reserve.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import reserve.dao.DBUtils;

public class DBTest {
	public static void main(String[] args) {
		ResultSet rs = DBUtils.find("select Cno,Jno,Jname,JSalary,JCondition from job_Info where JCondition like'珠海|全职|2人'  or Jname like '珠海|全职|2人'", null);
		try {
			System.out.print(rs.getRow());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
