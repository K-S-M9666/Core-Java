package Loops;
import java.util.*;

public class LoopCha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
       for(int j=1;j<=10;j++)
       {
    	   int k=n*j;
    	   System.out.println(n+" X "+j+" = "+k);
       }
	}

}
