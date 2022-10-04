
public class Lab5_3 {

	
	public static void whatType(int val) {
		System.out.println("Type int for value "+val);
		}

	public static void whatType(double val) {
		System.out.println("Type double for value "+val);
	}
	public static void whatType(char val) {
		System.out.println("Type char for value "+val);
	}
	public static void whatType(String val) {
		System.out.println("Type String for value "+val);
	}
	
	public static void main(String[] args) {
		int i = 3;
		double d = 6.2;
		char c = 's';
		String str = "Java";
		whatType(i);
		whatType(d);
		whatType(c);
		whatType(str);
		
		
	}

}
