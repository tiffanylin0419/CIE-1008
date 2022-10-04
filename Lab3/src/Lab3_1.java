import java.util.Scanner;
public class Lab3_1 {

	public static void main(String[] args) {
		System.out.print("Enter a noun which ends with: vowel + y, or consonant + y:");
		Scanner input = new Scanner(System.in);
		String a=input.nextLine();
		int n=a.length();
		char b=a.charAt(n-2);
		if((int)b==(int)'a'||(int)b==(int)'e'||(int)b==(int)'i'||(int)b==(int)'o'||(int)b==(int)'u')
			a=a+"s";
		else
			a=a.substring(0,n-1)+"ies";
		System.out.println(a);
	}

}
