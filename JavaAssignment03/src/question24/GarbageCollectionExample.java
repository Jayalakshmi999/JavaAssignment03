package question24;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Create some objects
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Set obj1 and obj2 to null to mark them for garbage collection
        obj1 = null;
        obj2 = null;

        // Call the garbage collector explicitly
        System.gc();

        // Sleep for a short time to give the garbage collector a chance to run
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
