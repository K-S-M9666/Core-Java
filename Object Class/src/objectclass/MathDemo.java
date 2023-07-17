package objectclass;

public class MathDemo {

	public static void main(String[] args) {
		System.out.print("Absolute : ");
		System.out.println(Math.abs(-123));
		
		System.out.print("Absolute : " );
		System.out.println(StrictMath.abs(-123));
		
		System.out.print("Cube Root : ");
		System.out.println(Math.cbrt(27));
		
		System.out.print("Exact Decrement : ");
		System.out.println(Math.decrementExact(7));
		
		System.out.print("Exponent Value in Floating point : ");
		System.out.println(Math.getExponent(123.45));

		
		System.out.print("Round Dividion : ");
		System.out.println(Math.floorDiv(50, 9));
		
		System.out.print("e power x :");
		System.out.println(Math.exp(1));
		
		System.out.print("e power x :");
		System.out.println(StrictMath.exp(1));
		
		System.out.print("Log Base 10 : ");
		System.out.println(Math.log10(100));
		
		System.out.print("Maximum :");
		System.out.println(Math.max(100, 50));
		
		System.out.print("Tan : ");
		System.out.println(Math.tan(45*Math.PI/180));
		
		System.out.print("Convert to Radians : ");
		System.out.println(Math.toRadians(90));
		
		System.out.print("Convert to Degree : ");
		System.out.println(Math.toDegrees(Math.tanh(1)));
		
		System.out.print("Convert to Degree : ");
		System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));
		
		System.out.print("Random : ");
		System.out.println(Math.random());
		
		System.out.print("Power : ");
		System.out.println(Math.pow(2, 3));
		
		System.out.print("Excact Product :");
		System.out.println(Math.multiplyExact(100, 200));
		
	    System.out.print("Next float value : ");
	    System.out.println(Math.nextAfter(12.5, 13));
	} 

}
