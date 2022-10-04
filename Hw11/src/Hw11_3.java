import java.util.Scanner;
public class Hw11_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side for RegularTriangle: "); 
		double side = input.nextDouble();
		RegularTriangle triangle = new RegularTriangle(side);
		triangle.display();
		System.out.print("Input length you like to change for the RegularTriangle: ");
		side = input.nextDouble(); 
		triangle.setLength(side);
		triangle.display();
		RegularTriangle t2 = new RegularTriangle(2.0); 
		t2.display();
		input.close();
	}

}
class RegularTriangle extends Triangle{
	static private int instances=1;
	private int ID=instances;
	private double rc;
	private double ri;
	RegularTriangle(double side){
		super.side1=side;
		super.side2=side;
		super.side3=side;
		rc=Math.pow(3, 0.5)*side/3;
		ri=Math.pow(3, 0.5)*side/6;
		instances++;
	}
	public void setLength(double side) {
		super.side1=side;
		super.side2=side;
		super.side3=side;
		rc=Math.pow(3, 0.5)*side/3;
		ri=Math.pow(3, 0.5)*side/6;
		return;
	}
	public void display(){
		System.out.println("The Triangle object is created on "+super.getDateCreated());
		System.out.println("color: "+super.getColor()+" and filled: "+super.isFilled());
		System.out.printf("side: "+side1);
		System.out.printf(" area: "+getArea()+" and perimeter: "+getPerimeter()+"\n");
		System.out.println("id: "+ID+" circumscribed radius: "+rc+" inscribed radius: "+ri);
		
		return;	
	}
	
}