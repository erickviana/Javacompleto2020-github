package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVectObj;

public class VectorObject {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVectObj[] vect = new ProductVectObj[n];
		double sum = 0;
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVectObj(name, price);
			sum += vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", average);
		
		sc.close();
	}

}
