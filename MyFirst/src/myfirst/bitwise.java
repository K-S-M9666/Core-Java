package myfirst;

public class bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int x=0b1010,y=0b110,z;
//        z=x|y;
//        System.out.println(z);
//        
//        
//        int a=15,b=2,c;
//        c=x^y;
//        System.out.println(c);
        
        int x1=10;
        int y1;
        y1=x1<<1;
        int y2=x1>>1;
        int y3=x1>>>1;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        
        
        int a=10,b;
        b=~a;
        System.out.println(b);
	}

}
