public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return area */
  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }
  
  /** Return perimeter */
  @Override
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  @Override 
  public String toString() {
    // Implement it to return the three sides
	return "Circle: radius = " + radius + " " + super.toString();
  }
  @Override
  public void display() {
	  System.out.println(toString());


	  return;
  }
}
