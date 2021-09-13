//Write a program to ensure 3 threads are running in sequence

package Assignment2.Program2;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println("From Thread1....");
	}
	
}
