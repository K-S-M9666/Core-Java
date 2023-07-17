package list;

import java.util.Map;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>(Map.of(0,"a",1,"b",2,"c",3,"d",4,"e"));
        hm.put(5, "F");
      
        
        System.out.println(hm);
	}

}
