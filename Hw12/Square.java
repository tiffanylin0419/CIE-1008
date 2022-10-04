
public class Square extends GeometricObject {
  private double length = 1.0;

  /** Constructor */
  public Square() {
  }

  /** Constructor */
  public Square(double length) {
    this.length = length;
  }
  
  public double getLength() {
    return length;
  }

  @Override
  public double getArea() {
    return length*length;
  }

  @Override
  public double getPerimeter() {
    return 4.0*length;
  }

  @Override 
  public String toString() {
    // Implement it to return the three sides
	return String.format("Square: length = %5.3f", length) ;
  }
}
