package oops;

class Rect
{
	private int length;
	private int breath;
	public int getLength()
	{
		return length;
	}
	public int getBreath()
	{
		return breath;
	}
	public void setLength(int l)
	{
		if(length>0)
			length=l;
		else
			length=0;
	}
	public void setBreath(int b)
	{
		breath=b;
	}
	public int area() {
		return length*breath;
	}
	
	public int perimeter()
	{
		return 2*(length+breath);
	}
	
	public boolean square()
	{
		return length==breath;
	}
	
}
public class Rectangle {

	public static void main(String[] args) {
		
      Rect r1=new Rect();
      r1.setLength(30);
      r1.setBreath(20);
      System.out.println("Area of Rectangle :"+r1.area());
      System.out.println("Perimeter of Rectangle :"+r1.perimeter());
      System.out.println("Square :"+r1.square());
      
      System.out.println("Length :"+r1.getLength());
	}

}
