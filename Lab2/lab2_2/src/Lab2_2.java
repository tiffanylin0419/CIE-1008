import java.util.Scanner;
public class Lab2_2 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter the amount of water in kilograms:");
		float i=input.nextFloat();
		System.out.print("Enter the initial temperature:");
		float j=input.nextFloat();
		System.out.print("Enter the final temperature:");
		float k=input.nextFloat();
		System.out.print("The energy needed is "+(k-j)*i*4184);
	}

}
