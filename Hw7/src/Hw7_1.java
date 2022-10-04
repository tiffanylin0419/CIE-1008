import java.util.Scanner;

public class Hw7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//where you change your input
		int[] array = {5,4,3,2,1};
		int n=array.length;
		int temp;
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++)
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
			}
		}
		for(int j=0;j<n;j++)
			System.out.print(array[j]+" ");
	}

}
