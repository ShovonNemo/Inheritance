package comm.code;

public class CheckingAccount extends BankAccount {

	private static final double FEE=0.15;
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(String name, double amount) {
		super(name, amount);
        super.setAccountNumber(getAccountNumber()+"-10");
	}

	@Override
	public boolean withdraw(double amount) {
		amount=amount+FEE;
		return super.withdraw(amount);
	}

	

}
