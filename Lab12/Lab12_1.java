
public class Lab12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] a=new GeometricObject[5];
		for(int i=0;i<5;i++) {
			a[i]=newShape();
			while(i>0&&a[i].getArea()<a[i-1].getArea())
				a[i]=newShape();
			a[i].display();
		}
	}
	public static GeometricObject newShape() {
        if(Math.random()<0.5)
            return new Circle(Math.random());
        else
            return new Triangle(Math.random()*2,Math.random()*2,Math.random()*2);

    }
}
