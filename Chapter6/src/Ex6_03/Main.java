package Ex6_03;

public class Main {
    public static void main(String[] args) {
        // Create a MovablePoint object
        MovablePoint point = new MovablePoint(5, 5, 1, 1);
        System.out.println("Initial position: " + point);

        // Move the point
        point.moveUp();
        point.moveRight();
        System.out.println("After moving up and right: " + point);

        point.moveDown();
        point.moveLeft();
        System.out.println("After moving down and left: " + point);
    }
}
