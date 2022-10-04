import java.util.Scanner;

public class hw3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Mr. Bon says, ");
		String a=input.nextLine();
		int n=a.length();
		int i;
		if((int)(a.charAt(0))==(int)'"')
			a=a.substring(1,n-1);
		n=a.length();
		for(i=0;i<n;i++) {
			if((int)(a.charAt(i))==(int)'-')
				if((int)(a.charAt(i-1))==(int)(a.charAt(i+3))&&(int)(a.charAt(i-2))==(int)(a.charAt(i+2))&&(int)(a.charAt(i-3))==(int)(a.charAt(i+1))) {
					a=a.substring(0,i)+a.substring(i+4,n);
					n=a.length();
					i=0;
				}
		}
		for(i=0;i<n;i++) {
			if((int)(a.charAt(i))==(int)'-')
				if((int)(a.charAt(i-1))==(int)(a.charAt(i*2))) {
					a=a.substring(i+1,n);
					n=a.length();
					i=0;
				}
		}
		
		
		System.out.print(a);
			

	}

}
