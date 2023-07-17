package fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteam {

	public static void main(String[] args) {
		
		try {
			FileOutputStream f=new FileOutputStream("D:\\File\\Test1.txt");
			String s="Java is a programming Language";
			
			byte b[]=s.getBytes();
			f.write(b);
			
			f.write(b, 10, s.length()-10);
			
//			for(byte x:b)
//				f.write(b);
			
			f.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
