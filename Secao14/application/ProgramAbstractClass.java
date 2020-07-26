package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAbstractClass {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		//roda a lista e pega o saldo de todas as contas do tipo Account.
		for (Account acc: list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		System.out.println();
		
		//fazer um deposito de 10,00 em cada conta.
		for(Account acc: list) {
			acc.deposit(10.0);
		}
		for(Account acc: list) {
		System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		//roda a lista e pega o saldo de todas as contas do tipo Account.
				for (Account acc: list) {
					sum += acc.getBalance();
				}
				System.out.println();
				System.out.printf("Total Balance: %.2f%n", sum);
	}
	
}
