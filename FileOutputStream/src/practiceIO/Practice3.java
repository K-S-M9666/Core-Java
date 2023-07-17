package practiceIO;
import java.io.FileInputStream;
import java.io.*;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream ffii=new FileInputStream("D:\\File\\text1.txt");
		FileOutputStream ffoo=new FileOutputStream("D:\\File\\text2.txt");
		int d;
		
		while((d=ffii.read())!=-1)
		{
			if(d>=65 && d<=90)
				ffoo.write(d+32);
			else
				ffoo.write(d);
		}
      
		ffii.close();
		ffoo.close();
	}

}
