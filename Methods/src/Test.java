
public class Test {
  
	static int max(int x,int y)
	 {
		if(x>y)
			return x;
		else
			return y;
	 }
	static void inc(int x)
	{
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		  int a=10,b=15,c;
       c= max(a,b);
       inc(a);
       System.out.println(a);
       System.out.println(c);
	}

}
