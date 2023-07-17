package javaDocDemo;
import java.lang.annotation.*;


@Retention(RetentionPolicy.CLASS)

@Documented

@Target(value=ElementType.FIELD)


@interface MyAnno
{
  String name();
  String project();
  
}
public class AnnoDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
