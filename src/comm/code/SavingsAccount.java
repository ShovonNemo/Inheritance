package comm.code;

public class SavingsAccount extends BankAccount {

	private double rate=0.025;
	private static int savingsNumber=0;
	private String accountNumber=null;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber=super.getAccountNumber()+this.savingsNumber++;
	}

	public SavingsAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public SavingsAccount(int savingAccount, double initialBalance) {
		super();
	}

	public void postInterest() {
		this.setBalance(this.getBalance()+(this.getBalance()*rate));
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getSavingsNumber() {
		return savingsNumber;
	}

	public void setSavingsNumber(int savingsNumber) {
		this.savingsNumber = savingsNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	

}
