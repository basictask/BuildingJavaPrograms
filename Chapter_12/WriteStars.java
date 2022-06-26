/*
this program demonstrates how recursion works
 */
package Chapter_12;

/**
 *
 * @author dani
 */
public class WriteStars {
    public static void main(String[] args){
        writestars(5);
    }
    
    public static void writestars(int n){
        if(n == 0){
            System.out.println();
        }else{
            System.out.print("*");
            writestars(n-1);
        }
    }
}
