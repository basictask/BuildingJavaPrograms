/*
This program implements the Shape class
 */
package Excercise9_O;

import Chapter9.*;

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
    
    public int getRadius(){
        return this.radius;
    }
    
    public boolean equals(Circle c){
        return this.getRadius() == c.getRadius();
    }
}
