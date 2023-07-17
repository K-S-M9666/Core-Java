package arrays;

public class MultiMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[][]= {{3,5,9},{7,6,2},{4,3,5}};
     int B[][]= {{1,0,0},{0,1,0},{0,0,1}};
     int c[][]=new int[3][3];
     
     for(int i=0;i<A.length;i++)
     {
    	 for(int j=0;j<A[0].length;j++)
    	 {
    		 for(int k=0;k<A[0].length;k++)
    		 {
    			 c[i][j]=c[i][j]+A[i][k]*B[k][j];
    		 }
    	 }
     }
     for (int[] is : c) {
		for (int is2 : is) {
			System.out.print(is2+" ");
		}
		System.out.println("");
	}
	}

}
