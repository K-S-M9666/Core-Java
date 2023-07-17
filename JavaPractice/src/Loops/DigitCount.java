package Loops;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Number :");
     int n=sc.nextInt();
     int count=0;
     while(n>0)
     {
    	n=n/10;
    	count=count+1;
     }
     System.out.println(count);
	}

}
