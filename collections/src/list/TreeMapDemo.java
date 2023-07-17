package list;
import java.util.*;
import java.util.Map.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E"));
		tm.put(6, "F");
		
		Entry<Integer,String> e=tm.firstEntry();
		System.out.println(e.getKey()+" "+e.getValue());
 		
//		System.out.println(tm);
//		System.out.println(tm.ceilingEntry(5).getValue());
//		System.out.println(tm.getClass());

	}

}
