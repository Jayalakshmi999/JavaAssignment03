package question2;
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    protected void eat() {
        System.out.println("The animal eats something.");
    }

    void move() {
        System.out.println("The animal moves around.");
    }

    private void sleep() {
        System.out.println("The animal sleeps.");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    protected void eat() {
        System.out.println("The cat eats fish.");
    }

    // This will cause a compilation error
    // @Override
    // void move() {
    //     System.out.println("The cat sneaks around.");
    // }

    // This will cause a compilation error
    // @Override
    // private void sleep() {
    //     System.out.println("The cat takes a nap.");
    // }
}
