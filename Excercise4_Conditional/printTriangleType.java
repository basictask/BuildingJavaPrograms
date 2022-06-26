/*
 Write the method called printTriangleType referred to in Self-Check Problem 22. This method accepts three
integer arguments representing the lengths of the sides of a triangle and prints the type of triangle that these sides
form. Here are some sample calls to printTriangleType :
printTriangleType(5, 7, 7);
printTriangleType(6, 6, 6);
printTriangleType(5, 7, 8);
printTriangleType(2, 18, 2);
The output produced by these calls should be
isosceles
equilateral
scalene
isosceles

Your method should throw an IllegalArgumentException if passed invalid values, such as ones where one
side’s length is longer than the sum of the other two, which is impossible in a triangle. For example, the call of
printTriangleType(2, 18, 2); should throw an exception.
Write the method called printTriangleType referred to in Self-Check Problem 22.
 */
package Excercise4_Conditional;
import java.util.*;
public class printTriangleType {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Sides of the triangle: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        
        printTriangleType(a, b, c);
    }
    
    public static void printTriangleType(int a, int b, int c){
        
        if(((a+b)<c) || ((a+c)<b) || ((b+c)<a)){
            throw new IllegalArgumentException();
        }
        
        if((a == b) && (a == c)){
            System.out.println("equilateral");
        }else if((a == b) || (a == c) || (b == c)){
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
