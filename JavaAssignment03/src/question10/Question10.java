package question10;

import java.io.IOException;

class SuperClass {
    void method() throws IOException, InterruptedException {
        // code that may throw IOException or InterruptedException
    }
}

class SubClass extends SuperClass {
    // this is allowed
    void method() throws IOException {
        // code that may throw IOException
    }
    
    // this is not allowed
    //void method() throws Exception {
    //    // code that may throw any checked exception
    //}
}
