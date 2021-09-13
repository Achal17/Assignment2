//Write a program to override run() and start() method of a runnable interface and create two threads of that class and run them accordingly also fetch the name of the threads

package Assignment2.Program9;

public class CreateThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
		try {Thread.sleep(1000);}
		catch(Exception e) {
			
		}
	}
}
