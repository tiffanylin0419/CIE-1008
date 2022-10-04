import java.util.Scanner;
public class Lab3_2 {

	public static void main(String[] args) {
		System.out.print("Enter the real part of Z:");
		Scanner input = new Scanner(System.in);
		double x=input.nextDouble();
		System.out.print("Enter the imaginary part of Z:");
		double y=input.nextDouble();
		int z=-1;
		if(x>0&&y>0)
			z=1;
		else if(x<0&&y>0)
			z=2;
		else if(x<0&&y<0)
			z=3;
		else if(x>0&&y<0)
			z=4;
		double a=Math.toDegrees(Math.atan(y/x));
		System.out.print("Module of Z is "+z+", and its argument is ");
		if(z==2||z==3)
			a+=180;
		if(x==0)
			if(y>0)
				a=90;
			else
				a=270;
		else if(y==0)
			if(x>0)
				a=0;
			else
				a=180;
		System.out.print(a);

	}

}
