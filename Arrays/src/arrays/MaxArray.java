package arrays;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x[]= {10,20,30,40,100,60,70,80,90};
      int max=x[0];
      
      for(int i=0;i<x.length;i++)
      {
    	  if(x[i]>max)
    	  {
    		  max=x[i];
    	  }
      }
      System.out.println(max);
	}

}
