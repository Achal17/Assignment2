//Write a program to demonstrate synchronized in thread

package Assignment2.Program3;

public class Thread1 implements Runnable {
	Number num;
	Thread1(Number num){
		this.num = num;
	}
	public void run() {
		num.display1();
	}
}
