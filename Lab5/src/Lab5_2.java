import java.util.Scanner;

public class Lab5_2 {

	
	public static int sumDigits(long n) {
		int total=0;
		for(;n!=0;n/=10)
			total+=(n%10);
		return total;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner input=new Scanner(System.in);
		long a=input.nextLong();
		int total=sumDigits(a);
		System.out.print(total);

	}

}
