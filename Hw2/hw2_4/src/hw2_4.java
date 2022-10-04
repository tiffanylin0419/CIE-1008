import java.util.Scanner;
public class hw2_4 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter a, b, c, d, e, f:");
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		float d=input.nextFloat();
		float e=input.nextFloat();
		float f=input.nextFloat();
		if(a*d-b*c==0)
			System.out.print("The equation has no solution");
		else
			System.out.print("x is "+(e*d-b*f)/(a*d-b*c)+" and y is "+(a*f-e*c)/(a*d-b*c));
	}

}
