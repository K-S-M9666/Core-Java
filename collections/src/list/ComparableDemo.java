package list;
import java.util.*;
import java.util.List;

class Point implements Comparable
{
	int x;
	int y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public String toString()
	{
		return "X="+x+"Y="+y;
	}
	public int compareTo(Object o)
	{
		Point p=(Point)o;
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else
		{
			if(this.y<p.y)
				return -1;
			else if(this.y>p.y)
				return 1;
			else
				return 0;
		}
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
		TreeSet<Point> trs=new TreeSet<>();
		trs.add(new Point(1,1));
		trs.add(new Point(5,5));
		trs.add(new Point(5,2));
		System.out.println(trs);

	}

}
