import java.util.ArrayList;
import java.util.List;

public class PrimeNumberMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		for(int i=2;i<=25;i++){
			l1.add(i);
			l2.add(25+i-1);
		}
		Thread t1 = new PrimeNumberThread(l1);
		t1.start();
		Thread t2 = new PrimeNumberThread(l2);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		System.out.println("Total Time is :- "+(endTime-startTime));
			
	}

}
