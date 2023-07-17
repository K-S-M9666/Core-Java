package objectclass;

enum Dept
{
	CS("john","Block A"),IT("Surya","Block B"),CIVIL("Manikantha","Block C"),ECE("Keerthi","Block D");
	String head;
	String location;
	private Dept(String head,String loc)
	{
		this.head=head;
		this.location=loc;
	}
	public String getHeadName()
	{
		return head;
	}
	public String getLocation()
	{
		return location;
	}
	
}
public class enumDemo {

	public static void main(String[] args) {
		
		Dept d=Dept.ECE;
		
		System.out.println(d.getHeadName());
		System.out.println(d.getLocation());
		
		
//		switch(d)
//		{
//		case CS:System.out.println("Head : John  \nBlock:A");
//		        break;
//		case IT:System.out.println("Head : Surya \nBlock:B");
//        break;
//		case CIVIL:System.out.println("Head : manikantha \nBlock:C");
//        break;
//		case ECE:System.out.println("Head : Keerthi \\nBlock:D");
//        break;
//		}
		
		
		
		
		
		
//		
//		Dept list[]=Dept.values();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
		
		
//		System.out.println(d.name());
//		System.out.println(d.ordinal());

	}

}
