package question5;
public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sb2 = new StringBuilder("World");

        // StringBuffer is thread-safe
        new Thread(() -> {
            synchronized (sb) {
                sb.append(" Java");
            }
        }).start();

        // StringBuilder is not thread-safe
        new Thread(() -> sb2.append(" Java")).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("StringBuffer: " + sb); // Output: StringBuffer: Hello Java
        System.out.println("StringBuilder: " + sb2); // Output: StringBuilder: World Java
    }
}
