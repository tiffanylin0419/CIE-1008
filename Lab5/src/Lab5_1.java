import java.util.Scanner;
public class Lab5_1 {

	public static void displayValues(double num) {
		
		System.out.println("The integral portion is:"+Math.floor(num));
		double g=num-Math.floor(num);
		System.out.printf("The decimal portion is:%.4f\n",g);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a floating number, Q to quit:");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		for(;a.charAt(0)!='Q';a=input.next()) {
			double n=Double.parseDouble(a);
			displayValues(n);
			System.out.print("Enter a floating number, Q to quit:");
			
		}
		
		

	}

}
