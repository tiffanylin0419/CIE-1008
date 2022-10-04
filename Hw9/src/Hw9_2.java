
public class Hw9_2 {

	public static void main(String[] args) {
		double max=0;
		double min=200;
		int maxPoint=0;
		int minPoint=0;
		Point2D []p=new Point2D[5];
		for(int i=0;i<5;i++) {
			p[i]=new Point2D(Math.random()*10,Math.random()*10);
			System.out.printf("Point2D[%d] = (%f, %f); Distance = %f\n",i,p[i].getX(),p[i].getY(),p[i].distance());
			if(p[i].distance()>max) {
				max=p[i].distance();
				maxPoint=i;
			}
			if(p[i].distance()<min) {
				min=p[i].distance();
				minPoint=i;
			}
		}
		System.out.printf("The point with maximum distance to the original is Point2D[%d]\n",maxPoint);
		System.out.printf("The point with minimum distance to the original is Point2D[%d]\n",minPoint);
	}

}
class Point2D{
	private double x;
	private double y;
	Point2D(double x,double y){
		this.x=x;
		this.y=y;
	}
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	double distance(){
		return Math.pow(x*x+y*y, 0.5);
	}
}