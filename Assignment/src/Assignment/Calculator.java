package Assignment;

import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter second number");
		int b=scan.nextInt();
		
		
		int sum = Calculator.sum(a,b);
		System.out.println("The sum is " + sum);
		
		int subtract = Calculator.subtract(a,b);
		System.out.println("The substract is " + subtract);
		
		int multiplication = Calculator.multiplication(a,b);
		System.out.println("The multiplication is " + multiplication);
		
		int division = Calculator.division(a,b);
		System.out.println("The division is " + division);
		
	}
	
	public static int sum(int a ,int b) {
		int c=a+b;
		return c;
	}

	public static int subtract(int a ,int b) {
		int c=a-b;
		return c;
	}
	
	public static int multiplication(int a ,int b) {
		int c=a*b;
		return c;
	}
	
	public static int division(int a ,int b) {
		if (b==0) {
			  System.out.println("the answer is undefined");
			  return b;
	}
		int c=a/b;
		return c;
		
}
}
