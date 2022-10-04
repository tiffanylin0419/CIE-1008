import java.util.Scanner;

public class Lab7_1 {
	public static String[] sortedWords(String[] b) {
		int n=b.length;
		String[] a=new String[n];
		for(int i=0;i<n;i++)
			a[i]=b[i];
		
		String temp;
		for (int i = n-1; i >0; i--)
			for(int j=0;j<i;j++)
				if(a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of words to proceed: ");
		int num = input.nextInt();
		String[] stringArray = new String[num];
		System.out.print("Enter the " + num + " words to be sorted: ");
		for (int i = 0; i < num; i++)
		stringArray[i] = input.next();
		// call the method you need to implement
		String[] sortedStringArray = sortedWords(stringArray);
		//
		System.out.print("Unsorting words are: ");
		for (int i = 0; i < num - 1; i++)
		System.out.print(stringArray[i] + " ");
		System.out.println(stringArray[num - 1]);
		System.out.print("Sorting words are: ");
		for (int i = 0; i < num - 1; i++)
		System.out.print(sortedStringArray[i] + " ");
		System.out.println(sortedStringArray[num - 1]);
		input.close();
	}

}
