package objectclass;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int m1=15;
		Integer m2=Integer.valueOf(123);
		Integer m3=Integer.valueOf("1010", 2);
		Integer m4=Integer.valueOf("A7", 16);
		
		
		System.out.println(m4);
		System.out.println(m3);
		
		System.out.println(Integer.parseInt("1233"));
		
		System.out.println(Integer.reverse(123));
		
		System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(40));
		//System.out.println(m2.equals(m1));
		

	}

}
