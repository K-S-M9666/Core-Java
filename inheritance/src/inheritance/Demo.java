package inheritance;

class Circle
 {
   public double radius;
   public double area()
   {
	   return Math.PI*radius*radius;
   }
   public double perimeter()
   {
	   return 2*Math.PI*radius;
   }
   public double circumference()
   {
	   return perimeter();
   }
 }
 
class Cylinder extends Circle
{
	public double height;
	public double volume()
	{
		return area()*height;
	}
}
public class Demo {
    
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		cy.radius=7;
		cy.height=10;
		
		System.out.println("Area :"+cy.area());
		System.out.println("Volume :"+cy.volume());

	}

}
