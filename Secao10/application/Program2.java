package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductOrder;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		
		int n = sc.nextInt();
		ProductOrder[] vect = new ProductOrder[n];
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductOrder(name, price);
			sum += vect[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = %.2f%n", sum/vect.length);
		
		sc.close();
	}

}