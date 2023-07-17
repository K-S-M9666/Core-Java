package oops;
class Circle
  {
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double Perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double Circumference()
	{
		return Perimeter();
	}
  }
public class Circle1 {
    
	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.radius=7;
		System.out.println("Area :"+ c1.area());
		System.out.println("Circumferences :"+c1.Circumference());
		System.out.println("Perimeter :"+c1.Perimeter());
		 
		System.out.println("");
		
		Circle c2=new Circle();
		c2.radius=14;
		System.out.println("Area :"+ c2.area());
		System.out.println("Circumferences :"+c2.Circumference());
		System.out.println("Perimeter :"+c2.Perimeter());
	}

}
