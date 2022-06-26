/*
Write a class named Octagon whose objects represent regular octagons (eight-sided polygons). 
Your class should implement the Shape interface defined in this chapter, including methods for its area and perimeter. 
An Octagon object is defined by its side length. 
(You may need to search online to find formulas for the area and perimeter of a regular octagon.)
 */

/**
 *
 * @author dani
 */
package Excercise9_O;

public class Octagon implements Shape{
    private double side;
    
    public Octagon(int side){
        this.side = side;
    }
    
    public double getArea(){
        double a = (2 * (1 + Math.sqrt(2))) * Math.pow(side, 2);
        return a;
    }
    
    public double getPerimeter(){
        return this.side*8;
    }
}
