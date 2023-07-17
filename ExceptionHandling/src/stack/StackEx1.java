package stack;
class StackOverFlow extends Exception
{
	public String toString()
	{
		return "Stack is Full";
	}
}
class StackUnderFlow extends Exception
{
	public String toString()
	{
		return "Stack is Empty";
	}
}
class Stack
{
	private int size;
	private int top=-1;
	private int s[];
	
	public Stack(int si)
	{
		size=si;
		s=new int[si];
	}
	public void push(int x) throws StackOverFlow
	{
		if(top==size-1)
			throw new StackOverFlow();
		top++;
		s[top]=x;
	}
	public int pop() throws StackUnderFlow
	{
		int x=-1;
		if(top==-1)
			throw new StackUnderFlow();
		x=s[top];
		top--;
		return x;
	}
}
public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
