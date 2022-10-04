public class Lab11_1 {

	public static void main(String[] args) {
		GeometricObject g1 = new GeometricObject();
		g1.display();
		GeometricObject g2 = new GeometricObject("red", true);
		g2.display();
		Square s1 = new Square();
		s1.display();
		Square s2 = new Square(3.5, "green", true);
		s2.display();

	}

}

class Square extends GeometricObject{
	double length=1;
	
	
	
	Square(){
		super();
	}
	Square(double length,String color,boolean filled){
		super(color,filled);
		this.length=length;
		
	}
	public double getArea() {
		return length*length;
	}
	public double getPerimeter() {
		return 4*length;
	}
	
	
	public void display(){
		System.out.println("The Square object is created on "+super.getDateCreated());
		System.out.println("color: "+super.getColor()+" and filled: "+super.isFilled());
		System.out.printf("length: "+length+" area: "+getArea()+" and perimeter: "+getPerimeter()+"\n");
		return;	
	}
}