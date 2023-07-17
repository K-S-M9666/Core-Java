package list;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ali=new ArrayList<>(20);
		
		ArrayList<Integer> ali2=new ArrayList<>(List.of(50,60,70,80,90));
		
		ali.add(10);
		ali.add(0, 20);
		ali.addAll(1,ali2);
		ali.add(5, 70);
		ali.set(6, 100);
		//System.out.println(ali.contains(9));
		//System.out.println(ali.get(5));
		//System.out.println(ali.indexOf(70));
		//System.out.println(ali.lastIndexOf(70));
		//System.out.println(ali.retainAll(ali2));
		
//		for(int i=0;i<ali.size();i++)
//			System.out.println(ali.get(i));
		
		
//		for(int x :ali)
//			System.out.println(x);
		
		//System.out.println(ali);

//		Iterator<Integer> it=ali.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		ListIterator<Integer> li=ali.listIterator();
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
		
		//ali.forEach(System.out::println);
		
		ali.forEach(n->show(n));
	}
 
	static void show(int n)
	{
		if(n>60)
			System.out.println(n);
	}
}
