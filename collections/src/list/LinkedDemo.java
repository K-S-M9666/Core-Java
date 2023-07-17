package list;
import java.util.*;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedList<Integer> li1=new LinkedList<>();
		LinkedList<Integer> li2=new LinkedList<>(List.of(50,60,70,80,90));
		
		li1.add(20);
		li1.add(0, 10);
		li1.addAll(li2);
		li1.set(1, 100);
		li1.addFirst(200);
		li1.addLast(300);
		//li1.removeFirst();
		li1.peek();
		System.out.println(li1.peek());
		//li1.pollFirst();
		li1.pop();
		//System.out.println(li1);

		//li1.forEach(n->show(n));
	}

	static void show(int n)
	{
		//if(n>60)
		System.out.println(n);
	}
}
