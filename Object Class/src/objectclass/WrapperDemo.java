package objectclass;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer a =Integer.valueOf(10);
		Integer b=10;
		
		
		Byte c=15;
		Byte d=Byte.valueOf("15");
		
		Byte bb=20;
		Byte e=Byte.valueOf(bb);
		
		Short f=Short.valueOf("123");
		
		Float g=12.3f;
		Float h=Float.valueOf("123.4");
		float x=h.floatValue();
		float y=h;
		
		
		Double j=Double.valueOf("123.4566");
		
		Character k=Character.valueOf('A');

		Boolean l=Boolean.valueOf(true);
		
		
		int m=10;
		Integer n=m;
		int p=n;
	}

}
