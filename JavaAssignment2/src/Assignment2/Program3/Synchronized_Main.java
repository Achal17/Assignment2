//Write a program to demonstrate synchronized in thread

package Assignment2.Program3;

public class Synchronized_Main {
public static void main(String[] args) {
	Number num = new Number();
	Thread1 thread1 = new Thread1(num);
	Thread2 thread2 = new Thread2(num);
	
	Thread t1 = new Thread(thread1);
	Thread t2 = new Thread(thread2);
	
	t1.start();
	t2.start();
}
}
