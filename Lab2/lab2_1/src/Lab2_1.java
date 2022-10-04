import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		System.out.println("Enter an integer between 0 and 1000:");
		Scanner input =new Scanner (System.in);
		int i=input.nextInt(),k=1;
		for(int j=0;j<3;j++)
			if(i%10!=0)
			{
				k*=i%10;
				i=i/10;
			}
			else
				i=i/10;
		System.out.println(k);


	}

}
