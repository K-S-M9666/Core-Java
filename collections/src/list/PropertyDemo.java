package list;
import java.util.*;
import java.io.*;

public class PropertyDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
//		p.setProperty("Brand", "Dell");
//		p.setProperty("Processor", "i7");
//		p.setProperty("OS", "Windows10");
//		p.setProperty("Model", "Latitude");
//		
//		p.storeToXML(new FileOutputStream("D:\\File\\MyData.xml"), "Laptop");
 
		p.loadFromXML(new FileInputStream("D:\\File\\MyData.xml"));
		System.out.println(p.getProperty("Brand"));
		System.out.println(p);
	}

}
