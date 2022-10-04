import java.util.Random;

public class Hw11_2 {

	public static void main(String[] args) {
		GeometricObject[] coll = new GeometricObject[5];
		for (int i = 0; i < coll.length; i++){
		coll[i] = newShape();
		coll[i].display();
		}

	}
	static GeometricObject newShape() {
		Random rand = new Random();
		int n = rand.nextInt(3);
		double l=rand.nextDouble(),m=rand.nextDouble(),o=rand.nextDouble();
		
		GeometricObject g;
		if(n==0) {
			g=new Circle(l,"red",true);
		}
		else if(n==1) {
			g=new Square(l,"red",true);
		}
		else {
			g=new Triangle(l,m,o,"red",true);
		}
		return g;
	}
}

