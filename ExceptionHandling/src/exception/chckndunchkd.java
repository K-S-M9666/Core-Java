package exception;

class LowBalanceException extends Exception {
	public String toString() {
		return "Balance should not less thank 5k";
	}
}

public class chckndunchkd {

	static void fun1()
	{	
		try {
			   throw new LowBalanceException();
		     }
		catch(LowBalanceException e)
		{
			System.out.println(e.getMessage());
		}		
	}

	static void fun2() {
		fun1();
	}

	static void fun3() {
		fun2();
	}

	public static void main(String[] args) {
		fun3();

	}

}
