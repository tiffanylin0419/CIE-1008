import java.util.Scanner;

public class Lab10_3 {

	public static void main(String[] args) {
		System.out.print("Please input 5 strings: ");
		Scanner input=new Scanner(System.in);
		int count=0;
		String[] a =new String[5];
		for(int i=0;i<5;i++)
			a[i]=input.next();
		for(int i=0;i<5;i++) {
			System.out.printf("The %d string is %s\n",i+1,a[i]);
			a[i]=a[i].toLowerCase();
			for(int j=0;j<a[i].length();j++)
				while(a[i].matches(".*at.*")) {
					count++;
					a[i]=a[i].substring(a[i].indexOf("at")+2);
				}
					
					
		}
		System.out.println("Occurence of \"at\" is "+count);
	

	}

}
