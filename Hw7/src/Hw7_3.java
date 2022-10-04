import java.util.Scanner;

public class Hw7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points:");
		int num = input.nextInt();
		System.out.print("Enter "+num+" points: ");
		double [][] a = new double [num][2];
		for(int i=0;i<num;i++) 
			for(int j=0;j<2;j++)
				a[i][j]= input.nextDouble();
		int f=0,s=0;
		double min=Math.pow((a[0][0]-a[1][0])*(a[0][0]-a[1][0])+(a[0][1]-a[1][1])*(a[0][1]-a[1][1]), 0.5);
		for(int i=num-1;i>0;i--) 
			for(int j=0;j<i;j++) {
				if(min>Math.pow((a[i][0]-a[j][0])*(a[i][0]-a[j][0])+(a[i][1]-a[j][1])*(a[i][1]-a[j][1]), 0.5)) {
					f=i;
					s=j;
					min=Math.pow((a[i][0]-a[j][0])*(a[i][0]-a[j][0])+(a[i][1]-a[j][1])*(a[i][1]-a[j][1]), 0.5);
				}
			}
		
		System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)",a[f][0],a[f][1],a[s][0],a[s][1]);
	
	}

}
