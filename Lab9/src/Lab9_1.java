import java.util.Scanner;
public class Lab9_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly interest rate for all accounts(%): ");
		Account.setInterestRate(input.nextDouble()/100);
		System.out.print("Enter the ID: ");
		int id=input.nextInt();
		System.out.print("Enter the balance: ");
		double balance=input.nextDouble();
		Account account1=new Account(id,balance);
		System.out.print("Amount of withdraw: ");
		account1.withdraw(input.nextDouble());
		System.out.print("Amount of deposit: ");
		account1.deposit(input.nextDouble());
		Account account2=new Account();
		System.out.print("Enter the ID: ");
		account2.setid(input.nextInt());
		System.out.print("Enter the balance: ");
		account2.setBalance(input.nextDouble());
		System.out.print("Amount of withdraw: ");
		account2.withdraw(input.nextDouble());
		System.out.print("Amount of deposit: ");
		account2.deposit(input.nextDouble());
		
		System.out.printf("****Information of Account ID %d****\n",account1.getId());
		System.out.printf("Account balance: $%.1f\n",account1.getBalance());
		System.out.printf("Monthly Interest: $%.1f\n",account1.getMonthlyInterest());
		System.out.printf("****Information of Account ID %d****\n",account2.getId());
		System.out.printf("Account balance: $%.1f\n",account2.getBalance());
		System.out.printf("Monthly Interest: $%.1f\n",account2.getMonthlyInterest());
	}

}
class Account{
	private int id=0;
	private double balance=0;
	private static double monthlyInterestRate;
	Account(){
		
	}
	Account(int id,double balance){
		this.id=id;
		this.balance=balance;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getInterestRate(){
		return monthlyInterestRate;
	}
	
	public void setid(int n){
		id=n;
		return;
	}
	public void setBalance(double n){
		balance=n;
		return;
	}
	public static void setInterestRate(double n){
		monthlyInterestRate=n;
		return;
	}
	public double getMonthlyInterest() {
		return balance*monthlyInterestRate;
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