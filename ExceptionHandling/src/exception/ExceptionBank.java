package exception;

class BankBalanceException extends Exception
{
	public String toString()
	{
		return "Minium Bal must be 50000 try small amount";
	}
}

public class ExceptionBank {

	public static void main(String[] args) {
		BankBalanceException b = new BankBalanceException();
		System.out.println(b.toString());

	}

}
