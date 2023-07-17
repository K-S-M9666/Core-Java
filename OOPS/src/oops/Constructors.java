package oops;
class Rectangle1
{
	private double length;
	private double breath;
	public Rectangle1()
	{
		length=1;
		breath=1;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	public Rectangle1(double l,double b)
	{
		length=l;
		breath=b;
	}
	public Rectangle1(double s)
	{
		length=breath=s;
	}
}
public class Constructors {
   
    
	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1(10,20);
	
   
	}

}
