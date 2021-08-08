package Aug4;


public class ThreadExplore {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1=new Thread1();
		t1.start();
		synchronized (t1) {
			System.out.println("In Main Thread");
			t1.wait();
			System.out.println("Main thread notified");
			System.out.println(t1.t);
		}
	}
}
class Thread1 extends Thread{
	int t=0;
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				t=t+i;
				System.out.println("In thread1");
			}
			this.notify();
		}
	}
}