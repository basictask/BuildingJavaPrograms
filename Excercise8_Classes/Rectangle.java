/*
13
Write a class called Rectangle that represents a rectangular two-dimensional region.0
Your Rectangle objects should have the following methods:

public Rectangle(int x, int y, int width, int height)
Constructs a new Rectangle whose top-left corner is specified by the given coordinates and with the given width
and height . Throw an IllegalArgumentException on a negative width or height .

public int getHeight()
Returns this Rectangle ’s height.

public int getWidth()
Returns this Rectangle ’s width.

public int getX()
Returns this Rectangle ’s x-coordinate.

public int getY()
Returns this Rectangle ’s y-coordinate.

public String toString()
Returns a String representation of this Rectangle , such as "Rectangle[x=1, y=2, width=3, height=4]" .
 */

/*
14
Add the following constructor to your Rectangle class:
public Rectangle(Point p, int width, int height)
Construct a new Rectangle whose top-left corner is specified by the given Point and with the given width and
height.
*/

/*
15
Add the following methods to your Rectangle class:
public boolean contains(int x, int y)
public boolean contains(Point p)
Returns whether the given Point or coordinates lie inside the bounds of this Rectangle .
*/

/*
16
Add the following method to your Rectangle class:
public Rectangle union(Rectangle rect)
Returns a new Rectangle that represents the area occupied by the tightest bounding box that contains both this
Rectangle and the given other Rectangle .
*/

/*
17
Add the following method to your Rectangle class:
public Rectangle intersection(Rectangle rect)
Return a new Rectangle that represents the largest rectangular region completely contained within both this
Rectangle and the given other Rectangle. 
If the Rectangle s do not intersect at all, returns a Rectangle with width and height both equal to 0 .
*/
package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class Rectangle {
    private Point p;
    private int w;
    private int h;
    
    public Rectangle(int x, int y, int width, int height){
        this.p = new Point(x, y);
        this.w = width;
        this.h = height;
    }
    
    public int height(){
        return this.h;
    }
    
    public int width(){
        return this.w;
    }
    
    public int getX(){
        return p.getX();
    }
    
    public int getY(){
        return p.getY();
    }
    
    public String toString(){
        return "[X="+this.getX()+", y="+this.getY()+", width="+this.width()+", height="+this.height()+"]";
    }
    
    public Rectangle(Point p, int width, int height){
        this.p = p;
        this.w = width;
        this.h = height;
    }
    
    public boolean contains(int x, int y){
        if((this.p.getX() < x) && (x < this.p.getX()+this.w)){
            if((this.p.getY() > y) && (y > this.p.getY()-this.h)){
                return true;
            }
        }
        return false;
    }
    
    public boolean contains(Point p){
        if((this.p.getX() < p.getX()) && (p.getX() < this.p.getX()+this.w)){
            if((this.p.getY() > p.getY()) && (p.getY() > this.p.getY()-this.h)){
                return true;
            }
        }
        return false;
    }
    
    public Rectangle union(Rectangle rect){
        int x;
        int y;
        int w;
        int h;
        
        if(this.getX()<rect.getX()){
            x = this.getX();
        }else{
            x = rect.getX();
        }
        
        if(this.getY()>rect.getY()){
            y = this.getY();
        }else{
            y = rect.getY();
        }
        
        Point p = new Point(x, y);
        
        if ((this.getX()+this.width()) > rect.getX()+rect.width()){
            w = (this.getX() + this.width())-x;
        }else{
            w = (rect.getX() + rect.width())-x;
        }
        
        if((this.getY()-this.height() < rect.getY()-rect.height())){
            h = y - (y-this.getY());
        }else{
            h = y - (y-rect.getY());
        }
        
        Rectangle result = new Rectangle(x, y, w, h);
        
        return result;
    }
    
    public Rectangle intersection(Rectangle rect){
        int x;
        int y;
        int w;
        int h;
        if(this.getX()+this.width()>rect.getX()){
            x = rect.getX();
        }else if(rect.getX()+rect.width()>this.getX()){
            x = this.getX();
        }else{
            x = 0;
        }
        if(this.getY()-this.height()<rect.getY()){
            y = this.getY();
        }else if(rect.getY()-rect.height()<this.getY()){
            y = rect.getY();
        }else{
            y = 0;
        }
        if(this.getX()+this.width()<rect.getX()+rect.width()){
            w = this.getX()+this.width()-rect.getX();
        }else if(rect.getX()+rect.width()<this.getX()+this.width()){
            w = rect.getX()+rect.width()-this.getX();
        }else{
            w = 0;
        }
        if(this.getY()-this.height()<rect.getY()-rect.height()){
            h = this.getY()-(rect.getY()-rect.height());
        }else if(rect.getY()-rect.height()<this.getY()-rect.height()){
            h = rect.getY()-(this.height()-rect.height());
        }else{
            h = 0;
        }
        
        Rectangle result = new Rectangle(x, y, w, h);
        return result;
    }
}












