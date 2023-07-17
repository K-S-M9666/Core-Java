package mySecond;
import java.util.*;

public class StudentChan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Odd or Even
//		System.out.println("Enter Integer Number :");
//		 Scanner sc=new Scanner(System.in);
//		 int n=sc.nextInt();
//		 
//		 if(n%2==0)
//		 {
//			 System.out.println("Number is even");
//		 }else
//		 {
//			 System.out.println("Number is odd");
//		 }
		
		
		//checking Young or Not Young
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Age:");
//		int age=sc.nextInt();
//		
//		if(age>=14 && age<=55) {
//			System.out.println("Young");
//		}else {
//			System.out.println("Not Young");
//		}
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter M1 Marks:");
		int m1=sc.nextInt();
		System.out.println("Enter M2 Marks:");
		int m2=sc.nextInt();
		System.out.println("Enter M3 Marks:");
		int m3=sc.nextInt();
		
		int avg=(m1+m2+m3)/3;
		if(avg>=70) {
			System.out.println("A Grade");
		}else if(avg>=60 && avg<70) {
			System.out.println("B Grade");
		}else if(avg>=50 && avg<60) {
			System.out.println("C Grade");
		}else if(avg>=40 && avg<50) {
			System.out.println("D Grade");
		}else {
			System.out.println("F Grade");
		}
        
	}

}
