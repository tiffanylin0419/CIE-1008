import java.util.Scanner;

public class Hw6_1 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Input size: ");
		int n=input.nextInt();
		int i,j;
		int []a= new int[n];
		for(i=0;i<n;i++) 
			a[i]=input.nextInt();
		
		for(j=n;j>0;j--) {
			for(i=0;i<j;i++)
				System.out.print(a[i]+" ");
			System.out.println("");
		}
			
		
		
		}
	
}
