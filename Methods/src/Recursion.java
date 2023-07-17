
public class Recursion {
    static void fact(int n)
    {
    	if(n>0)
    	{
    		
    		System.out.println(n);
    		fact(n-1);
    	}
    }
	public static void main(String[] args) {
		
       fact(3);
	}

}
