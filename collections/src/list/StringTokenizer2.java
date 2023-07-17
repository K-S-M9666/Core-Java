package list;
import java.io.*;
import java.util.*;

public class StringTokenizer2 {
  public static void main(String args[]) throws Exception
  {
	 // String da="Name=Ksm,Place=Suravaram";
	  FileInputStream is=new FileInputStream("D:\\File\\List.txt");
		byte aa[]=new byte[is.available()];
		is.read(aa);
	  
	  String data2=new String(aa);
	  
	  StringTokenizer stk1=new StringTokenizer(data2,",");
		String s;
		ArrayList<Integer> arl=new ArrayList<>();
		while(stk1.hasMoreTokens())
		{
			s=stk1.nextToken();
			arl.add(Integer.valueOf(s));
			
		}
	  System.out.println(arl);
  }
}
