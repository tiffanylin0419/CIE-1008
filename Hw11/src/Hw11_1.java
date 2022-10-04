public class Hw11_1 {

	public static void main(String[] args) {
		GeometricObject g1 = new GeometricObject();
		g1.display();
		GeometricObject g2 = new GeometricObject("red", true);
		g2.display();
		Triangle t1 = new Triangle();
		t1.display();
		Triangle t2 = new Triangle(3, 4, 5, "green", true);
		t2.display();

	}

}

class Triangle extends GeometricObject{
	double side1=1,side2=1,side3=1;
	
	Triangle(){
		super();
		
	}
	Triangle(double side1,double side2,double side3,String color,boolean filled){
		super(color,filled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}
	public double getArea() {
		double s=(side1+side2+side3)/2;
		return Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public void display(){
		System.out.println("The Triangle object is created on "+super.getDateCreated());
		System.out.println("color: "+super.getColor()+" and filled: "+super.isFilled());
		System.out.printf("side1: "+side1+" side2: "+side2+" side3: "+side3+"\n");
		System.out.printf("area: "+getArea()+" and perimeter: "+getPerimeter()+"\n");
		return;	
	}
}
