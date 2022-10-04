import java.util.Scanner;

public class Hw4_2 {

	public static void main(String[] args) {
		System.out.print("Enter the number of lines (1-9):");
		Scanner input= new Scanner(System.in);
		int x=input.nextInt();
		for(int i=x,k=0;i>0&&k<x;i--,k++) {
			for(int j=0;j<k;j++)
				System.out.print(" ");
			for(int l=i;l>0;l--)
				System.out.print(l);
			for(int m=2;m<=i;m++)
				System.out.print(m);
			System.out.print("\n");
				
				
		}

	}

}
