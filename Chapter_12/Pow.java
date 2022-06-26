/*
this program calculates x on the power of y
 */
package Chapter_12;

/**
 *
 * @author dani
 */
public class Pow {
    public static void main(String[] args){
        System.out.println(pow(3,5));
    }
    
    public static int pow(int x, int y){
        if(y < 0){
            throw new IllegalArgumentException("not valid");
        }else if(y == 1){
            return x;
        }else if(y % 2 == 0){
            return pow(x*x, y/2);
        }else{
            return x*pow(x, y-1);
        }
    }
}