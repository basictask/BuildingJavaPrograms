/*
this program demonstrates comparing objects.
 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
public class Compares {
    public static void main(String[] args){
        String[] strings = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "Delta"};
        System.out.println("starting arrray: "+Arrays.toString(strings));
        
        System.out.println();
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("alphabetical case insensitive order: "+Arrays.toString(strings));
        
        System.out.println();
        Arrays.sort(strings, new LengthComparator());
        System.out.println("order by word length: "+Arrays.toString(strings));
        
        System.out.println();
        Point[] points = {new Point(4, -2), new Point(3, 9), new Point(-1, 15), new Point(3, 7)};
        System.out.println("unsorted Point array: "+Arrays.toString(points));
        System.out.println();
        Arrays.sort(points, new PointComparator());
        System.out.println("sorted Point array: "+Arrays.toString(points));
    }
}
