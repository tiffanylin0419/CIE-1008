import java.util.Scanner;

public class Lab6_3 {

	
	public static int randomCount(int i,int n,int[] a) {
		int s=0;
		for(int j=0;j<n;j++)
		if(a[j]==i)
			s++;
		
		return s;

	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of single-digit random numbers to be generated: ");
		int n=input.nextInt();
		int []a= new int[n];
		System.out.println(n+" random numbers are: ");
		for(int i=0,c=1;i<n;i++,c++) {
			a[i]=(int)(10*Math.random());
			System.out.print(a[i]+" ");
			if(c%10==0)
				System.out.println("");
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+" appears "+randomCount(i,n,a)+" times.");
		}
		
		
		
	}

}
