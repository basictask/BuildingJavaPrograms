/*
Write a Comparator that compares Point objects by their distance from the origin of (0, 0). 
Points that are closer to the origin are considered to come before those which are further from the origin.
 */
package Excercise_13_Search_Sort;

/**
 *
 * @author dani
 */
import java.util.*;
public class PointComparator implements Comparator<Point>{
    public int compare(Point p1, Point p2){
        double h1 = Math.sqrt((Math.pow(p1.getX(), 2)+Math.sqrt(Math.pow(p1.getY(), 2))));
        double h2 = Math.sqrt((Math.pow(p2.getX(), 2)+Math.sqrt(Math.pow(p2.getY(), 2))));
        if(h1<h2){
            return -1;
        }else if(h1>h2){
            return 1;
        }else{
            return 0;
        }
    }
}
