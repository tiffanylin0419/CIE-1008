import java.util.Arrays;
public class Hw8_4 {

	public static void main(String[] args) {
		StopWatch t=new StopWatch();
		int []a=new int[100000];
		int []b=new int[1000000];
		int []c=new int[10000000];
		t.start();
		Arrays.sort(a);
		t.stop();
		System.out.println("The sort time for 100000 random numbers is "+t.getElapsedTime()+" milliseconds.");
		t.start();
		Arrays.sort(b);
		t.stop();
		System.out.println("The sort time for 100000 random numbers is "+t.getElapsedTime()+" milliseconds.");
		t.start();
		Arrays.sort(c);
		t.stop();
		System.out.println("The sort time for 100000 random numbers is "+t.getElapsedTime()+" milliseconds.");
	}

}
class StopWatch{
	 double endTime,startTime=System.currentTimeMillis();
	 StopWatch(){
		 
	 }
	 void start(){
		 startTime=System.currentTimeMillis();
		 return;
	 }
	 void stop() {
		 endTime=System.currentTimeMillis();
		 return;
	 }
	 double getElapsedTime() {
		 return endTime-startTime;
	 }
}