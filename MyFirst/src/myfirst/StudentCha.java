package myfirst;

public class StudentCha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int b=100101010;
       String str=b+"";
       System.out.println(str.matches("[01]*"));
       
       String h="086737ADF";
       System.out.println(h.matches("[0-9A-F]+"));
       
       String d="01/12/2000";
       System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
       
	}

}
