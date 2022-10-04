import java.util.Scanner;

public class Hw10_2 {

	public static void main(String[] args) {
		int i=0;
		Scanner input=new Scanner(System.in);
		String l=input.nextLine();
		l=l.toLowerCase();
		l=l.replaceAll("”","");
		l=l.replaceAll("“","");
		l=l.replaceAll("\\.","");
		l=l.replaceAll("-","");
		l=l.replaceAll(",","");
		String []a=l.split(" ");
		System.out.println("\nTotal words: "+a.length);
		ope o=new ope(a);
		for(;i<a.length;i++)
			if(o.unique(i))	
				System.out.println(a[i]+" "+o.count(i));
		
	}
	
}
class ope{
	int j=0;
	String[]a;
	ope(String[]a){
		this.a=a;
	}
	boolean unique(int i) {
		for(j=0;j<i;j++) 
			if(a[j].equals(a[i]))
				return false;
		return true;
	}
	int count(int i) {
		int n=1;
		for(j=i+1;j<a.length;j++) 
			if(a[j].equals(a[i]))
				n++;
		return n;
	}
	
	
}