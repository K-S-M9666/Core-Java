package mySecond;
import java.util.*;

public class StudentCha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter any String :");
//       String num=sc.nextLine();
//       if(num.matches("[01]+")) {
//    	    System.out.println("Binary Radix = 2");
//       }
//       else if(num.matches("[0-7]+")) 
//           {
//    		   System.out.println("Octal Radix =8");
//    	   }
//       else if(num.matches("[0-9]+"))
//       {
//    	   System.out.println("Decimal Number");
//       }
//       else if(num.matches("[0-9A-f]+"))
//       {
//    	   System.out.println("Hexa Radix=16");
//       }else {
//    	   System.out.println("Not a Number");
//       }
//       
       
       
       //Leap Year
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Year :");
		  int year=sc.nextInt();
		  if(year%4==0) {
			  if(year%100==0) {
				  if(year%400==0) {
					  System.out.println("It is a leap year");
				  }else {
					  System.out.println("not a leap year");
				  }
			  }else {
				  System.out.println("It a leap Year");
			  }
		  }else {
			  System.out.println("not a leap Year");
		  }
	}

}
