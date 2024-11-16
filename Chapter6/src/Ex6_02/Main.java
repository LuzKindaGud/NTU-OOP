package Ex6_02;

public class Main {
    public static void main(String[] args) {
        // Create a Ex6_01.Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Ex6_01.Circle area: " + circle.getArea());
        System.out.println("Ex6_01.Circle perimeter: " + circle.getPerimeter());

        // Create a Ex6_01.Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Ex6_01.Rectangle area: " + rectangle.getArea());
        System.out.println("Ex6_01.Rectangle perimeter: " + rectangle.getPerimeter());
    }
}