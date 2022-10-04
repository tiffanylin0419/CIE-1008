
public class Box extends GraphicsObject implements Object3D{
	double width=1;
	double height=1;
	double length=1;
	
	Box(double width, double height, double length){
		this.width=width;
		this.height=height;
		this.length=length;
	}
	public double getVolume() {
		return width*height*length;
	}
	public String getName() {
		return"Name: Box; Area = "+getVolume();
	}
	@Override
	public String toString() {
	    return getName();
	}
}
