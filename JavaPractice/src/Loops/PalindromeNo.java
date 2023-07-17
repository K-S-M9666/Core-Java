package Loops;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number :");
      int n=sc.nextInt();
      int r;
      int rev=0;
      int temp=n;
      while(n>0)
      {
    	  r=n%10;
    	  rev=rev*10+r;
    	  n=n/10;
      }
      if(temp==rev)
      {
    	  System.out.println("Palindrome");
      }else {
    	  System.out.println("Not Palindrome");
      }
	}

}
