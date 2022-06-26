/*
This is the main method for the Line class
 */
package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class Line_Main {
    public static void main(String[] args){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 5);
         
        Line lin1 = new Line(p1, p2);
        Line lin2 = new Line(5, 1, 4, 2);
        
        System.out.println(lin1.toString());
        
        System.out.println();
        
        System.out.println("Slope of the line lin1: "+lin1.getSlope());
        
        System.out.println();
        
        System.out.println("given points collinearity with line: "+lin2.isCollinear(p1));
    }
}
