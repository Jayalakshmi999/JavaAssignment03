package question25;

import java.util.Arrays;
import java.util.List;

public class Question25 {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Mahesh", "Madhu", "Navya");
		s.sort((s1, s2) -> s1.compareTo(s2));	
		System.out.println(s); //lambda expressions	
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		int sum = num.stream()
		                .filter(n -> n % 2 == 0)
		                .mapToInt(Integer::intValue)
		                .sum();
		System.out.println(sum);//Streams		
		Calculator add = (a, b) -> a + b;
		Calculator subtract = (a, b) -> a - b;
		int r1 = add.calculate(2, 3); 
		int r2 = subtract.calculate(5, 3); 
		System.out.println("add: "+r1);
		System.out.println("subtract: "+r2);//Functional Interfaces		
		Car car = new Car();
		car.start(); 
		car.stop(); //Default methods
		List<String> strings = Arrays.asList("Alice", "Bob", "Charlie");
		strings.forEach(System.out::println);//Method References
	}
}
interface Calculator {
    int calculate(int a, int b);
}
interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}



