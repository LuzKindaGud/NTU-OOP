package Ex4_05;

public class Square extends Rectangle {
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString() {
        return "Square[" + super.toString() + ",side=" + getWidth() + "]";
    }
}
