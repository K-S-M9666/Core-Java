package generics;

class Array1<T>
{
	T t[]=(T[]) new Object[10];
	int le=0;
	public void append(T tt)
	{
		t[le++]=tt;
	}
	public void display()
	{
		for(int i=0;i<le;i++)
		{
			System.out.println(t[i]);
		}
	}
}
public class Genericmethods {

//	static <E > void show(E[] list)
//	{
//		for(E x:list)
//		{
//			System.out.println(x);
//		}
//	}
	
	static void fun(Array1 obj)
	{
		obj.display();
	}
	public static void main(String[] args) {
		//show(new String[] {"Hi","Bye","GO"});
//		show(new Integer[] {1,2,3,4,5});

	}

}
