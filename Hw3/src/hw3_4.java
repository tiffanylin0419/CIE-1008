import java.util.Scanner;

public class hw3_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=(int)(Math.random()*52)+1;

		System.out.print("The card you picked is ");
		if(i%13==1){
			System.out.print("Ace of ");
		}
		else if(i%13==2){
			System.out.print("2 of ");
		}
		else if(i%13==3){
			System.out.print("3 of ");
		}
		else if(i%13==4){
			System.out.print("4 of ");
		}
		else if(i%13==5){
			System.out.print("5 of ");
		}
		else if(i%13==6){
			System.out.print("6 of ");
		}
		else if(i%13==7){
			System.out.print("7 of ");
		}
		else if(i%13==8){
			System.out.print("8 of ");
		}
		else if(i%13==9){
			System.out.print("9 of ");
		}
		else if(i%13==10){
			System.out.print("10 of ");
		}
		else if(i%13==11){
			System.out.print("Jack of ");
		}
		else if(i%13==12){
			System.out.print("Queen of ");
		}
		else if(i%13==0){
			System.out.print("King of ");
		}
		
		
		
		if(i%4==0)
			System.out.print("Clubs");
		else if(i%4==1)
			System.out.print("Diamonds");
		else if(i%4==2)
			System.out.print("Hearts");
		else if(i%4==3)
			System.out.print("Spades");
	}

}
