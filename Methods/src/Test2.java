
public class Test2 {
    int max(int x,int y)
    {
    	if(x>y)
    		return x;
    	else 
    		return y;
    }
	
	public static void main(String[] args) {
		int a=10,b=24;
		Test2 t=new Test2();
		System.out.println(t.max(a, b));
  
	}

}
