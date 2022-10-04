import java.util.Scanner;

public class Hw4_1 {

	public static void main(String[] args) {
		System.out.print("Enter a sequence of positive integers (! to end the input):");
		Scanner input= new Scanner(System.in);
		String a=input.next();
		int l=a.length();
		l--;
		long b=Long.parseLong(a.substring(0,l));
		for(int i=l;i>1;i--) {
			while(i>1&&b/((int)Math.pow(10,i-1))==(b-(int)Math.pow(10,i-1)*(b/((int)Math.pow(10,i-1))))/((int)Math.pow(10,i-2))) {
				b-=(int)Math.pow(10,i-1)*(b/((int)Math.pow(10,i-1)));
				i--;
				
			}
			if(i!=2) {
			System.out.print(b/((int)Math.pow(10,i-1)));
			b-=Math.pow(10,i-1)*(b/((int)Math.pow(10,i-1)));
			}
			else if(i==2) {
				System.out.print(b/((int)Math.pow(10,i-1)));
				if(b/10!=(b-1*(b/10)))
				b-=Math.pow(10,i-1)*(b/((int)Math.pow(10,i-1)));
				System.out.print(b);
				}
			
		}
		
			
			
		
		
		
	}

}
