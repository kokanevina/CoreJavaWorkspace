package banking;

public class BankAccount {
	private long accountNum;
	private int custId;
	private String type;
	private double balance;
	
	
	public BankAccount() {
			accountNum=1111;
			custId=2222;
			type="Saving";
			balance=0;
	}
	
	public BankAccount(long accountNum, int custId, String type, double balance) {
		super();
		this.accountNum = accountNum;
		this.custId = custId;
		this.type = type;
		this.balance = balance;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", custId=" + custId + ", type=" + type + ", balance="
				+ balance + "]";
	}
	public double deposit(double amount)
	{
		balance=balance+amount;
		return balance;
	}
	
	public double withdraw(double amount)
	{
		balance=balance-amount;
		return balance;
	}
}
