package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramSobreposicao {

	public static void main(String[] args) {
		
		//no saque da superclasse Account que é uma conta correte tem um desconto de 5 reais.
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//no saque da subclasse SavingsAccount que é uma poupaça não tem desconto.
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//no saque da subclasse BusinessAccount vai ser feito um saque
		//normal com um desconto de 5 reais herdado da conta corrente(superclasse)
		//com um adicional de 2 reais da conta juridica
				Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
				acc3.withdraw(200.0);
				System.out.println(acc3.getBalance());

	}

}
