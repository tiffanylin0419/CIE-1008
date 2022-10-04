import java.util.Scanner;

public class Hw5_3 {

	public static int reverse(int a) {
		int b=0;
		for(;a!=0;) {
			b*=10;
			b+=a%10;
			a/=10;
			
		}
		
		
		return b;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the integer to reverse: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		System.out.print("After reverse: "+reverse(a));
	}

}
