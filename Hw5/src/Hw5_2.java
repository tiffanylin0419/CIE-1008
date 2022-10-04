import java.util.Scanner;

public class Hw5_2 {

	public static int permutation(int n, int m) {
		int p=1;
		for(int i=n;i>(n-m);i--)
			p*=i;
		return p;
	}
	public static int combination(int n, int m) {
		int c=1;
		for(int i=n;i>(n-m);i--)
			c*=i;
		for(int i=1;i<=m;i++)
			c/=i;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.print("Please input 2 int numbers: ");
		Scanner input=new Scanner(System.in);
		int a,b;
		int A=input.nextInt();
		int B=input.nextInt();
		if(A<B) {
			a=B;b=A;
		}
		else {
			a=A;b=B;
		}
		int p=permutation(a,b);
		int c=combination(a,b);
		System.out.println("Permutation of ("+A+","+B+") is "+p);
		System.out.println("Permutation of ("+A+","+B+") is "+c);
	}

}
