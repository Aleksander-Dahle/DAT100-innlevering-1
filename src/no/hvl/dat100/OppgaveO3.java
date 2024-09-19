package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");

		if (scanner.hasNextInt()) {
			int num = scanner.nextInt();

			System.out.println((num < 0) ? "Error! Only positive numbers are allowed." : "The factorial of " + num + " is " + calcFactorial(num) + ".");
		} else {
			System.out.println("Invalid input. enter a valid number.");
		}

		scanner.close();
	}

	public static long calcFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
}
