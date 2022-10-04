import java.lang.Comparable;
public class Circle extends GeometricObject implements Comparable<GeometricObject>{
	double radius=1;
	Circle(double radius){
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		  return 2*radius*Math.PI;
	  };
	public int compareTo(GeometricObject g) {
		  if(g.getArea()<this.getArea())
				return 1;
			return -1;
		  
	  }
	@Override
	  public String toString() {
		  return "Circle with Radius: "+radius+" Area: "+getArea();
	  }
}
