package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class db {
	   public static void main(String[] args) {
				
		  try{

		  //Class.forName("com.mysql.jdbc.Driver");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","1234");
		 
		  String sql = "INSERT INTO login (id, name, age) VALUES (?, ?, ?)";
		  
		  PreparedStatement statement = con.prepareStatement(sql);
		  statement.setInt(1, 4);
		  statement.setString(2, "Hulk");
		  statement.setInt(3, 28);
		  statement.setString(4, "MAS");  
		  
		  int rowsInserted = statement.executeUpdate();
		 
		  System.out.println("A new user was inserted successfully!");
		          
		 
		  
		  }catch (Exception e)
		  {
			  System.out.println(e);
		  }
		  
	  } 

	}