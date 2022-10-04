import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		System.out.print("Please input a 2 character student code:");
		Scanner input= new Scanner(System.in);
		String a=input.next();
		switch(a.charAt(0))
		{
		case'M':
			System.out.println("The student majors in Medicine,");
			break;
		case'C':
			System.out.println("The student majors in  Civil engineering,");
			break;
		case'L':
			System.out.println("The student majors in Law,");
			break;
		case'E':
			System.out.println("The student majors in  Electrical Engineering,");
			break;
		case'I':
			System.out.println("The student majors in  Computer Science & Information Engineering,");
			break;
		default:
			System.out.println("The student majors in Unknown,");
		}
		int b=Integer.parseInt(a.substring(1));
		switch(b)
		{
		case 1:
			System.out.println("and is in year: *.");
			break;
		case 2:
			System.out.println("and is in year: **.");
			break;
		case 3:
			System.out.println("and is in year: ***.");
			break;
		case 4:
			System.out.println("and is in year: ****.");
			break;
		default:
			System.out.println("and is in year: Unknown.");
		}
		
	}

}
