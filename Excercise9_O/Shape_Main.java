/*
This is the main method to demonstrate interfaces we preiously set up in connection with shapes
 */
package Excercise9_O;

/**
 *
 * @author dani
 */
public class Shape_Main {
    public static void main(String[] args){
        
        Triangle t1 = new Triangle(2, 3, 4);
        Triangle t2 = new Triangle(4, 3, 2);
        
        System.out.println(t1.equals(t2));
        System.out.println();
        
        Rectangle r1 = new Rectangle(5,6);
        Rectangle r2 = new Rectangle(5,5);
        
        System.out.println(r1.equals(r2));
        System.out.println();
        
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        
        Shape[] shapes = {new Rectangle(4, 7), new Circle(5), new Triangle(6, 3, 5), new Hexagon(3), new Octagon(4)};
        
        for (int i = 0; i < shapes.length; i++) {
            printInfo(shapes[i]);
        }
    }
    
    public static void printInfo(Shape s){
        System.out.println("Area is: "+s.getArea());
        System.out.println("Perimeter is: "+s.getPerimeter());
        System.out.println();
    }
}
