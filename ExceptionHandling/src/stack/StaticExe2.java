package stack;
class StackOverFlow1 extends Exception
{
	public String toString()
	{
		return "Stack is Full";
	}
}
class StackUnderFlow1 extends Exception
{
	public String toString()
	{
		return "Stack is Empty";
	}
}
class Stack1
{
 	private int size;
 	private int top=-1;
 	private int s[];
 	
 	public Stack1(int si) 
 	{
 		size=si;
 		s=new int[si];
 	}
 	public void push(int x) throws StackOverFlow1
 	{
 		if(top==size-1)
 			throw new StackOverFlow1();
 		top++;
 		s[top]=x;
 	}
 	public int pop() throws StackUnderFlow1
 	{
 		if(top==-1)
 			throw new StackUnderFlow1();
 		int x=-1;
 		x=s[top];
 		top--;
 		return x;
 	}
}
public class StaticExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
