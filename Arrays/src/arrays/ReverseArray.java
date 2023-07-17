package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[]= {92,3,4,52,43,55,63,64,12,21};
     int B[]=new int[10];
     
     for(int i=0;i<A.length;i++)
     {
    	 B[i]=A[A.length-i-1];
     }
     for (int c : A) {
 		System.out.print(c+",");
 	}
     System.out.println("");
     for (int x : B) {
		System.out.print(x+",");
	}
	}

}
