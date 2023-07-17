package singleton;
import java.util.*;

class Student
{
	private String rollNo;
	private static int counter=1;
	
	private String generateRollNo()
	{
		Date d =new Date();
		String rn= "Univ"+"-"+(d.getYear()+1900)+"-"+counter;
		counter++;
		return rn;
	}
	Student()
	{
		rollNo=generateRollNo();
	}
	public String getRollNo()
	{
		return rollNo;
	}
}
public class Challenge {

	public static void main(String[] args) {
		Student r1=new Student();
		Student r2=new Student();
		Student r3=new Student();
		Student r4=new Student();
		
		System.out.println(r1.getRollNo());
		System.out.println(r2.getRollNo());
		System.out.println(r3.getRollNo());
		
		
		

	}

}
