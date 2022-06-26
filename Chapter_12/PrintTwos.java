/*
the method takes an integer as a pararmeter, and prints out the number as a multiplication of 2 times an odd number
the odd number is in the middle, when possible.
 */
package Chapter_12;

/**
 *
 * @author dani
 */
public class PrintTwos {
    public static void main(String[] args){
        System.out.print("printTwos(80) = ");
        printTwos(80);
        System.out.println();
        System.out.print("printTwos(20) = ");
        printTwos(20);
        System.out.println();
        System.out.print("printTwos(5) = ");
        printTwos(5);
        System.out.println();
        System.out.print("printTwos(6) = ");
        printTwos(6);
        System.out.println();
        System.out.print("printTwos(2) = ");
        printTwos(2);
        System.out.println();
    }
    
    public static void printTwos(int n){
        if(n<1){
            throw new IllegalArgumentException();
        }else if(n % 4 == 0){
            System.out.print("2 * ");
            printTwos(n / 4);
            System.out.print(" * 2");
        }else if(n>=1){
            System.out.print("2 * " + n / 2);
        }else{
            System.out.print(n);
        }
    }
}
