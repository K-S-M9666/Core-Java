package accessModifiers;

public class Demo {
    int a=10;
    private int b=20;
    protected int c=30;
    public int d=40;
    
    public void display()
    {
    	System.out.println(a+b+c+d);
    }
    
}
class Demo2 extends Demo {
}