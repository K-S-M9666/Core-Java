package mySecond;
import java.util.*;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month");
        int month=sc.nextInt();
        switch(month)
        {
        case 1:System.out.println("Jan");
        break;
        case 2:System.out.println("Feb");
        break;
        case 3:System.out.println("Mar");
        break;
        case 4:System.out.println("Apr");
        break;
        case 5:System.out.println("May");
        break;
        case 6:System.out.println("Jun");
        break;
        case 7:System.out.println("Jul");
        break;
        case 8:System.out.println("Aug");
        break;
        default:System.out.println("Invalid");
        }
	}

}
