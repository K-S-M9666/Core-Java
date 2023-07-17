package exception;

public class NestedCatch {

	public static void main(String[] args) {
		int A[]= {10,0,30,40,50};
	  try
	  {
		int c=A[0]/A[1];
		System.out.println(c);
		  try {
		      System.out.println(A[3]);
		      }
		    catch(ArrayIndexOutOfBoundsException e)
		     {
			  System.out.println("Index is invalid");
		      }
	   }
	  catch(ArithmeticException e)
	  {
		 
		  System.out.println("error" + e.getMessage());
	  }
	  
	  
	  System.out.println("Bye");
	}

}
