package producerconsumer;

public class ConsumerThread  implements Runnable {

	private Factory factory;
	public ConsumerThread(Factory fact) {
		factory=fact;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(400);
				factory.cosume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	


}
