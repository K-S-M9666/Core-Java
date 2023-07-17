package exception;
import java.io.*;
import java.util.*;

public class ResourcesDemo {

	static FileInputStream fi;
	
	static void Divide() throws Exception
	{
		fi=new FileInputStream("/Users/surya/Desktop/Test.txt");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a/b);	
		
		fi.close();
	}
	
	public static void main(String[] args) throws Exception
	{
		Divide();

	}

}
