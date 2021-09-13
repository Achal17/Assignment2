package Assignment2.Program5;

import java.util.Scanner;

public class Main_Generic {

	public static void main(String[] args) {
		GenericTest obj = new GenericTest();
		
		Integer x,y,z1,z2;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Integer..: ");
		x = sc1.nextInt();
		y = sc1.nextInt();
		z1 = obj.add(x, y);
		z2 = obj.mul(x, y);
		System.out.println("Sum of two integer is: "+z1);
		System.out.println("Multiplication of two integer is: "+z2);
		
		Long a,b,c1,c2;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Long..: ");
		a = sc2.nextLong();
		b = sc2.nextLong();
		c1 = obj.add(a, b);
		c2 = obj.mul(a, b);
		System.out.println("Sum of two Long is: "+c1);
		System.out.println("Multiplication of two Long is: "+c2);
		
		Float i,j,k1,k2;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Float..: ");
		i = sc3.nextFloat();
		j = sc3.nextFloat();
		k1 = obj.add(i, j);
		k2 = obj.mul(i, j);
		System.out.println("Sum of two Long is: "+k1);
		System.out.println("Multiplication of two Long is: "+k2);

	}

}
