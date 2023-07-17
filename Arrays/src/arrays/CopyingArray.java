package arrays;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[]= {10,9,8,7,6,5,4,3,2,1};
     int B[]=new int[10];
     
     for(int i=0;i<A.length;i++)
     {
    	 B[i]=A[i];
     }
     for (int i : B) {
		System.out.print(i+",");
	}
     
	}

}
