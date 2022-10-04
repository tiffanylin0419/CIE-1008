
public class Square extends GeometricObject implements Colorable{
	double length=1;
	Square(int length){
		this.length=length;
	}
	
	
	  
	public double getArea() {
		return length*length;
	}

	  
	public double getPerimeter() {
		  return length*4;
	}
	public void howToColor() {
		System.out.println("Color all four sides");
		return;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
