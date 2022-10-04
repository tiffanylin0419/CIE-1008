import java.lang.Comparable;
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
	double width=1;
	double height=1;
	
	
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return height*width;
	}

	  
	  public double getPerimeter() {
		  return 2*(height+width);
	  };
	  @Override
	  public String toString() {
		  return "Width: "+width+" Height: "+height+" Area: "+getArea();
	  }
	  
	  public int compareTo(Rectangle r) {
		  if(r.getArea()<this.getArea())
				return 1;
			return -1;
		  
	  }
	  
}
