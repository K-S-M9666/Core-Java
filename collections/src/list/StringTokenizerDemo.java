package list;
import java.io.*;
import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) throws Exception {
		//String data="name=Surya;address=Tuni;country=India;dept=MPCs";
		FileInputStream fis=new FileInputStream("D:\\File\\List.txt");
		byte b[]=new byte[fis.available()];
		fis.read(b);
		
		String data=new String(b);
		
		
		StringTokenizer stk=new StringTokenizer(data,",");
		String s;
		ArrayList<Integer> al=new ArrayList<>();
		while(stk.hasMoreTokens())
		{
			s=stk.nextToken();
			al.add(Integer.valueOf(s));
			
		}
		System.out.println(al);

	}

}
