import java.util.Scanner;

public class Lab6_2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=input.nextInt();
		double []a= new double[n];
		System.out.println("Enter A array elements:");
		for(int i=0;i<n;i++) 
			a[i]=input.nextDouble();
		double []b= new double[n];
		System.out.println("Enter B array elements:");
		for(int i=0;i<n;i++) 
			b[i]=input.nextDouble();
		double p=0;
		for(int i=0;i<n;i++) 
			p+=(a[i]*b[i]);
		System.out.print("The inner product of (A, B) = "+p);
		
	}

}
