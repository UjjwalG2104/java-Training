package day_4.recursion;

import java.util.Scanner;

public class factoraial {

	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative number");
		}
		if (n <= 1) return 1L;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		if (!sc.hasNextInt()) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Factorial is undefined for negative numbers");
			sc.close();
			return;
		}
		long result = factorial(n);
		System.out.println(n + "! = " + result);
		sc.close();
	}

}
