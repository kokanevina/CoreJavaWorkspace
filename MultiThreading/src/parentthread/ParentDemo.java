package parentthread;

import childthreads.ChildThread1;

public class ParentDemo {
	// execution of main thread starts from main method 
	public static void main(String[] args) // root thread started from here
	{
		MathOperations op=new MathOperations();
		Thread mainthread=Thread.currentThread(); // currently executing thread object
		System.out.println(mainthread);// toString
		//Thread[main,5,main] 
		/* main : Thread Name : java name, setName
		 * 5 : priority : 1 to 10 : MIN_PRIORITY=1, MAX_PRIORITY=10, NORM_PRIORITY=5, setPriority
		 * main : thread group : we can  not change group of main thread
		 * ThreadGroup to assign group name to child threads
		 * 
		 * */
		mainthread.setPriority(Thread.MAX_PRIORITY-1); // 1 to 10
		System.out.println(mainthread.getPriority());
		mainthread.setName("root");
		System.out.println(mainthread.getName());
		System.out.println(mainthread);
		// parent created childs, priority and group name is inherited from parent thread
		ChildThread1 child1=new ChildThread1(); // child thread created
		child1.start();// thread started, call automatically goes to run
		// execution of child thread starts from run method
		System.out.println(child1);
		// like wise u can create more childs and start
		try {
			op.loop(3, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
