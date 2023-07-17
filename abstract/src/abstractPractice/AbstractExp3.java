package abstractPractice;
abstract class Shape
{
	abstract double perimeter();
	abstract double area();
}
class Circle extends Shape
{
    int r;
	public double perimeter()
	{
	  return 2*Math.PI*r;
	}
	public double area()
	{
		return (Math.PI*r*r);
	}
}
class Rectangle extends Shape
{
	double l,b;
	public double perimeter()
	{
		return (2*(l+b));
	}
	public double area()
	{
		return (l*b);
	}
}
public class AbstractExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle s=new Rectangle();
       s.b=10;
       s.l=5;
       System.out.println(s.area());
       
	}

}
