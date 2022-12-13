package entities;

public class Account {

	private int idAccount;
	private String holder;
	private double balance;
	
	public Account(int idAccount, String holder) {
		this.idAccount = idAccount;
		this.holder = holder;
	}

	public Account(int idAccount, String holder, double initDeposit) {
		this.idAccount = idAccount;
		this.holder = holder;
		deposit(initDeposit);
	}

	public int getIdAccount() {
		return idAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ idAccount
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
	
