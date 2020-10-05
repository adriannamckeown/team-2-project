package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	Connection conn = null;
	
	public Connection getConnection() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://doadmin:nvxvc24irofl66ym@projectdb-do-user-8049100-0.b.db.ondigitalocean.com:25060/Customer?ssl-mode=REQUIRED");
			return conn;
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
