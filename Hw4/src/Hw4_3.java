import java.util.Scanner;

public class Hw4_3 {

	public static void main(String[] args) {
		System.out.print("Please input numbers (ends with 0): ");
		Scanner input= new Scanner(System.in);
		int x=input.nextInt();
		int max=x;
		int count=1;
		x=input.nextInt();
		while(x!=0) {
			
	 		if(x>max) {
	 			max=x;
	 			count=1;
	 		}
	 		else if(x==max) {
	 			count+=1;
	 		}
	 		x=input.nextInt();
		}
		System.out.println("The largest number is "+max+"\n");
		System.out.println("The occurrence count of the largest number is "+count);
	}

}
