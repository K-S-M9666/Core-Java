package serialisation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student1
{
	int roll;
	String name1;
	String dept1;
}
public class PrintStreamOutput {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\File\\student.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		
		Student s1=new Student();
		s1.rollno=Integer.parseInt(br.readLine());
		s1.name=br.readLine();
		s1.dept=br.readLine();
		
		System.out.println("Roll No :"+s1.rollno);
		System.out.println("Name :"+s1.name);
		System.out.println("Dept :"+s1.dept);
		
		

	}

}
