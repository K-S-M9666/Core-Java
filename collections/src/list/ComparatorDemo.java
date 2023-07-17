package list;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		if(i1<i2)return 1;
		if(i1>i2)return -1;
		return 0;
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		Integer a[]= {2,3,4,5,6,7,8,6};
		int b[]= {1,3,4,5,6,7,8,6};
		
		//System.out.println(Arrays.compare(a, b));
		// int c[]=Arrays.copyOf(a, a.length);
		//Arrays.sort(c);
		
		Arrays.sort(a, new My());
		for(Integer x:a)
			System.out.println(x); 
			//System.out.println(Arrays.binarySearch(a, 2));
		  
	}

}
