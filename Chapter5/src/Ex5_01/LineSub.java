package Ex5_01;

public class LineSub extends Point {
    private Point end;               // Ending point

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }

    public LineSub(Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = new Point(end.getX(), end.getY());
    }

    public String toString() {
        return "LineSub[begin=" + this + ",end=" + end + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setBegin(int x, int y) {
        setXY(x, y);
    }

    public void setEnd(int x, int y) {
        end.setXY(x, y);
    }

    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
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
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }
}