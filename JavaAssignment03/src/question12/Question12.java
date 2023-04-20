package question12;

public class Question12 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println(c.getArea());
	}
}
final class Circle {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public final double getArea() {
        return Math.PI * radius * radius;
    }
}
