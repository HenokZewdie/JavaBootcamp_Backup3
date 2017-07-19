import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class JDBCClass {

	public void prompt(String Name, String email, ArrayList<String> education, ArrayList <String> experiance, 
						ArrayList <String> skill){  
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			//System.out.println("2");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume","root","password");  
			String query = ("INSERT into Resume.tbl_Resume(Name, email, education, experiance, skill) VALUES (?, ?, ?,?,?)");
			PreparedStatement preparedStmt = con.prepareStatement(query);
			
			String[] stockArr = new String[education.size()];
			stockArr = education.toArray(stockArr);
			preparedStmt.setString(1, Name);
			preparedStmt.setString(2, email);
			PreparedStatement ps = con.prepareStatement("INSERT INTO MY_TABLE VALUES (?, ?)");
			for(education e : myList) {
			    ps.setString(1, e.getString());
			    ps.setInt(2, e.getInt());
			    ps.addBatch();
			}
			ps.executeBatch();
			
			
			
			

			for(String s : stockArr)
			    System.out.println(s);
			preparedStmt.setArray(3, (Array) education);
			preparedStmt.setArray(4, (Array) experiance);
			preparedStmt.setArray(5, (Array) skill);
			preparedStmt.executeUpdate();
			//input.close();
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	} 
}
