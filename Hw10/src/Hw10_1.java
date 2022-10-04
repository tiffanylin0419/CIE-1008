
public class Hw10_1 {

	public static void main(String[] args) {
		MyRectangle2D r1=new MyRectangle2D(2,2,5.5,4.9);
		System.out.println("Area is "+r1.getArea());
		System.out.printf("Perimeter is %.1f\n",r1.getPerimeter());
		System.out.println(r1.contains(3,3));
		System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.5)));
		System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
	}

}
class MyRectangle2D{
	double x=0,y=0;
	double width=1, height=1;
	MyRectangle2D(){}
	MyRectangle2D(double x,double y,double width,double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return 2*(width+height);
	}
	boolean contains(double a,double b) {
		if(a<x+width/2&&a>x-width/2&&b<y+height/2&&b>y-height/2)
			return true;
		return false;
	}
	boolean contains(MyRectangle2D r) {
		if(contains(r.x+r.width/2,r.y+r.height/2)&&contains(r.x-r.width/2,r.y+r.height/2)&&contains(r.x+r.width/2,r.y-r.height/2)&&contains(r.x-r.width/2,r.y-r.height/2))
			return true;
		return false;
	}
	boolean overlaps(MyRectangle2D r) {
		if(contains(r.x+r.width/2,r.y+r.height/2)||contains(r.x-r.width/2,r.y+r.height/2)||contains(r.x+r.width/2,r.y-r.height/2)||contains(r.x-r.width/2,r.y-r.height/2))
			return true;
		return false;
	}
	
}