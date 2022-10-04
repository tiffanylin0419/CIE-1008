
public class Hw6_2 {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.pow(n, 0.5);i++)
			if(n%i==0)
				return false;
		
		return true;
	}

	public static void main(String[] args) {
		System.out.print("Ten random numbers are: ");
		int []a= new int[10];
		int c=0;
		for(int i=0;i<10;i++) {
			a[i]=(int)(100*Math.random());
			System.out.print(a[i]+" ");
		}
		System.out.print("\nThe prime numbers in the list are: ");
		for(int i=0;i<10;i++) {
			if(isPrime(a[i])) {
			System.out.print(a[i]+" ");
			c++;
			}
		}
		
		System.out.print("\nThe number of prime numbers: "+c);
		
	}

}
