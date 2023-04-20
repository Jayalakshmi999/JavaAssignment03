package question18;

public class Question18 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Thread started"));
		thread.start(); // starts the thread

		try {
		    Thread.sleep(1000); // wait for the thread to complete its execution
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		thread.start(); // try to start the same thread again

		// Output: Thread started
		// Exception in thread "main" java.lang.IllegalThreadStateException

	}

}
