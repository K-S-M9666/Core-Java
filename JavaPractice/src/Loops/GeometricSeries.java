package Loops;

import java.util.Scanner;

public class GeometricSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value :");
       int a=sc.nextInt();
       System.out.println("Enter r value :");
       int r=sc.nextInt();
       System.out.println("Enter n value :");
       int n=sc.nextInt();
       int term=a;
        for(int i=0;i<n;i++) {
    	   System.out.print(term+",");
    	   term=term*2;
       }
	}

}
