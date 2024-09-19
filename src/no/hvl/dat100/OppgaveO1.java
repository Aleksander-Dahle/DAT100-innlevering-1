package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int pointSum = -1;

		int[] gradeLimits = { 90, 80, 70, 60, 50, 0 };
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		while (pointSum < 0 || pointSum > 100) {
			System.out.print("Enter pointSum (0-100): ");

			if (scanner.hasNextInt()) {
				pointSum = scanner.nextInt();

				if (pointSum < 0 || pointSum > 100) {
					System.out.println("Invalid pointSum. Enter a pointSum between 0 and 100");
				}
			} else {
				System.out.println("Invalid dataType");
				scanner.next();
			}
		}

		char grade = 'F';
		for (int i = 0; i < gradeLimits.length; i++) {
			if (pointSum >= gradeLimits[i]) {
				grade = grades[i];
				break;
			}
		}

		System.out.println("Grade: " + grade);

		scanner.close();

	}

}
