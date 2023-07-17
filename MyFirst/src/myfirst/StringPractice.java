package myfirst;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Mr. Surya Manikantha";
        System.out.println(str1.startsWith("Mr"));
        System.out.println(str1.startsWith("Surya", 4));
        
        for(int i=0;i<str1.length();i++)
        	System.out.print(str1.charAt(i));
        
        
        String str2="www.index.com";
        System.out.println(str2.indexOf("."));
	}

}
