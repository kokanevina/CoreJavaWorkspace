package parentthread;

public class MathOperations {

	public void loop(int start, int end) throws InterruptedException {
		Thread current=Thread.currentThread();
		for(int i=start;i<=end;i++) {
			System.out.println(current.getName()+" : "+i);
			if(current.getName().equals("root"))
					Thread.sleep(5000);
			else if(current.getName().equals("child-1"))
					Thread.sleep(1000);
			else 
					Thread.sleep(500);
		}
	}

}
