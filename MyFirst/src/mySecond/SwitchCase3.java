package mySecond;
import java.util.*;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Domain name");
      String ext=sc.nextLine();
      String name=ext.substring(ext.lastIndexOf(".")+1);
      switch(name)
      {
      case "com":System.out.println("Commercial");
      break;
      case "gov":System.out.println("Government");
      break;
      case "net":System.out.println("Network");
      break;
      default:System.out.println("Not Valid");
      }
	}

}
