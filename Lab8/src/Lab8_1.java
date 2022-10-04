
public class Lab8_1 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(3,60);
		Rectangle r3=new Rectangle(3.8,40.9);
		prinn(r1);
		prinn(r2);
		prinn(r3);
		
	}

	
	static void prinn(Rectangle r){
		System.out.printf("The width is %.1f and height is %.1f\n",r.width,r.height);
		System.out.printf("The area of this rectangle is %.3f\n",r.getArea(r.width,r.height));
		System.out.printf("The perimeter of this rectangle is %.3f\n\n",r.getPerimeter(r.width,r.height));
		return;
	}
	
}
class Rectangle{
	double width=1;
	double height=2;
	Rectangle(){
	}
	Rectangle(double a,double b){
		width=a;
		height=b;
	}
	static double getArea(double width,double height){
		return width*height;
	}

	static double getPerimeter(double width,double height){
		return 2*(width+height);
	}
}

