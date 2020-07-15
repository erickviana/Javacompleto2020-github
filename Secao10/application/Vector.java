package application;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", average);
		

	}

}
