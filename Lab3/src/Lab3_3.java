import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		int i=(int)(Math.random()*3);
		Scanner input = new Scanner(System.in);
		System.out.print("scissor(0), rock(1), paper(2):");
		int j=input.nextInt();
		System.out.print("The computer is ");
		if(i==0){
			System.out.print("scissor. You are ");
			if(j==0)
				System.out.print("scissor. It is a draw!");
			else if(j==1)
				System.out.print("rock. You win!");
			else if(j==2)
				System.out.print("paper. You loose!");
		}
		else if(i==1){
			System.out.print("rock. You are ");
			if(j==0)
				System.out.print("scissor. You loose!");
			else if(j==1)
				System.out.print("rock. It is a draw!");
			else if(j==2)
				System.out.print("paper. You win!");
		}
		else if(i==2){
			System.out.print("paper. You are ");
			if(j==0)
				System.out.print("scissor. You win!");
			else if(j==1)
				System.out.print("rock. You loose!");
			else if(j==2)
				System.out.print("paper. It is a draw!");
		}
		
	}

}
