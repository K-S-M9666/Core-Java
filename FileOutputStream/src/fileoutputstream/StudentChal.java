package fileoutputstream;
import java.io.*;
import java.io.FileInputStream;
public class StudentChal {

	public static void main(String[] args) throws Exception{
		 FileInputStream fi=new FileInputStream("D:\\File\\source1.txt");
		 FileOutputStream fo=new FileOutputStream("D:\\File\\source2.txt");
		 
		 int b;
		 while((b=fi.read())!=-1)
		 {
			 if(b>=65 && b<=90)
				 fo.write(b+32);
			 else
				 fo.write(b);
		 }
		 fi.close();
		 fo.close();

	}

}
