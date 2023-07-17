package list;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
		lhs.add("A");
		lhs.add("C");
		lhs.add("G");
		lhs.add("D");
		lhs.add("S");
		lhs.add("B");
		lhs.add("B");
		
		lhs.forEach((x)->System.out.println(x));
	}

}
