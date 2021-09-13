//Write a program to creating multiple thread,  set priorities of threads, display all running thread and
//also create a method to stop a thread execution with ctrl+c

package Assignment2.Program10;

public class ThreadTest extends Thread {
	String name;
	ThreadTest(String name){
		this.name = name;
		System.out.println(name+" Created... ");
	}
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
		System.out.println(name+" is Running... ");
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("Thread "+name+" "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Exception occured in.. "+name);
		}
	}
}
//Blocker: Don't understand how to create a method to stop a thread execution with ctrl+c