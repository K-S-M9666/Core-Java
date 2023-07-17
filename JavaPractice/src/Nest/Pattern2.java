package Nest;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
      for(int i=0;i<=5;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  { 
    		  count++;
    		  System.out.format("%02d ",count);
    	  }
    	  System.out.println("");
      }
	}

}
