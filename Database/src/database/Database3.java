package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Database3 {

	public static void main(String[] args) throws Exception{
		
			
		        Class.forName("org.sqlite.JDBC");
				
				Connection con1=DriverManager.getConnection("jdbc:sqlite:C://SqLite//univ.db");
				
				
				PreparedStatement stm1=con1.prepareStatement("insert into students values(?,?,?,?)");
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("EnterStudents Data");
				int r=sc.nextInt();
				String name=sc.next();
				String city=sc.next();
				int dno=sc.nextInt();
				
				stm1.setInt(1, r);
				stm1.setString(2, name);
				stm1.setString(3, city);
				stm1.setInt(4, dno);
				
				
				stm1.executeUpdate();
				
			
		       
			}

}
