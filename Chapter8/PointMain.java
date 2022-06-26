/*
this program uses the Point class, there is no need to import the .awt package
 */
package Chapter8;

/**
 *
 * @author dani
 */
public class PointMain {
    public static void main(String[] args){
        
        Point p1 = new Point(7, 2);                     //initialize
        Point p2 = new Point(4, 3);    
        
        System.out.println(p1.toString());              //print
        System.out.println(p2.toString());
        
        System.out.println();
        
        p1.translate(4, -3);                            //translate
        p2.translate(2, 5);
        
        System.out.println(p1.toString());              //print
        System.out.println(p2.toString());
        
        System.out.println();
        
        System.out.println(p1.distanceFromOrigin());    //distance from (0, 0)
        System.out.println(p2.distanceFromOrigin());
        
    }
}

