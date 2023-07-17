package oops;
class Details
{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	public int total()
	{
		return m1+m2+m3;
	}
	public float average()
	{
		return (float)total()/3;
	}
	public char grade()
	{
		if(average()>=60)
			return 'A';
		else
			return 'B';
	}
	public String toString()
	{
		return "Roll No :"+roll+"\n"+"Name :"+name+"\n"+"Course :"+course+"\n";
	}
}
public class Student {

	public static void main(String[] args) {
		Details d=new Details();
		d.roll=101;
		d.course="Computers";
		d.name="Surya";
		d.m1=90;
		d.m2=70;
		d.m3=99;
		System.out.println("Details :"+ d);
		System.out.println("Total :"+d.total());
		System.out.println("Average :"+d.average());
		

	}

}
