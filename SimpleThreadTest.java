
public class SimpleThreadTest implements Runnable{

	@Override
	//public synchronized void run() {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running..");
		for(int i=0;i<5;i++){
			
			System.out.println("Thread "+i+" :- "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread completed....");
	}
	
	/*public void start(){
		System.out.println("Thread started..");
		run();
	}*/
	
	public static void main(String args[]){
		SimpleThreadTest s1 = new SimpleThreadTest();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main");
	}

}
