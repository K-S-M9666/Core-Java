package staticPackage;
class HondaCity
{
	static double Price=1000000;
	int a,b;
	
	static double OnRoadPrice(String city)
	{
		switch(city)
		{
		case "Hyd" : return Price + Price*0.1;
		case "Tuni" : return Price + Price*0.09;
		
		}
		return Price;
	}
}
public class StaticEx2 {

	public static void main(String[] args) {
		HondaCity hc=new HondaCity();
		System.out.println(hc.OnRoadPrice("Hyd"));
		
		
		System.out.println(HondaCity.OnRoadPrice("Tuni"));

	}

}
