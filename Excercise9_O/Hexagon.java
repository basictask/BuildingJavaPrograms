/*
Write a class named Hexagon whose objects represent regular hexagons (6-sided polygons). 
Your class should implement the Shape interface defined in this chapter.
 */
/**
 *
 * @author dani
 */
package Excercise9_O;

public class Hexagon implements Shape {
    private double side;
    
    public Hexagon(int side){
        this.side = side;
    }
    
    public double getArea(){        
        double a = ((3 * Math.sqrt(3)) / 2) * Math.pow(this.side, 2);
        return a;
    }
    
    public double getPerimeter(){
        return this.side*6;
    }
}
