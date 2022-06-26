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
3
Add the following method to the Point class:
public double slope(Point other)
Returns the slope of the line drawn between this Point and the given other Point .
Use the formula (y2 – y1) / (x2 – x1) to determine the slope between two points 
(x1, y1) and (x2, y2). 
Note that this formula fails for points with identical x-coordinates, 
so throw an IllegalArgumentException in this case.
*/

/*
4
Add the following method to the Point class:
public boolean isCollinear(Point p1, Point p2)
Returns whether this Point is collinear with the given two other Points.
Points are collinear if a straight line can be drawn that connects them. 
Two basic examples are three points that have the same x- or y-coordinate. 
The more general case can be determined by calculating the slope of the line between each pair of points, 
and checking whether this slope is the same for all pairs of points. 
Use the formula (y 2 – y 1 ) / (x 2 – x 1 ) to determine the slope between two points (x 1 , y 1 ) and (x 2 , y 2 ). 
(Note that this formula fails for points with identical x-coordinates so this will have to be a special case in your code.) 
Since Java’s double type is imprecise, round all slope values to a reasonable accuracy,
such asfour digits past the decimal point before you compare them.
*/
package Chapter9;

/**
 *
 * @author dani
 */
public class Point {
    private int x;
    private int y;
    
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
