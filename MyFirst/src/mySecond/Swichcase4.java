package mySecond;
import  java.util.*;
public class Swichcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a and b values :");
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         System.out.println("Enter options in words :");
         sc.nextLine();
         String option=sc.nextLine();
         
         switch(option)
         {
         case "ADD": System.out.println("Add of two numbers " + (a+b));
         break;
         case "MUL" : System.out.println("Mul of two numbers "+ (a*b));
         break;
         case "DIV": System.out.println("DIV of two numbers "+ (a/b));
         break;
         case "SUB": System.out.println("SUB of two numbers "+ (a-b));
         break;
         }
	}

}
