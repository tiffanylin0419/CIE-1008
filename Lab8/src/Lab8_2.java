import java.util.Scanner;
public class Lab8_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the coefficients of the quadratic equation: ");
		int a,b,c;
		System.out.print("a=");
		a=input.nextInt();
		System.out.print("b=");
		b=input.nextInt();
		System.out.print("c=");
		c=input.nextInt();
		QuadraticEquation q=new QuadraticEquation(a,b,c);
		if(q.getDiscriminant(a,b,c)<0) 
			System.out.print("The equation has no real roots.");
		else if(q.getDiscriminant(a,b,c)!=0) 
			System.out.printf("The roots are: %.1f and %.1f",q.getRoot1(a,b,c),q.getRoot2(a,b,c));
		else
			System.out.printf("The equation only has one root: %.1f",q.getRoot1(a,b,c));
	}
	
}
class QuadraticEquation{
	int a,b,c;
	QuadraticEquation(int a1,int b1,int c1){
		a=a1;b=b1;c=c1;
	}
	static int getDiscriminant(int a,int b,int c) {
		return(b*b-4*a*c);
	}
	static double getRoot1(int a,int b,int c) {
		return(-b+Math.pow(getDiscriminant(a,b,c), 0.5))/2/a;
	}
	static double getRoot2(int a,int b,int c) {
		return(b+Math.pow(getDiscriminant(a,b,c), 0.5))/2/a;
	}
}