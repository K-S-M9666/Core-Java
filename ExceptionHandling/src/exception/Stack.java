package exception;

class StackOverFlow extends Exception
{
	public String toString()
	{
		return "Stack is Full";
	}
}
class StackunderFlow extends Exception
{
	public String toString()
	{
		return "Stack is Empty";
	}
}
class StackExc
{
	private int size;
    private int top=-1;
    private int s[];
    
    public StackExc(int sz)
    {
    	size = sz;
    	s=new int[sz];
    }
    public void push(int x) throws StackOverFlow
    {
    	if(top==size-1)
    		throw new StackOverFlow();
    	top++;
    	s[top]=x;
    }
    public int pop() throws StackunderFlow
    {
    	int x=-1;
    	if(top==-1)
    		throw new StackunderFlow();
    	x=s[top];
    	top--;
    	return x;
    }
}
public class Stack {
    
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
    StackExc st=new StackExc(5);
    try {
    	//st.pop();
		
		  st.push(10); st.push(15); st.push(10); st.push(15); st.push(10);
		 
    	
    }
    catch(StackOverFlow s)
    {
    	System.out.println(s);
    }
	/*
	 * catch(StackOverFlow s1) { System.out.println(s1); }
	 */
	}

}
