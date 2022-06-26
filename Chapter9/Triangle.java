/*
This program implements the Shape class
 */
package Chapter9;

/**
 *
 * @author dani
 */
public class Triangle implements Shape{
    private int a;
    private int b;
    private int c;
    
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getPerimeter(){
        return this.a+this.b+this.c;
    }
    
    public double getArea(){
        double s = this.getPerimeter()/2;
        return Math.sqrt(s * (s-this.a) * (s-this.b) * (s-this.c));
    }
}
