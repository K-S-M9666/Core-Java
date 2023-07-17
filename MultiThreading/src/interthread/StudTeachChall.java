package interthread;

class WhiteBoard
{
	String text;
	int numberofStudents=0;
	int count=0;
	
	public void attendance()
	{
		numberofStudents++;
	}
	synchronized public void write(String s)
	{
		System.out.println("Teacher is Writing ..");
		while(count!=0)
			try {
				wait();
			}
		catch(Exception e) {}
		text=s;
		count=numberofStudents;
		notifyAll();
	}
	synchronized public String read()
	{
		while(count==0)
			try {
				wait();
			}
		catch (Exception e) {}
		
		String s=text;
		count--;
		if(count==0)
			notify();
		return s;
	}
}

class Teacher extends Thread
{
	WhiteBoard wb;
	String note[]= {" Java"," It is Platform"};
	
	public Teacher(WhiteBoard w)
	{
		wb=w;
	}
	public void run()
	{
		for(int i=0;i<note.length;i++)
			wb.write(note[i]);
			
	}
}

class Student extends Thread
{
	String name;
	WhiteBoard wb;
	public Student(String s,WhiteBoard w)
	{
		name=s;
		wb=w;
	}
	public void run()
	{
		String text;
		wb.attendance();
		
		do {
			text=wb.read();
			System.out.println(name + " Reading "+text);
			System.out.flush();
		}while(!text.equals("end"));
	}
}
public class StudTeachChall {

	public static void main(String[] args) {
		
		WhiteBoard wb=new WhiteBoard();
		Teacher t=new Teacher(wb);
		Student s1=new Student("1. Surya",wb);
		Student s2=new Student("2. Mani",wb);
		Student s3=new Student("3. Kantha",wb);
		Student s4=new Student("4. Keerthi",wb);
		
		t.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
