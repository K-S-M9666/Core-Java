
public class PrimeNo2 {
    static boolean isPrime(int n)
    {
    	for(int i=2;i<n/2;i++)
    	{
    		if(n%i==0)
    			return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
	   int n=13;
	   System.out.println(isPrime(n));
	}

}
