import java.util.Scanner;

public class Hw5_4 {
	public static int factorial(int n) {
		int c=1;
		for(int i=1;i<=n;i++)
			c*=i;

		return c;
	}
	public static void main(String[] args) {
		System.out.print("Please input int for factorial: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("The factorial of "+a+" is "+factorial(a));
		

	}

}
