package producerconsumer;

public class Factory {

	private volatile boolean flag=false;
	private int product=0;
	public synchronized void produce() throws InterruptedException {
		String name=Thread.currentThread().getName();
	//	System.out.println(name+" is checking flag value "+flag);
		if(flag==true) {
		//	System.out.println(name+" waiting...........");
			wait();
		//	System.out.println(name+" came out of waiting...........");
		}
		product++;
		System.out.println("produced "+product);
		flag=true;
		notify();
	}
	public synchronized void cosume() throws InterruptedException {
		String name=Thread.currentThread().getName();
	//	System.out.println(name+" is checking flag value "+flag);
		if(flag==false) {
		//	System.out.println(name+" waiting...........");
			wait();
		//	System.out.println(name+" came out of waiting...........");
		}
		System.out.println("cosumed  "+product);
		flag=false;
		notify();
	}
	
}
