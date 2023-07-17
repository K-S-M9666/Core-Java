package collections;

public class ArraySize {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		int B[]=new int[10];
		
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		A=B;
		B=null;
	
		for (int i : A) {
			System.out.print(i+",");
		}
		

	}

}
