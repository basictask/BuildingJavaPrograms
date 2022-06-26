/*
this is a class to create and define points with x and y coordinates
 */
package Chapter8;

/**
 *
 * @author dani
 */
public class Point {
    private int x;
    private int y;
    
    public Point(int initialX, int initialY){
        setLocation(x, y);
    }
    
    public Point(){
        this(0, 0);
    }
    
    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y); 
    }
    
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
}
