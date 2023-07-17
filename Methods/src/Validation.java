
public class Validation {
    static boolean Validate(String name)
    {
    	return name.matches("[a-zA-Z\\s]+");
    }
    static boolean Validate(int age)
    {
    	return age>=3 && age<=15;			
    }
	public static void main(String[] args) {
		System.out.println(Validate("Surya"));
		System.out.println(Validate(20));
	}

}
