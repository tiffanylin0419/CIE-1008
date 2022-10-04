import java.util.Scanner;

public class Lab7_3 {

	public static double[][] addMatrix(double[][] a, double[][] b){
		double [][] c = new double [3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				 c[i][j]= a[i][j]+b[i][j];
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		double [][] a = new double [3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				 a[i][j]= input.nextDouble();
		System.out.print("Enter matrix2: ");
		double [][] b = new double [3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				 b[i][j]= input.nextDouble();
		double [][] c = addMatrix( a, b);
		
		System.out.println("The addition of the matrices is ");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",a[0][i]);
		System.out.print("     ");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",b[0][i]);
		System.out.print("     ");
		for(int i=0;i<3;i++)
			System.out.printf("%5.1f",c[0][i]);
		System.out.print("\n");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",a[1][i]);
		System.out.print("  +  ");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",b[1][i]);
		System.out.print("  =  ");
		for(int i=0;i<3;i++)
			System.out.printf("%5.1f",c[1][i]);
		System.out.print("\n");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",a[2][i]);
		System.out.print("     ");
		for(int i=0;i<3;i++)
			System.out.printf("%4.1f",b[2][i]);
		System.out.print("  =  ");
		for(int i=0;i<3;i++)
			System.out.printf("%5.1f",c[2][i]);
		System.out.print("\n");
		
		double []s = new double [3];
		for(int i=0;i<3;i++)
			s[i]=c[i][0]+c[i][1]+c[i][2];
		int r=0;
		double min=0;
		for(int i=0;i<2;i++)
			if(s[i]>s[i+1]) {
				r=i+1;
				min=s[i+1];
			}
		System.out.printf("Row %d has the minimum sum of %.1f",r,min);
	}

}
