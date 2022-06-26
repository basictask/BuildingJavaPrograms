/*
This is the main method of the Rectangle class, Chapter 8 excercise.
 */
package Excercise8_Classes;

/**
 *
 * @author dani
 */
public class Rectangle_Main {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(1, 7, 5, 4);
        Point p1 = new Point(2, 8);
        Rectangle rect2 = new Rectangle(p1, 6, 7);
        Point p2 = new Point(4, 3);
        
        Rectangle rect3 = new Rectangle(4, 10, 6, 5);
        
        System.out.println("rect1 contains the given coordinates? "+rect1.contains(2, 4));
        
        System.out.println();
        
        System.out.println("rect2 contains p2? "+rect2.contains(p2));
        
        System.out.println();
        
        Rectangle union = rect2.union(rect3);
        System.out.print("union of two rectangles: ");
        System.out.println(union.toString());
        
        System.out.println();
        
        Rectangle intersection = rect2.intersection(rect3);
        System.out.print("intersection of two rectangles: ");
        System.out.println(intersection.toString());
    }
}
