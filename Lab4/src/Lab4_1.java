import java.util.Scanner;
public class Lab4_1 {

	public static void main(String[] args) {
		System.out.print("Please input two integers:");
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.print("Integers in range ["+a+", "+b+"):");
		for(int i=a;i<b;i++)
			System.out.print(" "+i);
		
	}

}
