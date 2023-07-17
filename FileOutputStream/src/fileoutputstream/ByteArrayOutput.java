package fileoutputstream;
import java.io.ByteArrayOutputStream;
import java.util.*;

public class ByteArrayOutput {

	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream bas=new ByteArrayOutputStream(20);
		bas.write('a');
		bas.write('b');
		bas.write('c');
		
		byte b[]=bas.toByteArray();
		for (byte c : b) {
			System.out.println(c);
		}
		
		bas.close();
		

	}

}
