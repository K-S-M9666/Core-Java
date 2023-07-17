package generics;

class Dataa<T>
{
	private T obj;
	public void setData(T v)
	{
		obj=v;
	}
	public T getData()
	{
		return obj;
	}
}
public class Data {

	public static void main(String[] args) {
		Dataa<Integer> da=new Dataa<>();
		da.setData(new Integer(10));
		
		System.out.println(da.getData());

	}

}
