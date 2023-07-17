package arrays;

import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int b[] = {3,9,7,8,12,6,15,5,4,10};
	    System.out.println("Enter key value : ");
	    int key=sc.nextInt();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==key)
			{
				System.out.println("Found at : " + i);
				System.exit(0);
			}
		}
		System.out.println("Not Found");
	}

}
