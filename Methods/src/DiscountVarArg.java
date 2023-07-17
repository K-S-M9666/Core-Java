
public class DiscountVarArg {
    static double discount(double... p)
    {
    	double sum=0.0;
    	for(int i=0;i<p.length;i++)
    	{
    		sum=sum+p[i];
    	}
    	if(sum>500 && sum<=1000)
    		return sum*0.10;
    	else
    		if(sum<1000 && sum>=1500)
    			return sum*0.15;
    		else
    				return sum*0.20 ;
    }
    
	public static void main(String[] args) {
		System.out.println(discount(10,20,40,500));
		System.out.println(discount(1000,50000));

	}

}
