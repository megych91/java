package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	public String name;
	public String accountNumber;
	public double checkingBal = 0.00;
	public double savingsBal = 0.00;
	public double totalBalance = 0.00;
	
	private static Integer totalAccts = 0;
	
	public String generateAcctNum() {
		Random random = new Random();
		String randomAcctNum = "";
		for (int i = 0; i < 10; i++) {
			randomAcctNum += random.nextInt(10);
		}
		return randomAcctNum;
	}
	
// CREATE A NEW BANK ACCT \\
	public BankAccount(String name) {
		this.accountNumber = this.generateAcctNum();
		this.name = name;
		totalAccts++;
		System.out.println(this.name + "\'s new account number is: " + accountNumber + "\n");
		System.out.println("There\'s a total of: " + totalAccts + " account(s). \n");
	}
	
// CREATE A NEW BANK ACCT \\
	public BankAccount(String name, double checkingBal, double savingsBal) {
		this.accountNumber = this.generateAcctNum();
		this.name = name;
		this.checkingBal = setCheckingBal(checkingBal); 
		this.savingsBal = setSavingsBal(savingsBal); 
		totalAccts++;
		totalAccts++;
		totalBalance = (this.checkingBal + this.savingsBal);
		System.out.println(this.name + "\'s new account number is: " + accountNumber + "\n");
		System.out.println("There\'s a total of: " + totalAccts + " account(s). \n");
	}
// SET CHECKING BAL \\ 
	public double setCheckingBal(double amt) {
		this.checkingBal += amt; 
		this.totalBalance += amt;
		System.out.println("Checking Balance: " + checkingBal + "\n");
		return checkingBal;
	}
// SET SAVINGS BAL \\ 
	public double setSavingsBal(double amt) {
		this.savingsBal += amt; 
		this.totalBalance += amt;
		System.out.println("Savings Balance: " + savingsBal + "\n");
		return savingsBal;
	}
// GET CHECKING BAL \\ 
	public void getCheckingBal() {
		System.out.println(this.name + ", your current Checking Balance is: " + checkingBal + "\n");
		System.out.println(totalBalance + "\n");
	}
// GET SAVINGS BAL \\ 
	public void getSavingsBal() {
		System.out.println(this.name + ", your current Savings Balance is: " + savingsBal + "\n");
		System.out.println(totalBalance + "\n");
	}
// SET DEPOSIT BAL \\ 
	public double deposit(double depositAmt) {
		this.checkingBal += depositAmt; 
		this.totalBalance += depositAmt;
		System.out.println("Your have succesfully deposited: $" + depositAmt + " into your Checking Acct. \n");
		System.out.println("Your Checking Balance is now: " + checkingBal + "\n");
		System.out.println("Your Total Balance is now: " + totalBalance + "\n");
		return depositAmt;
	}
// SET WITHDRAW BAL \\ 
	public double withdraw(double withdrawAmt) {
		this.checkingBal -= withdrawAmt; 
		this.totalBalance -= withdrawAmt;
		this.totalBalance = (this.checkingBal + this.savingsBal);
		System.out.println("Your have succesfully withdrew: $" + withdrawAmt + " from your Checking Acct. \n");
		System.out.println("Your Checking Balance is now: " + checkingBal + "\n");
		System.out.println("Your Total Balance is now: " + totalBalance + "\n");
		return withdrawAmt;
	}
// GET TOTAL NUMBER OF ACCTS \\ 
	private static void accounts() {
		System.out.println("There are a total of: " + totalAccts + " accounts. \n");
	}
	
}
