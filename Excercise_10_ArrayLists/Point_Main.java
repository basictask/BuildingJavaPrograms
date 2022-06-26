/*
Modify the Point class from Chapter 8 so that it defines a natural ordering,
by implementing the Comparable interface. Compare the Points by y-major order; 
that is, points with smaller y-coordinate values should come before
those with higher y-coordinate values. Break ties by comparing x-coordinate values.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class Point_Main {
    public static void main(String[] args){ 
        Point p1 = new Point(5, 6);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(5, 7);
        Point p4 = new Point(5, 8);
        Point p5 = new Point(2, 2);
        Point p6 = new Point(2, 2);
        
        System.out.println(p1.compareTo(p2));
        System.out.println(p3.compareTo(p4));
        System.out.println(p5.compareTo(p6));
     
    }
}
