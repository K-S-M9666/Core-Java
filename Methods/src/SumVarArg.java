
public class SumVarArg {
    static int sum(int... x)
    {
    	int sum=0;
    	for(int i=0;i<x.length;i++)
    	{
    		sum=sum+x[i];
    	}
    	return sum;
    }
 	public static void main(String[] args) {
		
       System.out.println(sum(10,20));
       System.out.println(sum(10,20,30,40,50,60,70,80,90,100));
	}

}
