//Write a program to override run() and start() method of a runnable interface and create two threads of that class and run them accordingly also fetch the name of the threads

package Assignment2.Program9;

public class ThreadMain {
	public static void main(String[] args) {
		CreateThread thread1 = new CreateThread();
		Thread t1 = new Thread(thread1, "main1");
		t1.start();
		try{t1.join();}catch(Exception e) {}
		//Object of another thread
		CreateThread2 thread2 = new CreateThread2();
		Thread t2 = new Thread(thread2, "main2");
		t2.start();
		
	}
}
