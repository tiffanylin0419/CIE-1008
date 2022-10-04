import java.util.Scanner;

public class hw3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c:");
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		if(b*b-4*a*c>0)
			System.out.print("The roots are "+(-b+Math.pow(b*b-4*a*c,0.5))/2/a+" and "+(-b-Math.pow(b*b-4*a*c,0.5))/2/a);
		else if((b*b-4*a*c==0))
			System.out.print("The root is"+(-b+Math.pow(b*b-4*a*c,0.5))/a/2);
		else
			System.out.print("The equation has no real roots");
	}

}
