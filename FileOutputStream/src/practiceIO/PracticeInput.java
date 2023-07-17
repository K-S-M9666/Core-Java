package practiceIO;
import java.io.*;
import java.io.FileInputStream;

public class PracticeInput {
  
	public static void main(String args[]) throws Exception
	{
		FileOutputStream ffi=new FileOutputStream("D:\\File\\text1.txt");
		String ss="My Full Name is Surya Manikantha Keerthi";
		
		byte aa[]=ss.getBytes();
		ffi.write(aa);
		
		ffi.close();
	}
	
}
