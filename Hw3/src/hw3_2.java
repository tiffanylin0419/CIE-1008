import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		float x1=input.nextFloat();
		float y1=input.nextFloat();
		float w1=input.nextFloat();
		float h1=input.nextFloat();
		float r1=x1+w1/2;
		float l1=x1-w1/2;
		float u1=y1+h1/2;
		float d1=y1-h1/2;
		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		float x2=input.nextFloat();
		float y2=input.nextFloat();
		float w2=input.nextFloat();
		float h2=input.nextFloat();
		float r2=x2+w2/2;
		float l2=x2-w2/2;
		float u2=y2+h2/2;
		float d2=y2-h2/2;
		if(r2<l1||r1<l2){
			if(d1>u2||d2>u1)
				System.out.print("r2 does not overlap r1");
			}
		else if(r2<=r1&&l1<=l2&&u2<=u1&&d2>=d1)
			System.out.print("r2 is inside r1");
		else if(r2>r1&&l1>l2&&u2>u1&&d2<d1)
			System.out.print("r1 is inside r2");
		else
			System.out.print("r2 overlaps r1");
	}

}
