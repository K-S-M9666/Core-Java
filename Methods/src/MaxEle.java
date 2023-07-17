
public class MaxEle {
    static int max(int A[])
    {
    	int max=A[0];
    	for(int i=0;i<A.length;i++)
    	{
    		if(A[i]>max)
    			max=A[i];
    	}
    	return max;
    	
    }
	public static void main(String[] args) {
		int a[]= {5,321,90,34,54};
        System.out.println(max(a));
	}

}
