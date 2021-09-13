//Write a program to ensure 3 threads are running in sequence

package Assignment2.Program2;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println("From Thread3....");
	}

}
