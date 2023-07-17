package myfirst;

public class StudentCha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="a!b@c#f$1%2A";
      String str2=str.replaceAll("[^a-bA-Z0-9]", "");
      System.out.println(str2);
      
      String str3="   Abv  def  fgh ijk";
      str=str3.replaceAll("\\s+", " ").trim();
      String Words[]=str.split("\\s");
      System.out.println(Words.length);
      
      
      
      
	}

}
