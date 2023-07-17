package javaDocDemo;
import java.lang.annotation.*;

@interface MyAnno2
{
	String name();
    String project();
    String date();
    String version() default "13";
}

@MyAnno2(name="Surya",project="Back",date="1/1/2022")
public class AnnoDemo3 {
    //@MyAnno2(name="Surya")
	int data;
	
	//@MyAnno2(name="Surya")
	public static void main( String[] args) {
		//@MyAnno2(name="Surya")
		int x;

	}

}
