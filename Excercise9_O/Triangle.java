/*
This program implements the Shape class
 */
package Excercise9_O;

import Chapter9.*;

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
    
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    
    public boolean equals(Triangle t){
        if((this.a == t.a || this.a == t.b || this.a == t.c) == true){
            if((this.b == t.a || this.b == t.b || this.b == t.b) == true){
                if((this.c == t.a || this.c == t.b || this.c == t.c) == true){
                    return true;
                }
            }
        }
        return false;
    }
}
