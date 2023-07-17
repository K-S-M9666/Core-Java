package exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c;
        try {
        a=10;
        b=0;
        c=a/b;
        System.out.println(c);
        
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Division by Zero");
        }
        System.out.println("Bye");
        
	}

}
