package threads;
public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public static void main(String[] args) {
		ThreadedReverseGreeting he = new ThreadedReverseGreeting();
		he.thread(50);
	}
	public int thread(int i) {
		if(i==0) {
			return 0;
		} else {
			int x = i;
			Thread needle = new Thread(()->{
				Thread thread = new Thread(()->System.out.println("Hello from Thread "+x+"!"));
				thread.run();
			});
			needle.run();
			i--;
			return thread(i);
		}
		
	}
}
