import java.util.ArrayList;

public class Hw12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("An ArrayList with ten Circle, Square or Triangle objects\n");
		
		ArrayList<GeometricObject> list = new ArrayList<GeometricObject> ();
		
		for(int i =0; i < 10;i++) {
			int j = (int)(Math.random()*3+1);
			switch(j){
			case 1:
				list.add(new Circle(Math.random()));
			case 2:
				list.add(new Triangle((Math.random()),(Math.random()),(Math.random())));
			case 3:
				list.add(new Square(Math.random()));
				}
		}
		for(int i =0; i <10; i++) {
			System.out.print(list.get(i).toString()+"\n");
			
		}
		System.out.println(" ");
		
		ArrayList<GeometricObject> list2 = new ArrayList<GeometricObject> ();
		for(int i =0; i < 10;i++) {
			int j = (int)(Math.random()*3+1);
			switch(j){
			case 1:
				list2.add(new Circle(Math.random()));
			case 2:
				list2.add(new Triangle((Math.random()),(Math.random()),(Math.random())));
			case 3:
				list2.add(new Square(Math.random()));
				}
		}
		for(int i =0; i <10; i++) {
			System.out.print(list2.get(i).toString()+"\n");
			
		}
		System.out.println("A modified ArrayList with the first Circle object removed");
	
	for(int i =0; i < 10;i++) {
		int j = (int)(Math.random()*3+1);
		switch(j){
		case 1:
			list2.add(new Circle(Math.random()));
		case 2:
			list2.add(new Triangle((Math.random()),(Math.random()),(Math.random())));
		case 3:
			list2.add(new Square(Math.random()));
			}
		
		if(j==1) {
			list2.remove(i);
			i = i-1;
		}
	}
		for(int i =0; i <10; i++) {
			System.out.print(list2.get(i).toString()+"\n");
			}
		
		System.out.println(" ");
		
		ArrayList<GeometricObject> list3 = new ArrayList<GeometricObject> ();
		for(int i =0; i < 10;i++) {
			int j = (int)(Math.random()*3+1);
			switch(j){
			case 1:
				list3.add(new Circle(Math.random()));
			case 2:
				list3.add(new Triangle((Math.random()),(Math.random()),(Math.random())));
			case 3:
				list3.add(new Square(Math.random()));
				}
		}	
		for(int i =0; i <10; i++) {
			System.out.print(list3.get(i).toString()+"\n");
		}
		System.out.println(" ");
		
		System.out.println("A modified ArrayList with all Circle objects removed");
		int s=10;
		for(int i =0; i < s;i++) {
			char c = list3.get(i).toString().charAt(0);
			if(c == 'C') {
				list3.remove(i);
				s--;
			}
}
	for(int i =0;i<s;i++) {
					System.out.print(list3.get(i).toString()+"\n");
		}
	}
}
	
	
	

