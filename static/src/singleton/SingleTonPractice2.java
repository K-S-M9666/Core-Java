package singleton;
class CoffeeMachine
{
	private float  coffeeQty;
	private float waterQty;
	private float sugarQty;
	private float milkQty;
	
	private CoffeeMachine()
	{
		coffeeQty=1;
		waterQty=1;
		milkQty=1;
		sugarQty=1;
	}
	
	static private CoffeeMachine my=null;
	
	public void filterWater(float Qty)
	{
		waterQty=Qty;
	}
	public void fillSugar(float Qty)
	{
		sugarQty=Qty;
	}
	public float getCoffee()
	{
		return 0.23f;
	}
	static CoffeeMachine getInstance()
	{
		if(my==null)
			my=new CoffeeMachine();
		return my;
	}
}
public class SingleTonPractice2 {

	public static void main(String[] args) {
		CoffeeMachine c1=CoffeeMachine.getInstance();
		CoffeeMachine c2=CoffeeMachine.getInstance();
		
		System.out.println(c1+" "+c2);
		if(c1==c2)
			System.out.println("Same");

	}

}
