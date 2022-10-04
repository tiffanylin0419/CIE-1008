
public class Hw6_3 {
	public static int count(int i,char[] a) {
		int s=0;
		for(int j=0;j<100;j++)
		if(a[j]==(char)i)
			s++;
		
		return s;

	}
	public static void main(String[] args) {
		System.out.println("The randomly generated lowercase letters are:");
		char []a= new char[100];
		int c=1;
		for(int i=0;i<100;i++,c++) {
			a[i]=(char)('a' + Math.random() * ((int)'z'- (int)'a' + 1 ));
			System.out.print(a[i]+" ");
			if(c%20==0)
				System.out.println(" ");
		}
		
		System.out.println("");
		
		for(int i=(int)'a';i<=(int)'z';i++) {
			System.out.print(count(i,a)+" "+(char)i+" ");
			if((i+1-(int)'a')%10==0)
				System.out.println("");
		}
	}
}
