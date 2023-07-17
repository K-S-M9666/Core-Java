package generics;

public class Demo<T>{
	
    T data[]=(T[]) new Object[3];
    
	public static void main(String[] args) {
		
		Demo<String> d=new Demo();
		d.data[0]="hi";
		d.data[1]="Bye";
		//d.data[2]=10;
		
		String str=d.data[0];

	}

}
