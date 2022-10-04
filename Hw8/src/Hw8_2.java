import java.util.Scanner;

public class Hw8_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		double a,b,c,d,e,f;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		d=input.nextDouble();
		e=input.nextDouble();
		f=input.nextDouble();
		LinearEquation l=new LinearEquation(a,b,c,d,e,f);
		if(l.isSolvable()) {
			System.out.printf("x is %.1f and y is %.1f",l.getX(),l.getY());
		}
		else
			System.out.println("The equation has no solution");
	}

}
class LinearEquation{
	double a,b,c,d,e,f;
	LinearEquation(double aa,double bb,double cc,double dd, double ee,double ff){
	a=aa;b=bb;c=cc;d=dd;e=ee;f=ff;
	}
	
	 boolean isSolvable(){
		 if(Math.abs(a*d-b*c)>Math.pow(10,-15))
		 	return true;
		 return false;
	 }
	 double getX(){
		 return ((e*d-b*f)/(a*d-b*c));
	 }
	 double getY(){
		 return ((a*f-e*c)/(a*d-b*c));
	 }
}