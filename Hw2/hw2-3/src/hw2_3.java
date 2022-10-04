import java.util.Scanner;
public class hw2_3 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Number of hours worked in a week:");
		float i=input.nextFloat();
		System.out.print("Hourly pat rate:");
		float j=input.nextFloat();
		System.out.print("Federal tax withholding rate:");
		float k=input.nextFloat();
		System.out.print("State tax withholding rate:");
		float l=input.nextFloat();	
		System.out.println("Hours worked:"+i);
		System.out.println("Pat rate: $"+j);
		System.out.println("Gross pay: $"+i*j);
		System.out.println("Deductions:");
		System.out.println(" Federal Withholding("+k*100+"%): $"+i*j*k);
		System.out.println(" State Withholding("+l*100+"%): $"+i*j*l);
		System.out.println(" Total Deduction: $"+i*j*(k+l));
		System.out.println("Net Pay: $"+i*j*(1-k-l));
	}

}
