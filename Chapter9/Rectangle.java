/*
This program implements the Shape class
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Rectangle implements Shape{
    private double width;
    private double height;
    
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    
    public double getArea(){
        return (this.width*this.height);
    }
}
