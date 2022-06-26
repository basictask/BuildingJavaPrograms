/*

 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.awt.*;
import java.util.*;

public class PointComparator implements Comparator<Point>{
    
    public int compare(Point p1, Point p2){
        int dx = p1.getX() - p2.getX();
        if(dx==0){
            int dy = p1.getY()-p2.getY();
            return dy;
        }else{
            return dx;
        }
    }
}
