package WaysToDefineThread;

public class MyOwnThread extends Thread{
	
	//job of the thread
	public void run() {
		System.out.println("Inside child thread");
		System.out.println("Curent thread inside child class:-"+Thread.currentThread().getName());
	}
	
	
}
