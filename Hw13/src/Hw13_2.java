
public class Hw13_2 {
   public static void main(String[] args) {
	   GeometricObject[] geo = {
	   new Rectangle(3.4, 5.4),
	   new Rectangle(13.24, 55.4),
	   new Rectangle(7.4, 35.4),
	   new Rectangle(1.4, 25.4),
	   new Circle(5),
	   new Circle(2)
	   	};
	   java.util.Arrays.sort(geo);
	   for (int i = 0; i < geo.length; i++) {
		   System.out.print(geo[i] + " ");
		   System.out.println();
	   }
   } 
}