package fileoutputstream;
import java.io.*;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fiis=new FileInputStream("D:\\File\\source1.txt");
        BufferedInputStream bis=new BufferedInputStream(fiis);
        
        System.out.println("File :"+fiis.markSupported());
        System.out.println("Buffer :"+bis.markSupported());
        
        
        
        
        
        
//        int x;
//        while((x=bis.read())!=-1)
//        {
//        	System.out.print((char)x);
//        }
	}

}
