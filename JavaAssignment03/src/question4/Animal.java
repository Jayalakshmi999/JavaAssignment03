package question4;
public class Animal {
    public static void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    private void sleep() {
        System.out.println("The animal sleeps.");
    }
}

public class Cat extends Animal {
    // This is not an override of the static makeSound() method in Animal
    public static void makeSound() {
        System.out.println("Meow!");
    }

    // This will cause a compilation error
    // @Override
    // private void sleep() {
    //     System.out.println("The cat takes a nap.");
    // }
}
