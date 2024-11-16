package Ex6_04;

public class Main {
    public static void main(String[] args) {
        // Create a MovablePoint instance
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Initial point: " + point);

        // Move the point
        point.moveUp();
        point.moveRight();
        System.out.println("Moved point: " + point);

        // Create a MovableCircle instance
        MovableCircle circle = new MovableCircle(2, 3, 4, 5, 10);
        System.out.println("Initial circle: " + circle);

        // Move the circle
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Moved circle: " + circle);
    }
}
