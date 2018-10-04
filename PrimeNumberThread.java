import java.util.List;

public class PrimeNumberThread extends Thread{

	private List<Integer> l1;
	PrimeNumberThread(List<Integer> l1){
		this.l1 = l1;
	}
	
	public void isPrime(Integer num){
		//System.out.println("Inside isPrime");
		boolean isP=true;
			
		for(int i=2;i<num;i++){
			if(num%i==0){
				isP=false;
				break;
			}
		}
		if(isP)
			System.out.println(num + " is PRIME");
		/*else
			System.out.println(num + " is NON-PRIME");*/
	}
	
	public void run(){
		System.out.println("Running thread");
		for(Integer tempList : this.l1){
			this.isPrime(tempList);
		}
		System.out.println("finished thread");
	}
}
