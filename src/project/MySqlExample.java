package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlExample {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://doadmin:nvxvc24irofl66ym@projectdb-do-user-8049100-0.b.db.ondigitalocean.com:25060/Customer?ssl-mode=REQUIRED");
			
			String query = "SELECT * FROM Customer_Name";
			
			Statement stmt = conn.createStatement();
			
			ResultSet result = stmt.executeQuery(query);
			
			while (result.next())
			{
				 int id = result.getInt("ID");
				 String firstName = result.getString("FirstName");
				 String lastName = result.getString("LastName");
		        
				 // print the results
				 System.out.format("%s, %s, %s\n", id, firstName, lastName);
			}
		      stmt.close();
			}
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		}

	}
