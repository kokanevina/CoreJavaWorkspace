package producerconsumer;

public class ProducerConsumerDemo {
		public static void main(String[] args) {
					Factory fact=new Factory();
					
					ThreadGroup tg=new ThreadGroup("factorythreads");
					
					Runnable r1=new ProducerThread(fact);
					Runnable r2=new ConsumerThread(fact);
					
					/*Thread class object*/
					Thread  pthread =new Thread(tg, r1);
					Thread cthread=new Thread(tg, r2);
					
					pthread.setName("Producer");
					cthread.setName("Consumer");
					System.out.println(pthread);
					System.out.println(cthread);
					/*Start a thread*/
					cthread.start();
					pthread.start();
		}
}
