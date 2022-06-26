package Excercise_12_Recursion;

/*
Write a recursive method called multiplyEvens that returns the product of the first n even integers. 
For example, multiplyEvens(1) returns 2 and multiplyEvens(4) returns 384 (because 2 * 4 * 6 * 8 = 384). 
The method should throw an IllegalArgumentException if it is passed a value less than or equal to 0.
 */

/**
 *
 * @author Y80L35
 */
public class MultiplyEvens {
    public static void main(String[] agrs){
        for(int i=1; i<6; i++){
            System.out.printf("multplyEvens(%d):  %d",i, multiplyEvens(i));
            System.out.println();
        }
    }
    
    public static int multiplyEvens(int n){
        if(n<1){
            throw new IllegalArgumentException("Illegal parameter");
        }else{
            int count = n*2;
            return mltply(n*2);
        }
    }
    
    private static int mltply(int n){
        if(n == 2){
            return n;
        }else{
            return n*mltply(n-2);
        }
    } 
}
