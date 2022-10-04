import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		System.out.print("Please input odd or even:");
		Scanner input= new Scanner(System.in);
		String a=input.next();
		if(a.equals("odd")){
			for(int i=0;i<=24;i++) {
				System.out.printf("%3d",2*i+1);
				if(i%5==4)
					System.out.print("\n");
			}
				
		}
		if(a.equals("even")){
			for(int i=1;i<=25;i++) {
				System.out.printf("%3d",2*i);
				if(i%5==0)
					System.out.print("\n");
			}
				
		}
		else
			System.out.print("Wrong input!");
	}

}
