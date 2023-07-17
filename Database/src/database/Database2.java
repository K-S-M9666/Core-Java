package database;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;


public class Database2 {

	public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
		
		Connection con1=DriverManager.getConnection("jdbc:sqlite:C://SqLite//univ.db");
		
		
		Statement stm1=con1.createStatement();
		//stm1.executeUpdate("insert into dept values(70,'Chem')");
		//stm1.executeUpdate("delete from dept where deptno>50");
		stm1.executeUpdate("update dept set dname='Chem' where deptno=50");
	
        stm1.close();
        con1.close();
	}


	}

