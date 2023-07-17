package objectclass;
import java.lang.reflect.*;

class My{
	private int a;
	protected int b;
	public int c;
	int d;
	
	public My() {}
	public My(int x,int y) {}
	
	public void display(String s1,String s2) {}
	public int show(int x,int y) {return 0;}
}

public class ReflectDemo {

	public static void main(String[] args) {
	 
		 Class c=My.class;  
			/*
			 * My my=new My(); my.getClass()
			 */;
		 
		 Field field[]=c.getDeclaredFields();
		 
		 Constructor con[]=c.getConstructors();
		 for(Constructor ct:con)
		 {
			 System.out.println(ct);
		 }
		 
		 
		 Method met[]=c.getMethods();
		 for(Method m:met)
		 {
			 System.out.println(m);
		 }
		 
		 Parameter param[]=met[0].getParameters();
		 for(Parameter pa:param)
		 {
			 System.out.println(pa);
		 }
		 
		 
		 for (Field f : field) {
			System.out.println(f);
		}
		 System.out.println(c.getName());
		 
	}

}
