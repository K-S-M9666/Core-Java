package exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
			int A[]= {10,0,4,3,5};
			int r;
			r=A[0]/A[1];
			System.out.println("result :"+r);
			System.out.println(A[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Index out of bound");
		}
		finally
		{
			System.out.println("Welcome");
		}
	}

}
