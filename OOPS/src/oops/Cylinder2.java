package oops;
class Cyli
{
	private int radius;
	private int height;
	int getRadius()
	{
		return radius;
	}
	int getHeight()
	{
		return height;
	}
	void setRadius(int r)
	{
		if(r>0)
			radius=r;
		else
			radius=0;
	}
	void setHeight(int h)
	{
		if(h>0)
			height=h;
		else
			height=0;
	}
	Cyli()
	{
		radius=0;
		height=0;
	}
	Cyli(int r)
	{
		height=1;
	}
	Cyli(int r,int h)
	{
		radius=r;
		height=h;
	}
}
public class Cylinder2 {

	public static void main(String[] args) {
		

	}

}
