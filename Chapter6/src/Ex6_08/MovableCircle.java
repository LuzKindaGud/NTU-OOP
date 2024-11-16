package Ex6_08;

import Ex6_03.MovablePoint;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return center.toString()+",radius="+radius;
    }
    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
       center.moveDown();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    public void moveRight(){
        center.moveRight();
    }
}
