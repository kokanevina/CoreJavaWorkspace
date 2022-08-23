package banking;

public class DepositThread extends Thread{
	BankAccount account;  // has-a 
	public DepositThread() {
		// TODO Auto-generated constructor stub
	}
	public DepositThread(BankAccount  account){
		this.account=account;
	}
	@Override
	public void run() {
		try {
				System.out.println(Thread.currentThread().getName()+" Thread started");
				// logic  // deposit is waiting till withdraw comes outs			
				for(int i=1;i<=2;i++) {
				   Thread.sleep(300);
					synchronized (account) { // account locked
					System.out.println("Balance before deposit:"+account.getBalance());
					account.deposit(4000); // method get auto synched
					System.out.println("Balance after deposit:"+account.getBalance());			
					}// account unlocked
					   Thread.sleep(100);
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Thread ended");
	}
}
