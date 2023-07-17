package practice;

@SuppressWarnings("unchecked")
class Array<T,K>
{
	T A[]=(T[]) new Object[10];
	int len=0;
	
	public void append(T a)
	{
		A[len++]=a;
	}
	public void display()
	{
		for(int i=0;i<len;i++)
		{
			System.out.println(A[i]);
		}
	}
}
//class MyArray2<T> extends Array<T>
//{
//	
//}
public class Practice1 {

	public static void main(String[] args) {
		Array a=new Array();
		a.append("Hi");
		a.append(1);
		
		
		a.display();

	}

}
