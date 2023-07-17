package arrays;

public class ArrayTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,9,7,8,12,45,15,5,4,10};
		int max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		System.out.println("Max Element is : "+ max);
	}

}
