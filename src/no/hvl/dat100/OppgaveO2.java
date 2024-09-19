package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double annualIncome = 0.0;

		while (true) {

			System.out.print("Enter annual income in NOK: ");
			
			if (scanner.hasNextDouble()) {
				annualIncome = scanner.nextDouble();
				
				if (annualIncome >= 0) {
					break;
				} else {
					System.out.println("Income cant be negative. Try again.");
				}
			} else {
				System.out.println("Invalid dataType. Enter a number.");
				scanner.next();
			}
		}

		double[] incomeLimit = { 208050, 292850, 670000, 937900, 1350000 };
		double[] rate = { 0.017, 0.04, 0.136, 0.166, 0.176 };

		double calculatedTax = 0.0;

		if (annualIncome > incomeLimit[0]) {
			for (int i = 0; i < incomeLimit.length; i++) {
				if (annualIncome > incomeLimit[i]) {
					calculatedTax += (i == 0 ? 0 : incomeLimit[i] - incomeLimit[i - 1]) * rate[i];
				} else {
					calculatedTax += (annualIncome - (i == 0 ? 0 : incomeLimit[i - 1])) * rate[i];
					break;
				}
			}
		}

		double incomeAfterTax = (annualIncome - calculatedTax);

		System.out.printf("Total tax to be paid: %.2f NOK%n", calculatedTax);
		System.out.printf("Net income after taxes:  %.2f NOK%n", incomeAfterTax);
		scanner.close();
	}
}
