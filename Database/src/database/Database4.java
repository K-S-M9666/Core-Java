package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database4 {

	public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
		
		Connection con1=DriverManager.getConnection("jdbc:sqlite:C://SqLite//univ.db");
		
		
		Statement stm1=con1.createStatement();
		stm1.executeUpdate("drop table Temp");
	
        stm1.close();
        con1.close();
	}
	
}
