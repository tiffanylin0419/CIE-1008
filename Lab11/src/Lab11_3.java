import java.util.Scanner;
public class Lab11_3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Which type of pet do you prefer?");
		System.out.print("Enter d for dogs and c for cats: ");
		Pet p;
		String a=inp.next();
		
		if(a.equals("d")) 
			p=new Dog();
		else if(a.equals("c")) 
			p=new Cat();
		else {
		System.out.println("Wrong input!");
		p=new Pet();
		}
		p.makeNoise();
		inp.close();
	}

}
class Pet{
	void makeNoise(){
	System.out.println("mmm!");
	return;
	}
}
class Dog extends Pet{
	void makeNoise(){
	System.out.println("Woof! Woof!");
	return; 
	}
}
class Cat extends Pet{
	void makeNoise(){
	System.out.println("Meow! Meow!");
	return;
	}
}