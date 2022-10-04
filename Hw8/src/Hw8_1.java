
public class Hw8_1 {

	public static void main(String[] args) {
		RegularPolygon r1=new RegularPolygon();
		RegularPolygon r2=new RegularPolygon(6, 4);
		RegularPolygon r3=new RegularPolygon(10 , 4, 5.6, 7.8);
		System.out.printf("Polygon 1 perimeter: %.1f\n",r1.getPerimeter());
		System.out.printf("Polygon 1 area: %f\n",r1.getArea());
		System.out.printf("Polygon 2 perimeter: %.1f\n",r2.getPerimeter());
		System.out.printf("Polygon 2 area: %f\n",r2.getArea());
		System.out.printf("Polygon 3 perimeter: %.1f\n",r3.getPerimeter());
		System.out.printf("Polygon 3 area: %f\n",r3.getArea());
	}

}
class RegularPolygon{
	int n=3;
	double side=1;
	double x=0,y=0;
	RegularPolygon(){
	}
	RegularPolygon(int m,double s){
		n=m;side=s;
	}
	RegularPolygon(int m,double s,double xx,double yy){
		n=m;side=s;x=xx;y=yy;
	}
	
	 double getPerimeter(){
		 return n*side;
	 }
	 double getArea(){
		 return ((n*side*side)/(4*Math.tan(Math.PI/n)));
	 }
}