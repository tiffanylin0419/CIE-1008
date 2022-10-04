import java.util.Random;

public class Lab11_2 {

	public static void main(String[] args) {
		GeometricObject[] coll = new GeometricObject[3];
		for (int i = 0; i < coll.length; i++){
			coll[i] = newShape();
			coll[i].display();
		}
	}
	static GeometricObject newShape() {
		Random rand = new Random();
		int n = rand.nextInt(2);
		double l=rand.nextDouble();
		GeometricObject g;
		if(n==0) {
			g=new Circle(l,"red",true);
		}
		else {
			g=new Square(l,"red",true);
		}
		return g;
	}
}
class Circle extends GeometricObject{
	double radius=0.5;
	Circle(){
		super();
	}
	Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
		
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void display(){
		System.out.println("The Circle object is created on "+super.getDateCreated());
		System.out.println("color: "+super.getColor()+" and filled: "+super.isFilled());
		System.out.printf("radius: "+radius+" area: "+getArea()+" and perimeter: "+getPerimeter()+"\n");
	}
	
}