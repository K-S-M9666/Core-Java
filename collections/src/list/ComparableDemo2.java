package list;
import java.util.*;

class Points implements Comparable
{
	int x;
	int y;
	public Points(int x,int y)
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
		Points p=(Points)o;
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
public class ComparableDemo2 {

	public static void main(String[] args) {
		TreeSet<Points> trs1=new TreeSet<>();
		trs1.add(new Points(1,2));
		trs1.add(new Points(2,6));
		trs1.add(new Points(2,1));
		
		System.out.println(trs1);

	}

}
