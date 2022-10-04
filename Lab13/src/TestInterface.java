
public class TestInterface {

	public static void main(String[] args) {
		Square square = new Square(2);
		square.howToColor();
		System.out.println("Color of square: " + square.getColor()); System.out.println("Area of square: " + square.getArea()); System.out.println("Perimeter of square: " +
		   square.getPerimeter());
		    }
}
