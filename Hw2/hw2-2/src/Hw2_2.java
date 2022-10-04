import java.util.Scanner;
public class Hw2_2 {

	public static void main(String[] args) {
		System.out.print("Enter the timezone offset to GMT:");
		Scanner input =new Scanner (System.in);
		int i=input.nextInt();
		long milsec=System.currentTimeMillis();
		long sec=milsec/1000;
		long min=sec/60;
		sec%=60;
		long hr=min/60;
		min%=60;
		hr+=i;
		hr%=24;
		System.out.print("Current time is "+hr+":"+min+":"+sec);
	}

}
