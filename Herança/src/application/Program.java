package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001 , "Alex", 0.0);	
		BusinessAcount bacc = new BusinessAcount(1002 , "Maria" , 0.0 , 500.0);
		
		
	// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003 , "Joao" , 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004 , "Anna" , 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(100.0);
		
		// BusinessAcount acc5 = (BusinessAcount)acc3;
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
