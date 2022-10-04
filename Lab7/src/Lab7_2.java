import java.util.Scanner;

public class Lab7_2 {

	public static boolean isConsecutiveFour(int[] a) {
		int n=a.length;
		int c=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]==a[i+1]) {
				c++;
				if(c==3)
					return true;
			}
			else
				c=0;
			}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int num = input.nextInt();
		int [] a = new int [num];
		System.out.print("Enter the values: ");
		for(int i=0;i<num;i++)
			 a[i]= input.nextInt();
		if(isConsecutiveFour(a))
			System.out.print("The series has consecutive fours");
		else
			System.out.print("The series has no consecutive fours");
	}

}
