package Ex4_04;

public class PointTestv2 {
    public static void main(String[] args) {
        // Test Point
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
        point.setX(3.0f);
        point.setY(4.0f);
        System.out.println("Updated Point: " + point);

        // Test MovablePoint
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("\nMovablePoint: " + movablePoint);
        System.out.println("X: " + movablePoint.getX());
        System.out.println("Y: " + movablePoint.getY());
        System.out.println("XSpeed: " + movablePoint.getXSpeed());
        System.out.println("YSpeed: " + movablePoint.getYSpeed());
        movablePoint.move();
        System.out.println("Moved MovablePoint: " + movablePoint);
    }
}
