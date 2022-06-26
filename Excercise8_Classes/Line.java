/*
9
Write a class called Line that represents a line segment between two Point s. 
Your Line objects should have thefollowing methods:
public Line(Point p1, Point p2) 
Constructs a new Line that contains the given two Point s.

public Point getP1()
Returns this Line ’s first endpoint.

public Point getP2()
Returns this Line ’s second endpoint.

public String toString()
Returns a String representation of this Line , such as "[(22, 3), (4, 7)]" .
 */

/*
10
Add the following method to your Line class:
public double getSlope() 
returns the slope of this Line. 
The slope of a line between points (x1, y1) and (x2, y2) is equal to (y2–y1)/(x2–x1).
If x2 equals x1, the denominator is zero and the slope is undefined, so you may throw an exception in this case.
*/

/*
11
Add the following constructor to your Line class:
public Line(int x1, int y1, int x2, int y2)
Constructs a new Line that contains the given two Points.
*/

/*
12
Add the following method to your Line class:
public boolean isCollinear(Point p)
Returns true if the given Point is collinear with the Point s of this Line —that is, if, when this Line is stretched
infinitely, it would eventually hit the given Point. Points are collinear if a straight line can be drawn that connects
them. Two basic examples are three points that have the same x- or y-coordinate. 
The more general case can bedetermined by calculating the slope of the line between each pair of points and checking whether 
this slope is the same for all pairs of points. 
Use the formula (y2–y1)/(x2–x1) to determine the slope between two points (x1, y1) and (x2, y2). 
(Note that this formula fails for points with identical x-coordinates, so this will have to be a special case in your code.) 
Since Java’s double type is imprecise, round all slope values to a reasonable accuracy,
such as four digits past the decimal point before you compare them.
*/

package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class Line {
    private Point p1;
    private Point p2;
    
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Point getP1(){
        return this.p1;
    }
    
    public Point getP2(){
        return this.p2;
    }
    
    public String toString(){
        return "["+p1.toString()+", "+p2.toString()+"]";
    }
    
    public double getSlope(){
        if(p1.getX()==p2.getX()){
            throw new IllegalArgumentException();
        }else{
            double a = this.p2.getY()-this.p1.getY();
            double b = this.p2.getX()-this.p1.getX();
            double slope = a/b;
            return slope;
        }            
    }
    
    public Line(int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    
    public boolean isCollinear(Point p){
        if((this.p1.getX() == this.p2.getX()) && (this.p1.getX() == p.getX())){
            return true;
        }else{
            double s1 = this.getSlope();        
            double a = p.getY()-this.p1.getY();
            double b = p.getX()-this.p1.getX();
            double s2 = a/b;        
            if(s1 == s2){
                return true;
            }else{
                return false;
            }
        }
    }
}
