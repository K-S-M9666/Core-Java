package mySecond;
import java.util.*;

public class StudentChal5 {
  public static void main(String args[])
  {
//	  Scanner s=new Scanner(System.in);
//	  System.out.println("Enter Day :");
//	  int day=s.nextInt();
//	  if(day==1) {
//		  System.out.println("Monday");
//	  }else if(day==2) {
//		  System.out.println("Tuesday");
//	  }else if(day==3) {
//		  System.out.println("Wednesday");
//	  }else if(day==4) {
//		  System.out.println("Thrusday");
//	  }else if(day==5) {
//		  System.out.println("Friday");
//	  }else if(day==6) {
//		  System.out.println("Saturday");
//	  }else if(day==7) {
//		  System.out.println("Sunday");
//	  }else {
//		  System.out.println("Invalid Day");
//	  }
	  
	  
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter Website :");
	  String url=s.nextLine();
	  String protocal=url.substring(0,url.indexOf(":"));
	  if(protocal.equals("http")) 
		  System.out.println("Hyper text Protocal");
	  else if(protocal.equals("ftp")) 
		  System.out.println("File text Protocal");
	  
	  
	  
	  String name=url.substring(url.lastIndexOf(".")+1);
	  if(name.equals("com")) 
		  System.out.println("Commercial");
	  else if(name.equals("gov")) 
		  System.out.println("Government");
	  else if(name.equals("net")) 
		  System.out.println("Network");
	  else {
		  System.out.println("Invalid");
	  }
	  
	  
	  
	  
  }
}
