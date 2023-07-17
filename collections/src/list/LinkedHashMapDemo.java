package list;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true)
				{
			      protected boolean removeEldestEntry(Map.Entry e)
			      {
			    	  return size()>5;
			      }
				};
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");
		lhm.put(9, "I");
//		lhm.put(8, "G");
		
		lhm.get(2);
		lhm.get(5);
		lhm.get(1);
		lhm.forEach((K,V)->System.out.println(K+" "+V));
		
		//System.out.println(lhm);

	}

}
