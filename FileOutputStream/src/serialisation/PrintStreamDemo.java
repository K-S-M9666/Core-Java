package serialisation;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student
{
	int rollno;
	String name;
	String dept;
}
public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("D:\\File\\student.txt");
		PrintStream ps=new PrintStream(fos);
		
		Student s=new Student();
		s.rollno=100;
		s.name="Surya";
		s.dept="ECE";
		
		ps.println(s.rollno);
		ps.println(s.name);
		ps.println(s.dept);
		
		ps.close();
		fos.close();
 
	}

}
