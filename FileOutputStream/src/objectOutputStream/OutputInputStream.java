package objectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Students2 implements Serializable
{
	int rollNo;
	String name;
	String dept;
	
	Students2(){}
}
public class OutputInputStream {

	public static void main(String[] args) throws Exception{
	FileInputStream fiss=new FileInputStream("D:\\File\\student4.txt");
	ObjectInputStream ois=new ObjectInputStream(fiss);
	
	Students2 s2=(Students2)ois.readObject();
	System.out.println(s2);
	
	ois.close();
	fiss.close();

	}

}
