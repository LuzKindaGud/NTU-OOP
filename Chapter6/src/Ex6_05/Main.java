package Ex6_05;

public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());

        // Create a ResizableCircle object
        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println("Resizable circle perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Resizable circle area: " + resizableCircle.getArea());

        // Resize the ResizableCircle
        resizableCircle.resize(50);
        System.out.println("Resized circle perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Resized circle area: " + resizableCircle.getArea());

        // Create an array of ResizableCircles
        ResizableCircle[] resizableCircles = new ResizableCircle[3];
        resizableCircles[0] = new ResizableCircle(5.0);
        resizableCircles[1] = new ResizableCircle(10.0);
        resizableCircles[2] = new ResizableCircle(15.0);

        // Resize the array of ResizableCircles
        for (ResizableCircle rc : resizableCircles) {
            rc.resize(20);
        }

        // Print the resized circles
        for (ResizableCircle rc : resizableCircles) {
            System.out.println("Resized circle perimeter: " + rc.getPerimeter());
            System.out.println("Resized circle area: " + rc.getArea());
        }
    }
}
