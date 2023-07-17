package DataOutputStream;

import java.io.FileOutputStream;
import java.io.*;
class Stud
{
	int rollNo;
	String fName;
	String depts;
	float avg;
}
public class DataOutputDemo1 {
  
	public static void main(String args[]) throws Exception
	{
		FileOutputStream f1=new FileOutputStream("D:\\File\\student3.txt");
		DataOutputStream data=new DataOutputStream(f1);
		
		Stud s1=new Stud();
		s1.rollNo=101;
		s1.fName="Manikantha";
		s1.depts="MPC";
		s1.avg=80.5f;
		
		data.writeInt(s1.rollNo);
		data.writeUTF(s1.fName);
		data.writeUTF(s1.depts);
		data.writeFloat(s1.avg);
		
		data.close();
		f1.close();
	}
}
