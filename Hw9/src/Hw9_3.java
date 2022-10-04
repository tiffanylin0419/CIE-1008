import java.util.Scanner;
public class Hw9_3 {

	public static void main(String[] args) {
		int i,j;
		Scanner input=new Scanner(System.in);
		Account []m=new Account[10];
		for(int t=0;t<10;t++)
			m[t]=new Account(t);
		while(true) {
			System.out.print("Enter an id: ");
			i=input.nextInt();
			if(i>9)
				continue;
			j=0;
			while(j!=4) {
				System.out.print("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice:");
				j=input.nextInt();
				switch(j) {
				case 1:
					System.out.printf("The balance is %.1f\n",m[i].getBalance());
					break;
				case 2:
					System.out.print("Enter the amount to withdraw");
					m[i].withdraw(input.nextInt());
					break;
				case 3:
					System.out.print("Enter the amount to deposit");
					m[i].deposit(input.nextInt());
					break;
				
				
				}
			}
				
		}
	}
}
class Account{
	private int id=0;
	private double balance=100;
	Account(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	
	public void setid(int n){
		id=n;
		return;
	}
	public void setBalance(double n){
		balance=n;
		return;
	}
	
	
	void withdraw(double n) {
		balance-=n;
		return;
	}
	void deposit(double n) {
		balance+=n;
		return;
	}
}