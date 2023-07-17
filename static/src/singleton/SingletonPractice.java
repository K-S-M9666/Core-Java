package singleton;
class CoffeMachine
{
	private float coffeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private CoffeMachine my=null;
	
	private CoffeMachine()
	{
		coffeQty=1;
		milkQty=1;
		waterQty=1;
		sugarQty=1;
	}
	public void filterWater(float qty)
	{
		waterQty=qty;
	}
	public void fillSugar(float qty)
	{
		sugarQty=qty;
	}
	public float getCoffe()
	{
		return 0.32f;
	}
	static CoffeMachine getrinstance()
	{
		if(my==null)
			my=new CoffeMachine();
		return my;
	}
	
}
public class SingletonPractice {

	public static void main(String[] args) {
		CoffeMachine c1=CoffeMachine.getrinstance();
		CoffeMachine c2=CoffeMachine.getrinstance();
		CoffeMachine c3=CoffeMachine.getrinstance();
		
		System.out.println(c1+" "+c2+" "+c3);
		if(c1==c2 && c1==c3)
			System.out.println("Same");
	}

}
