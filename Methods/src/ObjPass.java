
public class ObjPass {
   static void Change(int A[],int index,int value)
    {
    	A[index]=value;
    }
   static void Change2(int x,int value)
   {
	   x=value;
   }
	public static void main(String[] args) {
		int A[]= {5,6,7,8,3,5};
        Change(A,2,20); //passing object in the method,it will change entire obj
        for (int i : A) {
			System.out.print(i+",");
		}
        System.out.println("");
        int x=10;
        Change2(x,20);
        System.out.println(x);
	}

}
