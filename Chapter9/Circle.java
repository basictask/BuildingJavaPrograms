/*
This program implements the Shape class
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Circle implements Shape{
    private int radius;
    
    public Circle(int r){
        this.radius = r;
    }
    
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
