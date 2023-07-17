package list;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40,50,10,20));
		ts.add(60);
		
		//System.out.println(ts.ceiling(55));
		//System.out.println(ts.remove(60));
		
		System.out.println(ts);

	}

}
