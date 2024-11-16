package Ex4_05;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape shape = new Shape("red", true);
        System.out.println(shape);

        // Test Circle
        Circle circle = new Circle("red", true, 1.0);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle("blue", false, 1.0, 2.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square("yellow", true, 3.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
