/*
This is the client program to the excercises of the 8.th chapter
 */
package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class Point_Main {
    public static void main(String[] args){
        
        Point p1 = new Point(4, 3);                     //initialize
        Point p2 = new Point(7, 2);
        Point p3 = new Point(10, 1);
        
        System.out.println("Manhattan distance from p2 to p1: "+p2.manhattan(p1));
        
        System.out.println();
        
        System.out.println("are the 2 points vertical? "+p1.isVertical(p3));
        
        System.out.println();
        
        System.out.println("slope between p1 and p2: "+p2.slope(p1));
    
        System.out.println();
        
        System.out.println("p1, p2, p3 collinearity: " + p1.isCollinear(p2, p3));
    }
}

