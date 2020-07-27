package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramTaxPayer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		double sum = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
		System.out.println("Tax payer #" + i + " data:");
		System.out.print("Individual or company (i/c)? ");
		char ch = sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Anual income: ");
		double anualIncome = sc.nextDouble();
		
		if(ch == 'i') {
			System.out.print("Health expenditures: ");
			double healthExpenditures = sc.nextDouble();
			
			TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
			list.add(taxPayer);
		}
		else {
			System.out.print("Number of employees: ");
			int numberOfEmployees = sc.nextInt();
			
			TaxPayer taxPayer = new Company(name, anualIncome, numberOfEmployees);
			list.add(taxPayer);
		}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp: list) {
			System.out.println(tp.getName()+": $ "+String.format("%.2f", tp.tax()));
		}
		
		for(TaxPayer tp: list) {
			sum += tp.tax();
		}
		System.out.println();
		System.out.println();
		System.out.printf("TOTAL TAXES: " + String.format("%.2f", sum));
		sc.close();
	}

}
