import java.util.Scanner;
public class Hw2_1 {

	public static void main(String[] args) {
		System.out.print("Enter x and y:");
		Scanner input =new Scanner (System.in);
		double i=input.nextDouble();
		double j=input.nextDouble();
		System.out.print("The result is "+
		Math.pow(i,j));
	}

}
