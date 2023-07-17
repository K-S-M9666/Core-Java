package arrays;

public class ArrayOfObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]= {"Java","Python","Smalltalk","Basics","Pascal"};
       java.util.Arrays.sort(arr);
       
       for (String x : arr) {
		System.out.println(x);
	}
	}

}
