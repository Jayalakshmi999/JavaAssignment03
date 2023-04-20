package question19;
class MyThread extends Thread {
    public void run() {
        
    }
}
public class Question19 {

	public static void main(String[] args) {
		class MyRunnable implements Runnable {
		    public void run() {
		        System.out.println("Thread started");
		    }
		}

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();



	}

}



