import java.util.Scanner;

public class Hw5_1 {
	public static int getIntPortion(double num) {
		return (int)Math.floor(num);
	}
	public static double getDecimalPortion(double num) {
		return num-Math.floor(num);
	}
	
	public static void main(String[] args) {
		System.out.print("Please input a number:");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		
			double n=Double.parseDouble(a);
			int x=getIntPortion(n);
			double y=getDecimalPortion(n);
			
			System.out.println("The integral portion is:"+x);

			System.out.printf("The decimal portion is:%.4f\n",y);
			
			
			
	}

}
