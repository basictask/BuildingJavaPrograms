/*
This program implements the Shape class
 */
package Excercise9_O;

/**
 *
 * @author dani
 */
public class Rectangle implements Shape{
    private double width;
    private double height;
    
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    
    public double getArea(){
        return (this.width*this.height);
    }
    
    public double getW(){
        return this.width;
    }
    
    public double getH(){
        return this.height;
    }
    
    public boolean equals(Rectangle r){
        if(this.getW() == r.getW()){
            if(this.getH() == r.getH()){
                return true;
            }
        }
        if(this.getW() == r.getH()){
            if(this.getH() == r.getW()){
                return true;
            }
        }
        return false;
    }
}
