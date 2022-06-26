/*
Készítsünk programot, amellyel kör és téglalap kerületét lehet kiszámíttatni! A main() metódus kérdezze meg,
hogy kör vagy téglalap kerületét akarjuk számítani, 
majd kérje be a kör kerületének kiszámításához annak sugarát, 
téglalap esetén pedig a téglalap két oldalának hosszúságát! 
Az eredményt a main() metódus írja ki!
 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class formak {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("[circle/square] enter shape: ");
        String shape = getShape(console);
        System.out.println(info(shape, console));
    }
    
    public static String getShape(Scanner console){
        String shape = console.next();
        while(!(shape.equals("square") || shape.equals("circle"))){
            System.out.println("not found");
            System.out.print("[circle/square] enter shape: ");
            shape = console.next();
        }
        return shape;
    }
    
    public static double info(String s, Scanner console){
       if(s.equals("circle")){
           System.out.print("enter radius: ");
           int r = console.nextInt();
           System.out.print("perimeter: "); 
           return Math.pow(r, 2)*Math.PI;
       }else{
           System.out.print("enter side a: ");
           int a = console.nextInt();
           System.out.println("enter side b: ");
           int b = console.nextInt();
           return a*b;
       }
    }
}
