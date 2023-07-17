package objectclass;

public class WrapperDemo3 {

	public static void main(String[] args) {
		float a=12.5f;
		Float b=12.5f/0;
		
		Float c=(float)Math.sqrt(-1);
		System.out.println(c.isNaN());
		
		System.out.println(c!=Float.NaN);
		
//		System.out.println(b.isInfinite());
//		System.out.println(Float.POSITIVE_INFINITY==b);
//		System.out.println(Float.NEGATIVE_INFINITY==b);
		
		
		
		Character d='A';
		System.out.println(d.isLowerCase('A'));

	}

}
