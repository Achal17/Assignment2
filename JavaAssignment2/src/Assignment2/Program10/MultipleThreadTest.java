//Write a program to creating multiple thread,  set priorities of threads, display all running thread and
//also create a method to stop a thread execution with ctrl+c

package Assignment2.Program10;

public class MultipleThreadTest {

	public static void main(String[] args) {
		ThreadTest thread1 = new ThreadTest("First Thread");
		thread1.start();
		
		try{thread1.join();}catch(Exception e) {}
		
		ThreadTest thread2 = new ThreadTest("Second Thread");
		thread2.start();
		
	}

}
//Blocker: Don't understand how to create a method to stop a thread execution with ctrl+c