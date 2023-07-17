package Loops;

import java.util.Scanner;

public class DigitDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a No :");
    int n=sc.nextInt();
  
     while(n>0)
     {
    	int r=n%10;
    	n=n/10;
    	 System.out.println(r);
     }
	}
}
