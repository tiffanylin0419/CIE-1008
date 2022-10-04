import java.util.Scanner;

public class Hw4_4 {

	public static void main(String[] args) {
		System.out.print("Enter an integer, or quit with Q or q:");
		Scanner input= new Scanner(System.in);
		char q=input.next().charAt(0);
		int x=(int)q-(int)'0';
		int max=x,y=x,c=1;
		int count=1;
		System.out.print("Enter an integer, or quit with Q or q:");
		q=input.next().charAt(0);
		x=(int)q-(int)'0';
		while(x!=(int)'q'-(int)'0'&&x!=(int)'Q'-(int)'0') {
			y+=x;
			c+=1;
	 		if(x>max) {
	 			max=x;
	 			
	 			count=1;
	 		}
	 		else if(x==max) {
	 			count+=1;
	 		}
	 		System.out.print("Enter an integer, or quit with Q or q:");
	 		q=input.next().charAt(0);
			x=(int)q-(int)'0';
		}
		System.out.println("The largest number is "+max);
		System.out.println("The count for the largest number is "+count);
		System.out.print("The average is ");
		System.out.printf("%.2f",y/(float)c);
	}

}
