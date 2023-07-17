package generics;

@SuppressWarnings("unchecked")
class Array<T>
{
	T a[]=(T[]) new Object[10];
	int lenght=0;
	
	public void append(T v)
	{
		a[lenght++]=v;
	}
	public void display()
	{
		for(int i=0;i<lenght;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class MyArray {

	public static void main(String[] args) {
		Array<Integer> ma=new Array<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();

	}

}
