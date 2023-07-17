package Interfaces;
interface Test
{
	void meth1();
	void meth2();
}
class My implements Test
{
	public void meth1() {
		System.out.println("Meth1 of Class My");
	}
	public void meth2() {
		System.out.println("Meth2 of Class My");
	}
	public void meth3() {
		System.out.println("Meth3 of Class My");
	}
}
public class InterfacesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t=new My();
      t.meth1();
      t.meth2();
	}

}
