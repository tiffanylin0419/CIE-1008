
public class Triangle extends GeometricObject {
  private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

  /** Constructor */
  public Triangle() {
  }

  /** Constructor */
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  
  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }
  
  public double getSide3() {
    return side3;
  }
  
  @Override
  public double getArea() {
	if ((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)) return 0.0;
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override 
  public String toString() {
    // Implement it to return the three sides
	return String.format("Triangle: side1 = %5.3f side2 = %5.3f side3 = %5.3f", side1, side2, side3) ;
  }
}
