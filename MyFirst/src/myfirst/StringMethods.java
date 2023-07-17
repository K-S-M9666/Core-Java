package myfirst;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Java";
       String s="Welcome";
       
       int l= str.length();
       String str1=str.toLowerCase();
       String str2=s.trim();
       String str3 =str.substring(3);
       String str4=s.substring(3,6);
       String str5=s.replace('l', 'W');
      
       System.out.println(l);
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
       System.out.println(str4);
       System.out.println(str5);
       
       String st=new String("netbeans");
       System.out.println(st.charAt(2));
       
       
       String a=new String("Programmer");
       System.out.println(a);
       a=a.toUpperCase();
       System.out.println(a);
       String b=a.substring(4,8);
       System.out.println(b);
       
       String d="www.udemy.com";
        System.out.println(d.startsWith("www"));
        System.out.println(d.charAt(4));
        System.out.println(d.indexOf("."));
        System.out.println(d.indexOf("?"));
        System.out.println(d.lastIndexOf("."));
       
       
	}

}
