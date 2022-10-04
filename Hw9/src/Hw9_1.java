import java.util.Scanner;

public class Hw9_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row=input.nextInt();
		int column=input.nextInt();
		double [][]a=new double[row][column];
		
		for(int i=0;i<row;i++) 
			for(int j=0;j<column;j++) {
				a[i][j]=input.nextDouble();
			}
		
		locateLargest(a);
		System.out.printf("The location of the largest element is %.1f at (%d, %d)",Location.maxValue,Location.row,Location.column);
		
	}

	public static Location locateLargest(double[][] a) {
		Location l=new Location();
		
		for(int i=0;i<a.length;i++) 
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>Location.maxValue) {
					Location.row=i;
					Location.column=j;
					Location.maxValue=a[i][j];
				}
			}
		
		return l;
	}
}
class Location{
	Location(){
		
	}
	static int row;
	static int column;
	static double maxValue;
	
}