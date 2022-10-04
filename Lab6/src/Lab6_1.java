import java.util.Scanner;

public class Lab6_1 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Please input the number of int you wish to store in the array: ");
		int n=input.nextInt(),s=0;
		double ave;
		int []a= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Input the "+(i+1)+" number to be stored in array:");
			a[i]=input.nextInt();
			s+=a[i];
		}
		ave=s*1.0/n;
		System.out.println("Length of array: "+n);
		System.out.print("Elements of array: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSum of array: "+s);
		System.out.println("Average of array: "+ave);
		System.out.print("The numbers larger than average: ");
		for(int i=0;i<n;i++) {
			if(a[i]>ave)
			System.out.print(a[i]+" ");
		}
		
	

	}

}
