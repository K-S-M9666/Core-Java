package fileoutputstream;
import java.io.*;

public class ByteDemo {

	public static void main(String[] args) throws Exception{
		byte b[]= {'a','b','c','d','e','f'};
		ByteArrayInputStream bi=new ByteArrayInputStream(b);
		int x;
		String str=new String(bi.readAllBytes());
		System.out.println(bi.markSupported());
		
//		while((x=bi.read())!=-1)
//		{
//			System.out.print((char)x);
//		}
        bi.close();
	}

}
