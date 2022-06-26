/*
this is the main method for the incrementer class
 */
package Excercise9_O;

/**
 *
 * @author dani
 */
public class Incrementer_Main {
    public static void main(String[] args){
        SequentialIncrementer s = new SequentialIncrementer();
        RandomIncrementer r = new RandomIncrementer();
        
        s.increment();
        System.out.println(s.getValue());
        s.increment();
        System.out.println(s.getValue());
        s.increment();
        System.out.println(s.getValue());
        s.increment();
        System.out.println(s.getValue());
        s.increment();
        System.out.println(s.getValue());
        s.increment();
        System.out.println(s.getValue());
        
        System.out.println();
        
        r.Increment();
        System.out.println(r.getValue());
        r.Increment();
        System.out.println(r.getValue());
        r.Increment();
        System.out.println(r.getValue());
        r.Increment();
        System.out.println(r.getValue());
        r.Increment();
        System.out.println(r.getValue());
        r.Increment();
        System.out.println(r.getValue());        
    }
}
