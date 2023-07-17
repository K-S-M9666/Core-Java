package oops;
class Cylin
{
	public double radius;
	public double height;
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double Circumference()
	{
		return 2*Math.PI*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()*height;
	}
	public double volume()
	{
		return lidArea()*height;
	}
}
public class Cylinder {

	public static void main(String[] args) {
		Cylin c1=new Cylin();
		c1.radius=5;
		c1.height=10;
		System.out.println("Area "+c1.lidArea());
		System.out.println("Circumference :"+c1.Circumference());
		System.out.println("Volume :"+c1.volume());
		System.out.println("Total Surface Area :"+c1.totalSurfaceArea());
		

	}

}
