package inheritance;
class Rectangle
{
	public int length;
	public int breath;
	Rectangle(){
		length=breath=1;
	}
	Rectangle(int l,int b)
	{
		length=l;
		breath=b;
	}
}
class Cuboid extends Rectangle
{
	public int height;
	Cuboid(){
		height=1;
	}
	Cuboid(int h)
	{
		height=h;
	}
	Cuboid(int l ,int b,int h)
	{
		super(l,b);
		height=h;
	}
    int Volume()
    {
    	return length*breath*height;
    }
}
public class SuperCons {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(5,3,4);
		System.out.println(c.Volume());
	}

}
