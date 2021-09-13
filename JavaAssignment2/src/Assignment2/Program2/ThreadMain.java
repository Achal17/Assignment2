//Write a program to ensure 3 threads are running in sequence

package Assignment2.Program2;

public class ThreadMain {
	public static void main(String[] args) {
		//First Thread 
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1);
		t1.start();
		
		//Second Thread
		Thread2 thread2 = new Thread2();
		Thread t2 = new Thread(thread2);
		t2.start();
		
		//Third Thread
		Thread3 thread3 = new Thread3();
		Thread t3 = new Thread(thread3);
		t3.start();
	}
}
