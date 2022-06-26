/*
This is the main method to demonstrate interfaces we preiously set up in connection with shapes
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class ShapesMain {
    public static void main(String[] args){
        Shape[] shapes = {new Rectangle(4, 7), new Circle(5), new Triangle(6, 3, 5)};
        
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
