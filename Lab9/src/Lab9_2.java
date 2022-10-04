import java.util.Random;
public class Lab9_2 {

	public static void main(String[] args) {
		double area=0;
		Circle c=new Circle();
		Square s=new Square();
		Random r=new Random();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d :",i);
			if(r.nextBoolean()) {
				System.out.println("Circle");
				c.setRadius(i);
				area+=c.getArea();
			}
			else {
				System.out.println("Square");
				s.setLength(i);
				area+=s.getArea();
				
			}
		}
		System.out.printf("Number of circles: %d \n",c.getNumOfCircles());
		System.out.printf("Number of squares: %d \n",s.getNumOfSquares());
		System.out.printf("Total area: %f \n",area);
	}

}
class Circle{
	private double radius=1;
	private static int numOfCircles=0;
	Circle(){
		
	}
	public void setRadius(double n) {
		radius=n;
		numOfCircles++;
		return;
	}
	public int getNumOfCircles() {
		return numOfCircles;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
class Square{
	private double length=1;
	private static int numOfSquares=0;
	Square(){
		
	}
	public void setLength(double n) {
		length=n;
		numOfSquares++;
		return;
	}
	public int getNumOfSquares() {
		return numOfSquares;
	}
	public double getArea() {
		return length*length;
	}
}