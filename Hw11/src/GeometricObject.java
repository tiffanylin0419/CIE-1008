

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/**
	 * Return filled. Since filled is boolean, its get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return area */
	public double getArea() {
		return 0.0;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 0.0;
	}

	public void display() {
		System.out.println("The Geometric object is " + "created on "
				+ dateCreated + "\ncolor: " + color + " and filled: " + filled);
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
