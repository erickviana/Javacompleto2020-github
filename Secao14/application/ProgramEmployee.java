package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OutsurcedEmployee;
import entities.Secao14Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Secao14Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//depois de ler os das precisamos instanciar uma variavel com esses dados.
				Secao14Employee emp = new OutsurcedEmployee(name, hours, valuePerHour, additionalCharge);
				//depois adicionamos esses dados na lista.
				list.add(emp);
			} else {
				//primeira forma de fazer como no exemplo anterior.
				//Secao14Employee emp = new Secao14Employee(name, hours, valuePerHour);
				
				//segunda forma de fazer sem precisar criar uma variavel (emp) no exemplo anterior.
				list.add(new Secao14Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Secao14Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
