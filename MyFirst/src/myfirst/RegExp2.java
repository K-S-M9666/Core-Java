package myfirst;

public class RegExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="abc";
//         System.out.println(str1.matches("[abc]{2,5}"));
         
         String str2="surya@gmail.com";
         System.out.println(str2.matches("\\w*@gmail(.*)"));
	}

}
