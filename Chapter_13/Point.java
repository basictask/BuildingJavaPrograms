/*
1
Add the following method to the Point class:
public int manhattanDistance(Point other)
Returns the “Manhattan distance” between the current Point object and the given other Point object. 
The Manhattan distance refers to the distance between two places if one can travel between them,
only by moving horizontally or vertically, as though driving on the streets of Manhattan. 
In our case, the Manhattan distance is the sum of the absolute values of the differences in their coordinates; 
in other words, the difference in x plus the difference in y between the points.
 */

/*
2
Add the following method to the Point class:
public boolean isVertical(Point other)
Returns true if the given Point lines up vertically with this Point,
that is, if their x-coordinates are the same.
*/

/*

*/
package Chapter_13;

/**
 *
 * @author dani
 */
public class Point implements Comparable<Point>{
    private int x;
    private int y;
    
    public int compareTo(Point other){
        if(this.getY() != other.getY()){
            return this.getY() - other.getY();
        }else{
            return this.getX() - other.getX();
        }
    }
    
    public boolean equals(Object o){
        if(o instanceof Point){
            Point other = (Point) o;
            return x==other.x && y==other.y;
        }else{
            return false;
        }
    }
    
    public int manhattan(Point other){
        return Math.abs(this.x-other.x)+Math.abs(this.y-other.y);
    }
    
    public boolean isVertical(Point other){
        if(this.x == other.x){
            return true;
        }else{
            return false;
        }
    }
    
    public double slope(Point other){
        if(this.x == other.x){
            throw new IllegalArgumentException();
        }else{
            double a = other.y - this.y;
            double b = other.x - this.x;
            return a/b;
        }
    }
    
    public boolean isCollinear(Point p1, Point p2){
        if((this.x==p1.x) && (p1.x == p2.x)){
            return true;
        }else{
            double num1 = p1.x-this.x;
            double num2 = p1.y-this.y;
            double num3 = p2.x-this.x;
            double num4 = p2.y-this.y;
            double a = num1/num2;
            double b = num3/num4;
            if(a == b){
                return true;
            }
        }
        return false;
    }
    
    public Point(int x, int y){
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
