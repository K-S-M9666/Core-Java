
public class PrimeNo {
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
		// TODO Auto-generated method stub
        int n=4;
        System.out.println(isPrime(n));
	}

}
