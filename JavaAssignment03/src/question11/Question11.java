package question11;

import java.util.List;

// Aggregation example
class Wheel {
    // code for Wheel class
}

class Car {
    List<Wheel> wheels; // aggregation relationship with Wheel class
    // code for Car class
}

// Composition example
class Engine {
    // code for Engine class
}

class Car {
    Engine engine; // composition relationship with Engine class
    // code for Car class
}
