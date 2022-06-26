/*
This is a main class for the Ticket objects
 */
package Excercise9_Inheritance_Interfaces;

/**
 *
 * @author dani
 */
public class Ticket_Main {
    public static void main(String[] args){
        WalkUp a = new WalkUp(0);
        Advance b = new Advance(1, 8);
        Advance c = new Advance(2, 12);
        StudentAdvance d = new StudentAdvance(3, 8);
        StudentAdvance e = new StudentAdvance(4, 12);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
    }
}