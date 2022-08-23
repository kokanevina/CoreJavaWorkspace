package banking;

public class BankDemo {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		
		DepositThread dthread=new DepositThread();
		dthread.start(); // call automatically goes to run of DepositThread
		
		WithdrawThread wThread=new WithdrawThread();
		wThread.start(); // call automatically goes to run of WithdrawThread
	}
}
