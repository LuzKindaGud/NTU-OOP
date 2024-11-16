package Ex5_01;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l2.setBeginX(5);
        l2.setEndY(6);
        System.out.println(l2);
        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient: " + l2.getGradient());
    }
}
