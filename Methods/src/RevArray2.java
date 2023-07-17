
public class RevArray2 {
    static void reverse(int A[])
    {
    	int B[]=new int[5];
    	for(int i=A.length-1,j=0;i>=0;i--,j++)
    	{
    		B[j]=A[i];
    	}
    	for (int x : B) {
			System.out.print(x+",");
		}
    }
    static int reverse(int n)
    {
    	int rev=0;
    	while(n>0)
    	{
    		int r=n%10;
    		n=n/10;
    	    rev=(rev*10)+r;
    	}
    	return rev;
    }
	public static void main(String[] args) {
	int A[]= {1,2,3,4,5};
	reverse(A);

	}

}
