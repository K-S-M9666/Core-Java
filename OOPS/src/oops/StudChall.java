package oops;
class Product
{
	private String itemno;
	private String name;
	private double price;
	private int qty;
	public String getItemno() {
		return itemno;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String itemno, String name, double price, int qty) {
		super();
		this.itemno = itemno;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

	
	
}
class Customer
{
	private String custid;
	private String name;
	private String address;
	private long phone;
	public String getCustid() {
		return custid;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Customer(String custid, String name, String address, long phone) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Customer(String custid, String name) {
		super();
		this.custid = custid;
		this.name = name;
	}
	
}
public class StudChall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
