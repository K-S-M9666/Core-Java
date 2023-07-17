package arrays;

public class ArrayTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int B[] = {3,9,7,8,12,45,15,20,4,10};
		int max1=B[0];
		int max2=B[0];

		
		for(int i=0;i<B.length;i++)
		{
			if(B[i]>max1)
			{
				max2=max1;
				max1=B[i];
			}else 
				if(B[i]>max2)
				{
					max2=B[i];
				}
		}
		System.out.println("Max 1 : "+max1);
		System.out.println("Max 2 : "+max2);
	}
	

}
