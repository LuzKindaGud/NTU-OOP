package Ex5_01;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {  // caller to construct the Points
        this.begin = new Point(begin.getX(), begin.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }

    public Point getBegin() {
        return new Point(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setBegin(Point begin) {
        this.begin = new Point(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
