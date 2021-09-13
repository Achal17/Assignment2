//Write a program to demonstrate synchronized in thread

package Assignment2.Program3;

public class Number {
	public synchronized void display1() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<10;i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	public synchronized void display2() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
