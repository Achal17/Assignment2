//Write a program to demonstrate synchronized in thread

package Assignment2.Program3;

public class Thread2 implements Runnable{
	Number num;
	Thread2(Number num){
		this.num = num;
	}
	public void run() {
		num.display2();
	}
}
