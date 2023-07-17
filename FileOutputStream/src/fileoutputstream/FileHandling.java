package fileoutputstream;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) throws Exception{
		File f=new File("D:\\File");
		System.out.println(f.isDirectory());
		File list[]=f.listFiles();
		
		for (File x : list) {
			System.out.println(x.getName());
			System.out.println(x.getPath());
			System.out.println(x.getParent());
		}
		

	}

}
