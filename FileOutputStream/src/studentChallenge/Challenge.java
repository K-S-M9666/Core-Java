package studentChallenge;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import DataOutputStream.DataInputStream;

public class Challenge {

	public static void main(String[] args) throws Exception{
		float list[]= {1.2f,20.4f,56.f,32.8f};
		
		FileOutputStream fios=new FileOutputStream("D:\\File\\List.txt");
	    DataOutputStream dos=new DataOutputStream(fios);
	    
	    dos.write(list.length);
	    for (float f : list) {
			dos.writeFloat(f);
		}
	    dos.close();
	    fios.close();

//		FileInputStream fii=new FileInputStream("D:\\File\\student3.txt");
//		DataInputStream dataInput=new DataInputStream(fii);
	}

}
