
public class Rectangle extends GraphicsObject implements Object2D{
	double width=1;
	double height=1;
	
	Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	public String getName() {
		return"Name: Rectangle; Area = "+getArea();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
	    return getName();
	}
}
