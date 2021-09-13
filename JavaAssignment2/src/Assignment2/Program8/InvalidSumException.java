////Create a custom Exception class. You need to consider two integer inputs which must be supplied by the user. 
//You will display the sum of the integers if and only if the sum is less than 100.
//If it is not less than 100, throw your custom exception.

package Assignment2.Program8;

import java.util.Scanner;

public class InvalidSumException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		try {
			if(sum<100) {
				System.out.println("Sum is: "+sum);
			}
			else {
				throw new Custom_Exception("Sum is Grater than 100...");
			}
	}catch(Exception e) {
		System.out.println("Sum is Greater than 100...");
	}
	}
}

	
		