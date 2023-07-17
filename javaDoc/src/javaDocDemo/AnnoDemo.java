package javaDocDemo;

import java.util.List;

class Parent
{
	public void display() 
	{
		
	}
}
class Child extends Parent
{
	@Override
	public void display()
	{
		
	}
}

class OldClass
{
	public void display()
	{
		System.out.println("Hello");
	}
	@Deprecated
	public void show()
	{
		System.out.println("Hi");
	}
}
@FunctionalInterface
interface My
{
	public void show();
//	public int add(int x,int y)
}
public class AnnoDemo {
//	static List l;
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
//    	l.add(10);
		OldClass oc=new OldClass();
		oc.show();

	}

}
