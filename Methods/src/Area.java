
public class Area {
    static int area(int l,int b)
    {
    	int a=l*b;
    	return a;
    }
    static double area(double r)
    {
    	double a=Math.PI*r*r;
    	return a;
    }
//    static int area(int a,int b,int h)
//    {
//    	int s=1/2*((a+b)*h);
//    	return s;
//    }
	public static void main(String[] args) {
		System.out.println("Area :"+area(50));
//		System.out.println("Area :"+area(5,15,5));

	}

}
