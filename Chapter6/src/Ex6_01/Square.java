package Ex6_01;

class Square extends Rectangle{
    protected double side =1.0;

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side,String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // Width and length are the same in a square
    }

    public void setSide(double side) {
        this.width = side; // Set both width and length
        this.length = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Ex6_01.Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
    }
}
