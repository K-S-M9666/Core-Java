package Loops;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a No :");
      int n=scan.nextInt();
      int r;
      int sum=0;
      int temp=n;
      while(n>0)
      {
    	  r=n%10;
    	  sum=sum+(r*r*r);
    	  n=n/10;
      }
      if(sum==temp)
      {
    	  System.out.println("Amstrong Number");
      }else {
    	  System.out.println("NotAmstrong");
      }
	}

}
