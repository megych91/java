package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount meggie = new BankAccount("Meggie", 600.00, 200.00);
		meggie.getCheckingBal();
		meggie.getSavingsBal();
		meggie.deposit(500.00);
		meggie.withdraw(600.00);
	}
}
