
public class VariableArg {
    static void show(int... x)
    {
    	for (int i : x) {
			System.out.print(i+",");
		}
    }
	public static void main(String[] args) {
		
     show();
     show(10,20,30,100);
	}

}
