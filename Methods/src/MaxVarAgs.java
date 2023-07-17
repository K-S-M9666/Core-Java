
public class MaxVarAgs {
    
	static int max(int... A)
	{
		if(A.length==0) return Integer.MIN_VALUE;
		int max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			max=A[i];
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(max(90,8,23,22,112,3,22,322));
		System.out.println(max(0));

	}

}
