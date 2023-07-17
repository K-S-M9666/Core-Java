package myfirst;

public class StringPractise {
	
	public static void main(String args[])
	{
   String str1="Java Program";
   
   String str2=new String("Java");
   
    System.out.println(str1); 
    
    char c[]= {'H','E','L','L','O'};
    String str3=new String(c);
    System.out.println(str3);
    
    byte b[]= {65,66,67,68,69};
    String str4=new String(b);
    System.out.println(str4);
    
    		
    String str5="Java";
    String str6=new String("Java");
    System.out.println(str5==str6);
    
   }
}
