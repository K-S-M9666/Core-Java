package fileoutputstream;
import java.io.*;

public class FileInputStream {



	public static void main(String[] args) throws Exception  {
		try
		{
			FileReader fr=new FileReader("D:\\File\\Test1.txt");  
			int x;
			
			while((x=fr.read())!=-1)
			{
				System.out.print((char)x);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
