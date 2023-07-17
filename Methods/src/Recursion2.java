
public class Recursion2 {
    static void fact(int n)
    {
    	if(n>0) {
    		
    		System.out.println(n);
    		 fact(n-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fact(5);
	}

}
