package myfirst;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=15;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a + " " + b);
        
        
        byte x=9,y=12,z;
        z=(byte)(x<<4);
        z=(byte)(z|y);
        
        System.out.println((z&0b11110000)>>4);
        System.out.println((z&0b00001111));
        
	}

}
