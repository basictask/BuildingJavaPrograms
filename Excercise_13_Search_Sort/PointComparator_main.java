/*
Write a Comparator that compares Point objects by their distance from the origin of (0, 0). 
Points that are closer to the origin are considered to come before those which are further from the origin.
 */
package Excercise_13_Search_Sort;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class PointComparator_main {
    public static void main(String[] args){
        Point[] pts = {new Point(4, 3), new Point(2, 1), new Point(4, 4), new Point(1, 7), new Point(5, 2), 
            new Point(5, 5), new Point(9, 8), new Point(4, 3), new Point(6, 5), new Point(8, 3)};
        System.out.println("before sort: "+Arrays.toString(pts));
        
        System.out.println();
        Arrays.sort(pts, new PointComparator());
        System.out.println("after sort: "+Arrays.toString(pts));
    }
}
