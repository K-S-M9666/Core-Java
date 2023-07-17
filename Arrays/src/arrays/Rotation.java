package arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int A[]= {5,2,6,12,34,64,67,9,12,3};
      int temp=A[0];
      
      for (int x : A) 
		System.out.print(x+",");
		
		System.out.println("");
	
      for(int i=1;i<A.length;i++)
      {
    	  A[i-1]=A[i];
      }
      A[A.length-1]=temp;
      
      for (int x : A) 
  		System.out.print(x+",");
	}

}
