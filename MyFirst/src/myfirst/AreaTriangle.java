package myfirst;

import java.lang.*;
import java.util.*;

public class AreaTriangle {
  
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	   float base,height,area;
	   System.out.println("Enter base and Height :");
	   base=sc.nextFloat();
	   height=sc.nextFloat();
	   area =(base*height)/2;
	   System.out.println("The area of Triangle is :" +area);
	}
}
