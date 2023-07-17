package inheritance;
class Car
{
	public void start()
	{
		System.out.println("Car Started");
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car Gear Changed");
	}
}
class LuxaryCar extends Car
{
	public void changeGear() {
		System.out.println("Luxary Car changed");
	}
	public void openRoof()
	{
		System.out.println("Luxary Car Roof Opened");
	}
}
public class OverridingCar {

	public static void main(String[] args) {
		Car c =new LuxaryCar();
		c.start();
		c.accelerate();
		c.changeGear();
		//c.openRoof();

	}

}
