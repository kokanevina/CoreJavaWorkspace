package childthreads;

import parentthread.MathOperations;

public class ChildThread1 extends Thread{

	public ChildThread1() {
	}
	@Override
	public void run() {
		Thread child=Thread.currentThread();
		System.out.println(child.getName()+" thread started");
		child.setName("child-1");
		child.setPriority(Thread.MIN_PRIORITY);
		System.out.println(child);
		/*if child thread want to create its child then put logic of creating , and starting a thread here*/
		
		
		
		MathOperations mop=new MathOperations();
		try {
			mop.loop(55,65);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
