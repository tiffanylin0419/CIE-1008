import java.util.Scanner;

public class Hw7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows for matrix1: ");
		int r=input.nextInt();
		System.out.print("Enter the number of columns for matrix1: ");
		int c=input.nextInt();
		double [][] a = new double [r][c];
		System.out.print("Enter matrix1: ");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=input.nextDouble();
		System.out.println("The number of rows for matrix2 must be equal to the number of columns in matrix 1");
		System.out.println("Thus the number of rows for matrix2 is "+ c);
		System.out.println("The number of columns for matrix2 is " + r);
		double [][] b = new double [c][r];
		System.out.print("Enter matrix2: ");
		for(int i=0;i<c;i++)
			for(int j=0;j<r;j++)
				b[i][j]=input.nextDouble();
		System.out.println("");
		System.out.println("Matrix 1 is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.printf("%4.1f",a[i][j]);
			System.out.println("");
		}
		System.out.println("\nMatrix 2 is: ");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++)
				System.out.printf("%4.1f",b[i][j]);
			System.out.println("");
		}
	
		double [][] m = new double [r][r];
		for(int i=0;i<r;i++) 
			for(int j=0;j<r;j++)
				for(int k=0;k<c;k++)
					m[i][j]+=a[i][k]*b[k][j];
		
		System.out.println("The resulting matrix after multiplication of Matrix 1 and Matrix 2 is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++)
				System.out.printf("%4.1f",m[i][j]);
			System.out.println("");
		}
		
	}

}
