package singleton;
import java.util.*;

class Student1
{
	private String rolln;
	private static int count=1;
	
	public String generateRoll()
	{
		Date d1=new Date();
		String roll="Univ"+"-"+(d1.getYear()+1900)+"-"+count;
		count++;
		return roll;
	}
	Student1()
	{
		rolln=generateRoll();
	}
	public String rolln()
	{
		return rolln;
	}
}
public class StudentChall2 {

	public static void main(String[] args) {
		Student1 st1=new Student1();
		Student1 st2=new Student1();
		Student1 st3=new Student1();
		Student1 st4=new Student1();

		System.out.println(st1.generateRoll());
		System.out.println(st2.generateRoll());
		System.out.println(st3.generateRoll());
		System.out.println(st4.generateRoll());
	}

}
