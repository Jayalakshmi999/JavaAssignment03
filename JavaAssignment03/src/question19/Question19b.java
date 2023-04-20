package question19;

public class Question19b {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
class MyRunnable implements Runnable {
    public void run() {
    }
}


