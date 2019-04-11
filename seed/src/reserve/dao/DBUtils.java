package reserve.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://127.0.0.1:3306/seeds?characterEncoding=UTF-8&useSSL=true&serverTimezone=GMT";
	static String user = "root";
	static String password = "123456";

	public static ResultSet find(String sql, String param[]) {
		ResultSet rs = null;
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setString(i + 1, param[i]);
				}
			}
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
