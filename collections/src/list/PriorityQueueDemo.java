package list;
import java.util.*;

class MyCom implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1<o2)return 1;
		if(o1>o2)return -1;
		else return 0;
	}
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(new MyCom());
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(40);
		pq.add(5);
		//System.out.println(pq.peek());
		//pq.poll();
		pq.forEach(x->System.out.println(x));

	}

}
