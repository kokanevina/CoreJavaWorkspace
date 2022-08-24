package producerconsumer;

public class ProducerThread   implements Runnable{

	private Factory factory;
	public ProducerThread(Factory fact) {
		factory=fact;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
				factory.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
