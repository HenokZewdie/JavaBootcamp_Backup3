import java.sql.*;
import java.util.Scanner;

public class DBConnection{  
	public static void main(String [] args){  
		try{  

			int ID;
			String FName, LName;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Student ID");
			ID = input.nextInt();
			input.nextLine();
			System.out.println("Enter First Name");
			FName = input.nextLine();
			
			System.out.println("Enter Last Name");
			LName = input.nextLine();


			Class.forName("com.mysql.jdbc.Driver");  
			//System.out.println("Test");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Education","root","password");  
			String query = ("INSERT into `Education`.`student`(`Stu_ID`, `F_Name`, `L_Name`) VALUES (?, ?, ?)");
			PreparedStatement preparedStmt = con.prepareStatement(query);


			preparedStmt.setInt(1, ID);	
			preparedStmt.setString(2, FName);
			preparedStmt.setString(3, LName);


			preparedStmt.executeUpdate();
			System.out.println("Inserted ");
			input.close();
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  
}  