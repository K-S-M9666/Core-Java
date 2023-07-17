
public class VariableArg2 {
    static void show(int ...A)
    {
    	 for (int x : A ) {
			System.out.print(x+",");
		}
    }
    
    static void showList(String ...s)
    {
    	for(int i=0;i<s.length;i++)
    	{
    		System.out.println(i+1+"."+s[i]);
    	}
    }
	public static void main(String[] args) {
		show();
		show(10,20);
		System.out.println("");
		showList("Surya","Manikantha","Keerthi","Mahadeva");
 
	}

}
