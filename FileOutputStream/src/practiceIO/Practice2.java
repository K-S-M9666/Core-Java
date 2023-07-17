package practiceIO;
import java.io.*;

public class Practice2 {

	public static void main(String[] args) throws Exception{
		FileInputStream fi2=new FileInputStream("D:\\File\\text1.txt");
		
		int c;
		while((c=fi2.read())!=-1)
		{
			System.out.print((char)c);
		} 
		fi2.close();
	}

}
