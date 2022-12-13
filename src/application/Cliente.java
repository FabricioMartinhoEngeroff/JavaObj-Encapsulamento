package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Cliente {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
        Account account;
		
		System.out.print("Enter account number: ");
		int idAccount = sc.nextInt();
		System.out.print("Enter holder name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na intial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if ( response == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			double initDeposit = sc.nextDouble();
			account = new Account (idAccount, holder, initDeposit);
		}
		else { 
			account = new Account(idAccount,holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		sc.close();

	}

	}

