import java.util.Scanner;
public class Hw8_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter the two points on the first line: ");
		 double x1 = input.nextDouble();
		 double y1 = input.nextDouble();
		 double x2 = input.nextDouble();
		 double y2 = input.nextDouble();
		 Line firstLine = new Line(x1, y1, x2, y2);
		 System.out.print("Enter the two points on the second line: ");
		 x1 = input.nextDouble();
		 y1 = input.nextDouble();
		 x2 = input.nextDouble();
		 y2 = input.nextDouble();
		 Line secondLine = new Line(x1, y1, x2, y2);
		 // Check for intersection and report the intersection point
		 if (firstLine.isIntersect(secondLine)) {
		 double[] point = firstLine.intersectPoint(secondLine);
		 System.out.println("The intersecting point is: (" + point[0]
		+ ", " + point[1] + ")");
		 }
		 else {
		 System.out.println("The two lines are parallel ");
		 }
		 input.close();
		 
	}

}
class Line{
	double x1, y1, x2, y2;
	Line(double x11,double y11,double x22,double y22){
		x1=x11;x2=x22;y1=y11;y2=y22;
	}
	
	
	 boolean isIntersect (Line a){
		 if((x1-x2)/(y1-y2)==(a.x1-a.x2)/(a.y1-a.y2))
			 return false;
		 return true;
	 }
	 double[] intersectPoint(Line a) {
		 LinearEquation l=new LinearEquation(y2-y1,-x2+x1,a.y2-a.y1,-a.x2+a.x1,(y2-y1)*x1+(-x2+x1)*y1,(a.y2-a.y1)*a.x1+(-a.x2+a.x1)*a.y1);
		 double [] ar= {l.getX(),l.getY()};
		 return ar;
	 }
}
