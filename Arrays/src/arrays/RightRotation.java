package arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int B[]= {5,2,6,12,34,64,67,9,12,3};
		int temp=B[B.length-1];
		
		for (int x : B) 
			System.out.print(x+",");
		System.out.println("");
		
		for(int i=1;i<B.length-1;i++)
		{
			B[i-1]=B[i];
		}
		B[0]=temp;
		
		for (int x : B) 
			System.out.print(x+",");
	}

}
