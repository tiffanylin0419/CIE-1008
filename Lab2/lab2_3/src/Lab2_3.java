import java.util.Scanner;
public class Lab2_3 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter weight in kilograms:");
		double i=input.nextDouble();
		System.out.print("Enter the height in centimeters:");
		double j=input.nextDouble();
		System.out.print("BMI for weight "+i+" kg height "+j+" cm is "
		+i*10000/j/j);
	}

}
