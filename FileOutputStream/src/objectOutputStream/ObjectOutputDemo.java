package objectOutputStream;

import java.io.*;
class Students implements Serializable
{
	int rollNo;
	String name;
	String dept;
	
	Students(){}
}
public class ObjectOutputDemo {

	public static void main(String args[]) throws Exception
	{
//		FileOutputStream fo=new FileOutputStream("D:\\File\\student4.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fo);
//		
//		Students ss=new Students();
//		ss.rollNo=101;
//		ss.name="Keerthi";
//		ss.dept="Mpcs";
//		
//		oos.writeObject(ss);
		
		FileInputStream fiss=new FileInputStream("D:\\File\\student4.txt");
		ObjectInputStream ois=new ObjectInputStream(fiss);
		
		Students s=(Students)ois.readObject();
		System.out.println(s);
		
		fiss.close();
		ois.close();
	}
}
