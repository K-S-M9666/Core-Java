package fileoutputstream;
import java.io.*;
import java.io.FileInputStream;
public class StudentChall2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi1=new FileInputStream("D:\\File\\source1.txt");
		FileInputStream fi2=new FileInputStream("D:\\File\\source2.txt");
		FileOutputStream fout=new FileOutputStream("D:\\File\\source3.txt");
		SequenceInputStream sis=new SequenceInputStream(fi1,fi2);
		
		
		int a;
		while((a=sis.read())!=-1)
				{
			       fout.write(a);
				}
		sis.close();
		fi1.close();
		fi2.close();
		fout.close();
	}

}
