package question3;

class Animal {
   public Animal getAnimal() {
      return new Animal();
   }
}

class Dog extends Animal {
   @Override
   public Dog getAnimal() {
      return new Dog();
   }
}

